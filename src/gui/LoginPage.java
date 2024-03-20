package gui;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import controllers.LoginController;
import database_access.QueryUtilities;
import database_access.StudentAccess;
import models.Items.Item;
import models.Users.User;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {
    private JFrame frame;
    private JPanel panel1, panel2;
    QueryUtilities queryUtilities = new QueryUtilities();

    LoginPage() {

        Border border = BorderFactory.createLineBorder(Color.white, 5);
        Border border1 = BorderFactory.createLineBorder(Color.black, 5);

        ImageIcon logo = new ImageIcon("../library/resources/images/logo.jpg");

        panel1 = new JPanel();
        panel1.setBackground(Color.white);
        panel1.setBounds(0, 0, 1000, 350);

        panel2 = new JPanel();
        panel2.setBackground(Color.lightGray);
        panel2.setBounds(0, 360, 1000, 300);
        //logo.setLayout(null);

        frame = new JFrame(); // creates a frame

        frame.setLayout(null); // display the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 1500);
        frame.setTitle("Login Page");

        frame.add(panel1);
        frame.add(panel2);
        //panel1.setLayout(null);
        panel2.setLayout(null);


        JLabel logoLabel = new JLabel();
        logoLabel.setText(" YorkU Library Management"); //set text of label
        logoLabel.setIcon(logo);
        logoLabel.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of image
        logoLabel.setVerticalTextPosition(JLabel.TOP);
        logoLabel.setForeground(Color.white);
        logoLabel.setIconTextGap(15);
        logoLabel.setBackground(Color.black);
        logoLabel.setOpaque(true); //displays background color
        logoLabel.setBorder(border); //displays border
        logoLabel.setBounds(200, 50, 400, 300); //set x and y permanent position of the image
        logoLabel.setFont(new Font("Arial", Font.BOLD, 16));
        logoLabel.setVerticalAlignment(JLabel.TOP);
        logoLabel.setHorizontalAlignment(JLabel.CENTER);
        panel1.add(logoLabel);


        JLabel userLabel = new JLabel("Email");
        userLabel.setOpaque(true); //displays background color
        userLabel.setBackground(Color.white);
        userLabel.setForeground(Color.black);
        userLabel.setBounds(400, 30, 80, 20);


        panel2.add(userLabel);

        JTextField email = new JTextField();
        email.setForeground(Color.black);
        email.setOpaque(true); //displays background color
        email.setBackground(Color.white);
        email.setBounds(500, 30, 80, 20);
        panel2.add(email);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setOpaque(true); //displays background color
        passwordLabel.setBackground(Color.white);
        passwordLabel.setForeground(Color.black);
        passwordLabel.setBounds(400, 70, 80, 20);
        panel2.add(passwordLabel);

        JTextField passwordText = new JPasswordField();
        passwordText.setForeground(Color.black);
        passwordText.setOpaque(true); //displays background color
        passwordText.setBackground(Color.white);
        passwordText.setBounds(500, 70, 80, 20);
        panel2.add(passwordText);

        JButton userButton = new JButton("Login");
        userButton.setBounds(380, 140, 100, 25);
        panel2.add(userButton);
        userButton.addActionListener(e -> {
           String email_address =  email.getText();
           String password = passwordText.getText();
           Boolean successful_login = LoginController.logIn(email_address, password);

           if (successful_login) {
                SwingUtilities.invokeLater(() -> {
                    try {
                        User user = queryUtilities.getUserByEmail(email_address);
                        System.out.println(user.getName());
                        SessionManager.login(user);
                        frame.dispose();
                    } catch (Exception e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                });
                
            
                //frame.dispose();
                UserProfilePage up = new UserProfilePage();
            }
           else {
            JOptionPane.showMessageDialog(null, "Failed to log in");
           }
        });

        JButton newUser = new JButton("Register");
        newUser.setBounds(490, 140, 100, 25);
        panel2.add(newUser);
        newUser.addActionListener(e -> {
            frame.dispose();
            RegistrationPage registration = new RegistrationPage();
        });

        frame.setVisible(true);
    }
}


