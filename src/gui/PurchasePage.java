package gui;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import database_access.CdAccess;
import database_access.MagazineAccess;
import database_access.NewsletterAccess;
import database_access.QueryUtilities;
import database_access.StudentAccess;
import gui.SubscriptionPage.ButtonRenderer;
import models.Items.PhysicalItems.PhysicalItem;
import models.Users.Student;
import models.Users.User;
import services.OverdueService;
import services.itemstrategy.ItemStrategy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class PurchasePage {
    private JFrame frame;
    private JPanel panel1, panel2, panel4;
    private JTable table1; // table1 relies on panel2
    User loggedInUser = SessionManager.getCurrentUser();
    QueryUtilities queryUtilities = new QueryUtilities();
    StudentAccess studentdb = StudentAccess.getInstance();
    Object[][] CDItems;
    ArrayList<PhysicalItem> items;
    CdAccess cddb = CdAccess.getInstance();
    MagazineAccess magdb = MagazineAccess.getInstance();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    User user;
    
    
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
    public PhysicalItem getCDByName(String name, ArrayList<PhysicalItem> items) {
        for (PhysicalItem item : items) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
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

                String cdName = table.getModel().getValueAt(currentRow, 0).toString();
                PhysicalItem cd = getCDByName(cdName, cddb.items);
                
                SwingUtilities.invokeLater(() -> {


                    if(cd != null){

                        PaymentPage pp = new PaymentPage(cd);
                        frame.dispose();
                        System.out.println("cd from purchase Page: "+cd);
                    }

                    
                });
                
                
                
               

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
    }

    PurchasePage() {
        SwingUtilities.invokeLater(() -> {
            try {

                if (loggedInUser != null) {
                    user = queryUtilities.getUser(loggedInUser.getId());
                    panel1 = new JPanel();
                    panel1.setBackground(new Color(175, 13, 11));
                    panel1.setBounds(0, 10, 1000, 100);

                    panel2 = new JPanel();
                    panel2.setBackground(new Color(225, 223, 220));
                    panel2.setBounds(0, 105, 1000, 450);

                    panel4 = new JPanel();
                    panel4.setBackground(new Color(104, 98, 96));
                    panel4.setBounds(0, 550, 1000, 100);

                    Border border = BorderFactory.createLineBorder(Color.white, 5);
                    Border border1 = BorderFactory.createLineBorder(Color.black, 5);

                    ImageIcon yu = new ImageIcon("../library/resources/images/profile.jpg");

                    JLabel yuLabel = new JLabel();
                    yuLabel.setIcon(yu);
                    yuLabel.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of image
                    yuLabel.setVerticalTextPosition(JLabel.TOP);

                    yuLabel.setIconTextGap(15);

                    yuLabel.setBounds(800, 0, 160, 160); // set x and y permanent position of the image
                    yuLabel.setFont(new Font("Arial", Font.BOLD, 16));
                    yuLabel.setVerticalAlignment(JLabel.TOP);
                    yuLabel.setHorizontalAlignment(JLabel.CENTER);
                    panel1.add(yuLabel);

                    frame = new JFrame(); // creates a frame
                    frame.setLayout(null); // display the frame
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(1500, 1500);
                    frame.setTitle("UserProfilePage");

                    frame.add(panel1);
                    frame.add(panel2);

                    frame.add(panel4);
                    panel1.setLayout(null);
                    panel2.setLayout(null);

                    panel4.setLayout(null);

                    JLabel userProfilePage = new JLabel("User Profile Page");
                    userProfilePage.setFont(new Font("Arial", Font.BOLD, 15));
                    // userProfilePage.setOpaque(true); //displays background color
                    userProfilePage.setBackground(Color.white);
                    userProfilePage.setForeground(Color.black);
                    userProfilePage.setBounds(90, 15, 300, 20);

                    JLabel loggedInAs = new JLabel("Logged in as: " + user.getName());
                    loggedInAs.setOpaque(true); // displays background color
                    loggedInAs.setBackground(Color.white);
                    loggedInAs.setForeground(Color.black);
                    loggedInAs.setBounds(20, 45, 300, 20);

                    JLabel numOfItems = new JLabel(
                            "Number of Items Currently Renting: " + user.getRented_item_list().size());
                    numOfItems.setOpaque(true); // displays background color
                    numOfItems.setBackground(Color.white);
                    numOfItems.setForeground(Color.black);
                    numOfItems.setBounds(20, 75, 300, 20);

                    panel1.add(userProfilePage);
                    panel1.add(loggedInAs);
                    panel1.add(numOfItems);

                    JButton registerButton = new JButton("Log Out");
                    registerButton.setBounds(600, 35, 200, 27);
                    panel4.add(registerButton);
                    registerButton.addActionListener(cancelListener);

                    JLabel ItemsTitle = new JLabel("Purchase Items");
                    ItemsTitle.setFont(new Font("Arial", Font.BOLD, 15));

                    ItemsTitle.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of image

                    ItemsTitle.setForeground(Color.black);
                    ItemsTitle.setBounds(350, 15, 300, 20);
                    panel2.add(ItemsTitle);

                    user = queryUtilities.getUser(loggedInUser.getId());
                    System.out.println("Overdue Charge: " + user.getOverdue_charge());// OVERDUE CHARGE WORKING NEED TO
                                                                                      // ADD TO GUI

                    CDItems = GuiUtilities.convertCD(cddb.items);
                    DefaultTableModel model = new DefaultTableModel(CDItems, GuiUtilities.cdColumn) {
                        public boolean isCellEditable(int row, int column) {
                            return column != 0; // Make only button columns editable.
                        }
                    };

                    table1 = new JTable(model);
                    table1.getColumnModel().getColumn(2).setCellRenderer(new ButtonRenderer());
                    table1.getColumnModel().getColumn(2).setCellEditor(new ButtonEditor(new JCheckBox()));
                    JScrollPane scrollPane = new JScrollPane(table1);
                    scrollPane.setBounds(30, 35, 940, 400);
                    panel2.add(scrollPane);
                    

                    JButton rentItems = new JButton("Back");
                    rentItems.setBounds(200, 35, 200, 27);
                    panel4.add(rentItems);
                    rentItems.addActionListener(itemmanager);

                   

                    frame.setVisible(true);

                }

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        });

    }

    ActionListener cancelListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            SessionManager.logout();
            LoginPage lp = new LoginPage();
        }
    };
    ActionListener itemmanager = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            ItemManagerPage ip = new ItemManagerPage();
        }
    };

}
