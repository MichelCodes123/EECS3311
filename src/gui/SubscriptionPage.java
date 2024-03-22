package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import database_access.NewsletterAccess;
import database_access.QueryUtilities;
import database_access.StudentAccess;
import models.Items.Newsletter;
import models.Users.Student;
import models.Users.User;
import services.newsletterstrategy.NewsletterCancellation;
import services.newsletterstrategy.NewsletterStrategy;
import services.newsletterstrategy.NewsletterSubscription;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class SubscriptionPage {
    QueryUtilities queryUtilities = new QueryUtilities();
    StudentAccess studentdb = StudentAccess.getInstance();
    User loggedInUser = SessionManager.getCurrentUser();
    NewsletterAccess newsdb = NewsletterAccess.getInstance();
    User user;
    NewsletterStrategy sub = new NewsletterSubscription();
    NewsletterStrategy unsub = new NewsletterCancellation();


    private JFrame frame;
    private JPanel panel1, panel2, panel3, panel4;

    SubscriptionPage() {
        SwingUtilities.invokeLater(() -> {
            try {
                User loggedInUser = SessionManager.getCurrentUser();
                if (loggedInUser != null) {
                    user = queryUtilities.getUser(loggedInUser.getId());
                    panel1 = new JPanel();
        panel1.setBackground(Color.white);
        panel1.setBounds(0, 0, 1000, 200);

        panel3 = new JPanel();
        panel3.setBackground(Color.gray);
        panel3.setBounds(0, 30, 1000, 520);

        panel4 = new JPanel();
        panel4.setBackground(Color.gray);
        panel4.setBounds(0, 550, 1000, 100);

        frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 1500);
        frame.setTitle("SubscriptionPage");

        frame.add(panel1);
       // frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        panel1.setLayout(null);
       // panel2.setLayout(null);
        panel3.setLayout(null);
        panel4.setLayout(null);

        JLabel newsletterSubscriptionPage = new JLabel("Newsletter Subscription Page");
        newsletterSubscriptionPage.setFont(new Font("Arial", Font.BOLD, 18));
        newsletterSubscriptionPage.setBackground(Color.white);
        newsletterSubscriptionPage.setForeground(Color.black);
        newsletterSubscriptionPage.setBounds(360, 162, 300, 20);

        JButton logOutButton = new JButton("Log Out");
        ActionListener lb = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                SessionManager.logout();
                LoginPage lp = new LoginPage();
            }
        };
     

        logOutButton.setBounds(600, 15, 200, 27);
        panel4.add(logOutButton);
        logOutButton.addActionListener(lb);

        

        JButton backButton = new JButton("Back");
        backButton.setBounds(200, 15, 200, 27);
       
        
    
        
    
        ActionListener bb = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                UserProfilePage up = new UserProfilePage();
            }
        };

        panel4.add(backButton);
        backButton.addActionListener(bb);

        panel1.add(newsletterSubscriptionPage);

        new Thread(() -> {
            try {
                SwingUtilities.invokeLater(() -> {
                    
                    System.out.println("News Size: " + newsdb.items.size());
                    
                    if(newsdb.items.size() > 0){
                        initSubscriptionsTable();
                        panel3.revalidate();
                        panel3.repaint();

                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

       

        frame.setVisible(true);




                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        
        
    }
    private void initSubscriptionsTable() {
        // Placeholder for subscription names. Ideally, you fetch these from `newsdb`.
        String[] columnNames = {"Name", "Subscribe/Unsubscribe", "View Newsletter"};
        Object[][] data = GuiUtilities.convertNews(newsdb.items);
               
        
        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            public boolean isCellEditable(int row, int column) {
                return column != 0; // Make only button columns editable.
            }
        };

        JTable subscriptionsTable = new JTable(model);

        subscriptionsTable.getColumnModel().getColumn(1).setCellRenderer(new ButtonRenderer());
        subscriptionsTable.getColumnModel().getColumn(1).setCellEditor(new ButtonEditor(new JCheckBox()));


        subscriptionsTable.getColumnModel().getColumn(2).setCellRenderer(new ButtonRenderer());
        subscriptionsTable.getColumnModel().getColumn(2).setCellEditor(new ButtonEditor(new JCheckBox()));

        JScrollPane scrollPane = new JScrollPane(subscriptionsTable);
        scrollPane.setBounds(30, 200, 940, 200);
        panel3.add(scrollPane);
    }

    class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value,
                                                       boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }

    
    class ButtonEditor extends DefaultCellEditor {
        protected JButton button;
        private String label;
        private boolean isPushed;
        private int currentRow;
        private int currentColumn;
        private JTable table;

        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);

            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(e -> {
                isPushed = false;
                if (currentColumn == 1) {
                    handleSubscription(currentRow);
                } else if (currentColumn == 2) {
                    
                    openNewsletter(currentRow);
                }
                fireEditingStopped();
            });
        }

        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            this.table = table;
            this.currentRow = row;
            this.currentColumn = column;
            if (isSelected) {
                button.setForeground(table.getSelectionForeground());
                button.setBackground(table.getSelectionBackground());
            } else {
                button.setForeground(table.getForeground());
                button.setBackground(table.getBackground());
            }
            label = (value == null) ? "" : value.toString();
            button.setText(label);
            isPushed = true;
            return button;
        }

        public Object getCellEditorValue() {
            isPushed = false;
            return label;
        }
        private void handleSubscription(int row) {
            String name = (String) table.getValueAt(row, 0);
            
            String link = newsdb.items.get(row).getLink();
            if(user.getSubscribed_newsletters().contains(link)){
                SwingUtilities.invokeLater(() -> {
                    try {
                        unsub.execute(link, user.getId());
                        user = queryUtilities.getUser(loggedInUser.getId());
                        
                        JOptionPane.showMessageDialog(button, "You have unsubscribed to " + name + ".");
                    } catch (Exception e2) {
        
                        e2.printStackTrace();
                    }
                });
            } else {
                SwingUtilities.invokeLater(() -> {
                    try {
                        sub.execute(link, user.getId());
                        user = queryUtilities.getUser(loggedInUser.getId());
                        
                        JOptionPane.showMessageDialog(button, "You have subscribed to " + name + ".");
                        
                    } catch (Exception e2) {
        
                        e2.printStackTrace();
                    }
                });
                
            
            }
        }
    
        
        private void openNewsletter(int row) {
            String name = (String) table.getValueAt(row, 0);
            String link = newsdb.items.get(row).getLink();
            
            SwingUtilities.invokeLater(() -> {
                try {
                    user = queryUtilities.getUser(loggedInUser.getId());
                    if(user.getSubscribed_newsletters().contains(link)){
                        try {
                            Desktop.getDesktop().browse(new URL(link).toURI());
                        } catch (IOException | URISyntaxException e) {
                            e.printStackTrace();
                        }
                    } else {
                        JOptionPane.showMessageDialog(button, "You must be subscribed to " + name + " to view the newsletter.");
                    }
                    
                } catch (Exception e2) {
    
                    e2.printStackTrace();
                }
            });
            
        }

    

}
}