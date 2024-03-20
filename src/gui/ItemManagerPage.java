package gui;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

import database_access.BookAccess;
import database_access.StudentAccess;
import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.PhysicalItem;
import models.Users.Student;
import models.Users.User;
import services.SearchingService;
import services.itemstrategy.ItemStrategy;
import services.itemstrategy.RentItem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class ItemManagerPage {
    
    //Student student = new Student("1", "John", "email", "password", true, 0.0, true, new java.util.ArrayList<String>());
    User loggedinUser = SessionManager.getCurrentUser();
    BookAccess bookdb = BookAccess.getInstance();
    StudentAccess studentdb = StudentAccess.getInstance();
    ItemStrategy strat = new RentItem();
    Student student = (Student) studentdb.users.get((int) Integer.parseInt(loggedinUser.getId()));
       
    private JFrame frame;
    private JPanel panel1, panel2, panel3, panel4;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Object[][] data;
    private Object selectedBookID;
    ArrayList<Book> results = new ArrayList<Book>();
    
    
    class ButtonRendererEditor extends AbstractCellEditor implements TableCellRenderer, TableCellEditor, ActionListener {
        JTable table;
        JButton renderButton;
        JButton editButton;
        String text;

        public ButtonRendererEditor(JTable table) {
            this.table = table;
            if(loggedinUser instanceof Student){
                renderButton = new JButton("Rent");
                editButton = new JButton("Rent");

            }
               
            
            editButton.setFocusPainted(false);
            editButton.addActionListener(this);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if(loggedinUser instanceof Student){
                Object bookId = table.getModel().getValueAt(row, 0);
                
                boolean canRent = student.getCan_borrow() && bookdb.items.get((int) Integer.parseInt((String)bookId)).getPurchasability();
                renderButton.setEnabled(canRent);
            }
            return renderButton;
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            text = (value == null) ? "" : value.toString();
            editButton.setText(text);
            return editButton;
        }

        @Override
        public Object getCellEditorValue() {
            return text;
        }

        @Override
       
    public void actionPerformed(ActionEvent e) {
        fireEditingStopped(); 

        int viewRow = table.getEditingRow();
        if (viewRow < 0) {
       
            viewRow = table.getSelectedRow();
        }

        if (viewRow < 0) {
          
            System.out.println("No valid row selected.");
            return;
        }

        
        int modelRow = table.convertRowIndexToModel(viewRow);

        
        selectedBookID = table.getModel().getValueAt(modelRow, 0); 
        System.out.println("Book ID: " + selectedBookID); 
        ItemStrategy rentItem = new RentItem();
       
            try {
                SwingUtilities.invokeLater(() -> {
                    try {
                        
                        System.out.println("StudentDB:"+studentdb.users.size());
                        if(student.getCan_borrow()){
                            
                            rentItem.execute((String)selectedBookID, student.getId());
                            studentdb.load();
                            
                        }
                        SwingUtilities.invokeLater(() -> {
                            try {
                                
                                Thread.sleep(1000);
                                System.out.println("Name of student"+ studentdb.users.get(0).getName());
                                System.out.println("Rented Itemlist Size "+ studentdb.users.get(0).getRented_item_list().size());
                                System.out.println("Rented Itemlist AFter "+  studentdb.users.get(0).getRented_item_list());
                            } catch (InterruptedException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                            }
                           
                        });
                        
                       
                    } catch (Exception e2) {
                        // TODO Auto-generated catch block
                        e2.printStackTrace();
                    }
                });
                
                
             
                
                
                
                
            } catch (Exception e1) {
                
                e1.printStackTrace();
            }
            
            
        

       
    }
    

    }
    
    


    ItemManagerPage() {
        
      
            SwingUtilities.invokeLater(() -> {


               
                
                System.out.println("Rented Itemlist Before "+ studentdb.users.get(0).getRented_item_list());
                System.out.println("Rented Itemlist Size Before "+ studentdb.users.get(0).getRented_item_list().size());

            });
        
        
        
        
        
        
       

       
        

        ImageIcon lms = new ImageIcon("../library/resources/images/lms2.jpg");


        panel1 = new JPanel();
        panel1.setBackground(new Color(175,13,11));
        panel1.setBounds(0, 10, 1000, 100);


        panel2 = new JPanel();
        panel2.setBackground(new Color(225,223,220));
        panel2.setBounds(0, 105, 1000, 100);

        panel3 = new JPanel();
        panel3.setBackground(new Color(183,174,169));
        panel3.setBounds(0, 30, 1000, 520);
       
       

        panel4 = new JPanel();
        panel4.setBackground(new Color(104,98,96));
        panel4.setBounds(0, 550, 1000, 100);

        JButton searchtab = new JButton("Search");
        searchtab.setBounds(370, 59, 200, 27);
        panel2.add(searchtab);
        // rentItems.addActionListener(cancelListener);

        JButton openOnlineBookButton = new JButton("Open Online Book");
        openOnlineBookButton.setBounds(380, 35, 200, 27);
        panel4.add(openOnlineBookButton);
        // openOnlineBookButton.addActionListener(cancelListener);

        JButton proceedCheckout = new JButton("Proceed to Checkout");
        proceedCheckout.setBounds(80, 35, 200, 27);
        panel4.add(proceedCheckout);
         proceedCheckout.addActionListener(pp);

        JButton SubToNews = new JButton("Subscribe to Newsletter");
        SubToNews.setBounds(680, 35, 200, 27);
        panel4.add(SubToNews);
        SubToNews.addActionListener(sub);

        JButton rentItems = new JButton("Rent");

        JLabel yuLabel = new JLabel();
        yuLabel.setIcon(lms);
        yuLabel.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of image
        yuLabel.setVerticalTextPosition(JLabel.CENTER);
//          yuLabel.setForeground(Color.white);
        yuLabel.setIconTextGap(35);
//          yuLabel.setBackground(Color.black);
//        yuLabel.setOpaque(true); //displays background color
//         yuLabel.setBorder(border); //displays border
        yuLabel.setBounds(380, 0, 250, 100); //set x and y permanent position of the image
        yuLabel.setFont(new Font("Arial", Font.BOLD, 16));
        yuLabel.setVerticalAlignment(JLabel.CENTER);
        yuLabel.setHorizontalAlignment(JLabel.CENTER);
        panel1.add(yuLabel);

        frame = new JFrame(); // creates a frame
        frame.setLayout(null); // display the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 1500);
        frame.setTitle("ItemManagerPage");


        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        panel4.setLayout(null);


      
    

        JLabel userProfilePage = new JLabel("Item Management Page");
        userProfilePage.setFont(new Font("Arial", Font.BOLD, 15));
        //userProfilePage.setOpaque(true); //displays background color
        userProfilePage.setBackground(Color.white);
        userProfilePage.setForeground(Color.black);
        userProfilePage.setBounds(90, 15, 300, 20);

        JLabel loggedInAs = new JLabel("Logged in as: "+student.getName());
        loggedInAs.setOpaque(true); //displays background color
        loggedInAs.setBackground(Color.white);
        loggedInAs.setForeground(Color.black);
        loggedInAs.setBounds(20, 45, 300, 20);


        JLabel numOfItems = new JLabel("Number of Items Currently Renting: "+ student.getRented_item_list().size());
        numOfItems.setOpaque(true); //displays background color
        numOfItems.setBackground(Color.white);
        numOfItems.setForeground(Color.black);
        numOfItems.setBounds(20, 75, 300, 20);

        JButton logOutButton = new JButton("Log Out");
        logOutButton.setBounds(750, 15, 200, 27);
        panel1.add(logOutButton);
        logOutButton.addActionListener(cancelListener);

        JButton registerButton = new JButton("Back");
        registerButton.setBounds(750, 55, 200, 27);
        panel1.add(registerButton);
        registerButton.addActionListener(userProfile);

        panel1.add(userProfilePage);
        panel1.add(loggedInAs);
        panel1.add(numOfItems);

        JTextField userNameText = new JTextField();
        userNameText.setForeground(Color.black);
        userNameText.setOpaque(true); //displays background color
        userNameText.setBackground(Color.white);
        userNameText.setBounds(300, 20, 350, 30);
        panel2.add(userNameText);
        
        
        
        
        
        DefaultTableModel model = new DefaultTableModel(data, GuiUtilities.rentColumn) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Make only the "Purchase" column editable which should contain the button.
                return column == 5;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return (columnIndex == 5) ? JButton.class : super.getColumnClass(columnIndex);
            }
        };
        JTable jt = new JTable(model);
        ButtonRendererEditor buttonRendererEditor = new ButtonRendererEditor(jt);
        jt.getColumn("Purchase").setCellRenderer(buttonRendererEditor);
        jt.getColumn("Purchase").setCellEditor(buttonRendererEditor);
        JScrollPane sp = new JScrollPane(jt);
        sp.setBounds(30, 175, 940, 350); // Set the size and position inside panel3
        panel3.add(sp);
        
        searchtab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String query = userNameText.getText().trim();
                try {
                    
                    results = SearchingService.search(query); 
        
                    
                    synchronized (results) {
                        results.wait(1000); 
                        // Update the data for the table model
                        Object[][] updatedData = GuiUtilities.convertItemsToRentArray(results);
                       
                        DefaultTableModel newModel = new DefaultTableModel(updatedData, GuiUtilities.rentColumn) {
                            @Override
                            public boolean isCellEditable(int row, int column) {
                                // Only the last column is editable, which contains the button.
                                return column == this.getColumnCount() - 1;
                            }
                        
                            @Override
                            public Class<?> getColumnClass(int columnIndex) {
                                // Ensure the last column is identified as containing a JButton.
                                if (columnIndex == this.getColumnCount() - 1) {
                                    return JButton.class;
                                } else {
                                    return super.getColumnClass(columnIndex);
                                }
                            }
                        };
                        
        
                        // Update the table model on the Swing thread
                        SwingUtilities.invokeLater(() -> {
                            jt.setModel(newModel);
                            ButtonRendererEditor buttonRendererEditor = new ButtonRendererEditor(jt);
                            jt.getColumnModel().getColumn(newModel.getColumnCount() - 1).setCellRenderer(buttonRendererEditor);
                            jt.getColumnModel().getColumn(newModel.getColumnCount() - 1).setCellEditor(buttonRendererEditor);
                            jt.revalidate();
                            jt.repaint();
                            
                        });
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }

        
        });
        
        
        
        

       


        frame.setVisible(true);

    }

    ActionListener cancelListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
           
            LoginPage lp = new LoginPage();
        }
    };
    ActionListener userProfile = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           
            frame.dispose();
            UserProfilePage up = new UserProfilePage();
        }
    };

    ActionListener sub = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            SubscriptionPage sp = new SubscriptionPage();
        }
    };
    ActionListener pp = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            PaymentPage pp = new PaymentPage();
        }
    };
    
    }
