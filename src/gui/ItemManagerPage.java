package gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemManagerPage {

    private JFrame frame;
    private JPanel panel1, panel2, panel3, panel4;


    ItemManagerPage() {
        Border border = BorderFactory.createLineBorder(Color.white, 5);
        Border border1 = BorderFactory.createLineBorder(Color.black, 5);

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

        JLabel loggedInAs = new JLabel("Logged in as: ");
        loggedInAs.setOpaque(true); //displays background color
        loggedInAs.setBackground(Color.white);
        loggedInAs.setForeground(Color.black);
        loggedInAs.setBounds(20, 45, 300, 20);


        JLabel numOfItems = new JLabel("Number of Items Currently Renting: ");
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
