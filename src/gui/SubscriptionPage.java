package gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubscriptionPage {

        private JFrame frame;
        private JPanel panel1, panel2, panel3, panel4;

    SubscriptionPage() {

//        Border border = BorderFactory.createLineBorder(Color.white, 5);
//        Border border1 = BorderFactory.createLineBorder(Color.black, 5);

        ImageIcon lms = new ImageIcon("../library/resources/images/sp1.jpg");

        panel1 = new JPanel();
         panel1.setBackground(Color.white);
        panel1.setBounds(0, 0, 1000, 200);


        panel2 = new JPanel();
        panel2.setBackground(Color.white);
        panel2.setBounds(0, 105, 1000, 100);

        panel3 = new JPanel();
        panel3.setBackground(Color.WHITE);
        panel3.setBounds(0, 30, 1000, 520);

        panel4 = new JPanel();
        panel4.setBackground(Color.WHITE);
        panel4.setBounds(0, 550, 1000, 100);

        JLabel yuLabel = new JLabel();
        yuLabel.setIcon(lms);
        yuLabel.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of image
        yuLabel.setVerticalTextPosition(JLabel.CENTER);
//          yuLabel.setForeground(Color.white);
        yuLabel.setIconTextGap(35);
//          yuLabel.setBackground(Color.black);
//        yuLabel.setOpaque(true); //displays background color
//         yuLabel.setBorder(border); //displays border
        yuLabel.setBounds(380, 0, 250, 200); //set x and y permanent position of the image
        yuLabel.setFont(new Font("Arial", Font.BOLD, 16));
        yuLabel.setVerticalAlignment(JLabel.CENTER);
        yuLabel.setHorizontalAlignment(JLabel.CENTER);
        panel1.add(yuLabel);

        frame = new JFrame(); // creates a frame
        frame.setLayout(null); // display the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 1500);
        frame.setTitle("SubscriptionPage");

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        panel4.setLayout(null);

        JLabel newsletterSubscriptionPage = new JLabel("Newsletter Subscription Page");
        newsletterSubscriptionPage.setFont(new Font("Arial", Font.BOLD, 18));
        //userProfilePage.setOpaque(true); //displays background color
        newsletterSubscriptionPage.setBackground(Color.white);
        newsletterSubscriptionPage.setForeground(Color.black);
        newsletterSubscriptionPage.setBounds(360, 162, 300, 20);

        JButton logOutButton = new JButton("Log Out");
        logOutButton.setBounds(700, 15, 200, 27);
        panel4.add(logOutButton);
        logOutButton.addActionListener(lb);

        JButton cancelSub = new JButton("Cancel Subscription");
        cancelSub.setBounds(100, 15, 200, 27);
        panel4.add(cancelSub);
        cancelSub.addActionListener(cb);

        JButton backButton = new JButton("Back");
        backButton.setBounds(400, 15, 200, 27);
        panel4.add(backButton);
        backButton.addActionListener(bb);


        panel1.add(newsletterSubscriptionPage);

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
            UserProfilePage up = new UserProfilePage();
        }
    };
    }
