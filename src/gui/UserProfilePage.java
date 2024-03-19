package gui;

import javax.swing.*;
import javax.swing.border.Border;

import database_access.QueryUtilities;
import database_access.StudentAccess;
import models.Items.PhysicalItems.PhysicalItem;
import models.Users.Student;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class UserProfilePage {
    private JFrame frame;
    private JPanel panel1, panel2, panel3, panel4;
    private JTable table1; //table1 relies on panel2
    Student student = SessionManager.getCurrentUser();
    QueryUtilities queryUtilities = new QueryUtilities();
    StudentAccess studentdb = StudentAccess.getInstance();
    Object[][] bookesRented;
    ArrayList<PhysicalItem> items;
    
    
   
    
    
    

    //private SystemManager systemManager;
    final String path = "../library/database/itemsCurrentlyRenting.csv";
    UserProfilePage(){
        try {
            System.out.println("Student: " + studentdb.users.get(0).getName());
            System.out.println("Student Database: "+studentdb.users.size());
        } catch (Exception e) {
            // TODO: handle exception
        }
        // if(studentdb.users.get(Integer.parseInt(student.getId())).getRented_item_list().size() > 0){
        //     SwingUtilities.invokeLater(()->{
        //         try {
        //             items = queryUtilities.getUserAssociatedItems(studentdb.users.get(Integer.parseInt(student.getId())));
        //             System.out.println("Query Util size: "+ items.size());
        //         } catch (Exception e) {
        //             // TODO Auto-generated catch block
        //             e.printStackTrace();
        //         }
            
        //     });
        // }


        panel1 = new JPanel();
        panel1.setBackground(new Color(175,13,11));
        panel1.setBounds(0, 10, 1000, 100);


        panel2 = new JPanel();
        panel2.setBackground(new Color(225,223,220));
        panel2.setBounds(0, 105, 1000, 240);

        panel3 = new JPanel();
        panel3.setBackground(new Color(183,174,169));
        panel3.setBounds(0, 320, 1000, 240);
        

        panel4 = new JPanel();
        panel4.setBackground(new Color(104,98,96));
        panel4.setBounds(0, 550, 1000, 100);

        Border border = BorderFactory.createLineBorder(Color.white, 5);
        Border border1 = BorderFactory.createLineBorder(Color.black, 5);

        ImageIcon yu = new ImageIcon("../library/resources/images/profile.jpg");

        JLabel yuLabel = new JLabel();
        yuLabel.setIcon(yu);
        yuLabel.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of image
        yuLabel.setVerticalTextPosition(JLabel.TOP);
      //  yuLabel.setForeground(Color.white);
        yuLabel.setIconTextGap(15);
      //  yuLabel.setBackground(Color.black);
        //yuLabel.setOpaque(true); //displays background color
       // yuLabel.setBorder(border); //displays border
        yuLabel.setBounds(800, 0, 160, 160); //set x and y permanent position of the image
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
        frame.add(panel3);
        frame.add(panel4);
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        panel4.setLayout(null);

        JLabel userProfilePage = new JLabel("User Profile Page");
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


        JLabel numOfItems = new JLabel("Number of Items Currently Renting: "+student.getRented_item_list().size());
        numOfItems.setOpaque(true); //displays background color
        numOfItems.setBackground(Color.white);
        numOfItems.setForeground(Color.black);
        numOfItems.setBounds(20, 75, 300, 20);

        panel1.add(userProfilePage);
        panel1.add(loggedInAs);
        panel1.add(numOfItems);

        JButton registerButton = new JButton("Log Out");
        registerButton.setBounds(750, 35, 200, 27);
        panel4.add(registerButton);
        registerButton.addActionListener(cancelListener);

        JLabel ItemsTitle = new JLabel("Items Currently Renting");
        ItemsTitle.setFont(new Font("Arial", Font.BOLD, 15));
        //userProfilePage.setOpaque(true); //displays background color
       ItemsTitle.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of image
        // ItemsTitle.setVerticalTextPosition(JLabel.CENTER);
       // ItemsTitle.setBackground(Color.white);
        ItemsTitle.setForeground(Color.black);
       ItemsTitle.setBounds(350, 15, 300, 20);
        panel2.add(ItemsTitle);

        JLabel coursesTaking = new JLabel("Courses Currently Taking/Teaching");
        coursesTaking.setFont(new Font("Arial", Font.BOLD, 15));
        //userProfilePage.setOpaque(true); //displays background color
        // ItemsTitle.setVerticalTextPosition(JLabel.CENTER);
        // ItemsTitle.setBackground(Color.white);
        coursesTaking.setForeground(Color.black);
        coursesTaking.setBounds(350, 35, 300, 20);
        panel3.add(coursesTaking);
        
        
        //TABLE
        //bookesRented = GuiUtilities.convertItemsToViewArray(items);
        // table1 = new JTable(bookesRented, GuiUtilities.viewColumn);
        // JScrollPane scrollPane = new JScrollPane(table1);
        // scrollPane.setBounds(30, 35, 940, 200); 
        // panel2.add(scrollPane);
        

        


        JButton rentItems = new JButton("Library System Page");
        rentItems.setBounds(400, 35, 200, 27);
        panel4.add(rentItems);
         rentItems.addActionListener(itemmanager);

        JButton subscribe = new JButton("Subscription System Page");
        subscribe.setBounds(100, 35, 200, 27);
        panel4.add(subscribe);
        subscribe.addActionListener(sub);


       



        frame.setVisible(true);

    }

    ActionListener cancelListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
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

    ActionListener sub = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            SubscriptionPage sp = new SubscriptionPage();
        }
    };
}
