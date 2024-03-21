package gui;

import javax.swing.*;

import database_access.QueryUtilities;
import models.Items.PhysicalItems.Cd;
import models.Items.PhysicalItems.PhysicalItem;
import models.Users.User;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class PaymentPage {
    User loggedInUser = SessionManager.getCurrentUser();
    QueryUtilities queryUtilities = new QueryUtilities();
    User user;

    private JFrame frame;
    private JPanel panel1, panel2, panel3, panel4;

     PaymentPage(PhysicalItem cd){
        try {
            user = queryUtilities.getUser(loggedInUser.getId());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
       
 

        ImageIcon lms = new ImageIcon("../library/resources/images/pay.jpg");

        panel1 = new JPanel();
        panel1.setBackground(Color.white);
        panel1.setBounds(0, 0, 1000, 200);


        panel2 = new JPanel();
        panel2.setBackground(Color.WHITE);
        panel2.setBounds(0, 105, 1000, 446);

//        panel3 = new JPanel();
//        panel3.setBackground(Color.WHITE);
//        panel3.setBounds(0, 30, 1000, 520);

        panel4 = new JPanel();
        panel4.setBackground(Color.white);
        panel4.setBounds(0, 550, 1000, 100);

        JLabel yuLabel = new JLabel();
        yuLabel.setIcon(lms);
//        yuLabel.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of image
//        yuLabel.setVerticalTextPosition(JLabel.CENTER);
//          yuLabel.setForeground(Color.white);
        yuLabel.setIconTextGap(35);
//          yuLabel.setBackground(Color.black);
//        yuLabel.setOpaque(true); //displays background color
//         yuLabel.setBorder(border); //displays border
        yuLabel.setBounds(350, 40, 900, 90); //set x and y permanent position of the image
        yuLabel.setFont(new Font("Arial", Font.BOLD, 16));
//        yuLabel.setVerticalAlignment(JLabel.CENTER);
//        yuLabel.setHorizontalAlignment(JLabel.CENTER);
        panel1.add(yuLabel);

        frame = new JFrame(); // creates a frame
        frame.setLayout(null); // display the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 1500);
        frame.setTitle("SubscriptionPage");

        frame.add(panel1);
        frame.add(panel2);
//        frame.add(panel3);
        frame.add(panel4);
        panel1.setLayout(null);
        panel2.setLayout(null);
//        panel3.setLayout(null);
        panel4.setLayout(null);

         JLabel userLabel = new JLabel("Total Amount: " + cd.getDollarAmount());
         userLabel.setOpaque(true); //displays background color
         userLabel.setBackground(Color.white);
         userLabel.setForeground(Color.black);
         userLabel.setBounds(30, 120, 90, 35);


         panel2.add(userLabel);


        JLabel newsletterSubscriptionPage = new JLabel("Payment Page");
        newsletterSubscriptionPage.setFont(new Font("Arial", Font.BOLD, 18));
        //userProfilePage.setOpaque(true); //displays background color
        newsletterSubscriptionPage.setBackground(Color.white);
        newsletterSubscriptionPage.setForeground(Color.black);
        newsletterSubscriptionPage.setBounds(430, 162, 300, 20);

        JButton logOutButton = new JButton("Log Out");
        logOutButton.setBounds(700, 15, 200, 27);
        panel4.add(logOutButton);
        logOutButton.addActionListener(lb);

        JButton cancelSub = new JButton("Cancel Purchase");
        cancelSub.setBounds(40, 15, 200, 27);
        panel4.add(cancelSub);
        cancelSub.addActionListener(cb);

         JButton confirmpurchase = new JButton("Confirm and Check Out");
         confirmpurchase.setBounds(260, 15, 200, 27);
         panel4.add(confirmpurchase);
         confirmpurchase.addActionListener(cc);

        JButton backButton = new JButton("Back");
        backButton.setBounds(480, 15, 200, 27);
        panel4.add(backButton);
        backButton.addActionListener(bb);

        panel1.add(newsletterSubscriptionPage);

         JLabel name = new JLabel("Name (as shown on Card)");
         name.setOpaque(true); //displays background color
         name.setBackground(Color.white);
         name.setForeground(Color.black);
         name.setBounds(30, 190, 150, 20);


         panel2.add(name);

         JTextField userNameText = new JTextField();
         userNameText.setForeground(Color.black);
         userNameText.setOpaque(true); //displays background color
         userNameText.setBackground(Color.white);
         userNameText.setBounds(200, 190, 300, 20);
         panel2.add(userNameText);

         JLabel cardnum = new JLabel("Card Number");
         cardnum.setOpaque(true); //displays background color
         cardnum.setBackground(Color.white);
         cardnum.setForeground(Color.black);
         cardnum.setBounds(30, 220, 150, 20);
         panel2.add(cardnum);

         JTextField cardnumber = new JTextField();
         cardnumber.setForeground(Color.black);
         cardnumber.setOpaque(true); //displays background color
         cardnumber.setBackground(Color.white);
         cardnumber.setBounds(200, 220, 300, 20);
         panel2.add(cardnumber);

         JLabel cvv = new JLabel("CVV");
         cvv.setOpaque(true); //displays background color
         cvv.setBackground(Color.white);
         cvv.setForeground(Color.black);
         cvv.setBounds(30, 250, 150, 20);
         panel2.add(cvv);

         JTextField cvvcode = new JTextField();
         cvvcode.setForeground(Color.black);
         cvvcode.setOpaque(true); //displays background color
         cvvcode.setBackground(Color.white);
         cvvcode.setBounds(200, 250, 300, 20);
         panel2.add(cvvcode);

         JLabel expdate = new JLabel("Expiration Date");
         expdate.setOpaque(true); //displays background color
         expdate.setBackground(Color.white);
         expdate.setForeground(Color.black);
         expdate.setBounds(30, 280, 150, 20);
         panel2.add(expdate);

         JTextField expiration = new JTextField();
         expiration.setForeground(Color.black);
         expiration.setOpaque(true); //displays background color
         expiration.setBackground(Color.white);
         expiration.setBounds(200, 280, 300, 20);
         panel2.add(expiration);


         frame.setVisible(true);
    }

    ActionListener lb = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            LoginPage lp = new LoginPage();
        }
    };
    ActionListener cb = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
//            SubscriptionPage sp = new SubscriptionPage();
        }
    };
    ActionListener bb = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            PurchasePage ip = new PurchasePage();
        }
    };

    ActionListener cc = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            user.getOverdue_charge();
            frame.dispose();
           // ItemManagerPage ip = new ItemManagerPage();
        }
    };
}
