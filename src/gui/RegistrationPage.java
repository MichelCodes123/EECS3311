package gui;

import controllers.LoginController;
import logic.LoginUtilities;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationPage {
    private JFrame frame;
    private JPanel panel1, panel2;
    private JComboBox clientCombo;
    final String[] clientType = {"Student", "FacultyMember", "NonFacultyStaff", "Visitor"};



    RegistrationPage(){

        panel1 = new JPanel();
        panel1.setBackground(Color.white);
        panel1.setBounds(0, 0, 1000, 200);

        panel2 = new JPanel();
        panel2.setBackground(Color.lightGray);
        panel2.setBounds(0, 210, 1000, 550);

        Border border = BorderFactory.createLineBorder(Color.white, 5);
        Border border1 = BorderFactory.createLineBorder(Color.black, 5);

        ImageIcon yu = new ImageIcon("../library/resources/images/yu1.jpg");

        JLabel yuLabel = new JLabel();
        yuLabel.setIcon(yu);
        yuLabel.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of image
        yuLabel.setVerticalTextPosition(JLabel.TOP);
        yuLabel.setForeground(Color.white);
        yuLabel.setIconTextGap(15);
        yuLabel.setBackground(Color.black);
        //yuLabel.setOpaque(true); //displays background color
        yuLabel.setBorder(border); //displays border
        yuLabel.setBounds(800, 20, 160, 160); //set x and y permanent position of the image
        yuLabel.setFont(new Font("Arial", Font.BOLD, 16));
        yuLabel.setVerticalAlignment(JLabel.TOP);
        yuLabel.setHorizontalAlignment(JLabel.CENTER);
        panel1.add(yuLabel);


        frame = new JFrame(); // creates a frame
        frame.setLayout(null); // display the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 1500);
        frame.setTitle("User Registration");

        frame.add(panel1);
        frame.add(panel2);
        panel1.setLayout(null);
        panel2.setLayout(null);

        JLabel logoLabel = new JLabel();
        logoLabel.setText(" User Registration"); //set text of label
        logoLabel.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of image
        logoLabel.setVerticalTextPosition(JLabel.CENTER);
        logoLabel.setForeground(Color.black);
        logoLabel.setIconTextGap(15);
       // logoLabel.setBackground(Color.black);
        logoLabel.setOpaque(true); //displays background color
        //logoLabel.setBorder(border); //displays border
        logoLabel.setBounds(40, 30, 400, 140); //set x and y permanent position of the image
        logoLabel.setFont(new Font("Arial", Font.BOLD, 20));
        logoLabel.setVerticalAlignment(JLabel.CENTER);
        logoLabel.setHorizontalAlignment(JLabel.CENTER);
        panel1.add(logoLabel);

        JLabel userLabel = new JLabel("Username");
        userLabel.setOpaque(true); //displays background color
        userLabel.setBackground(Color.white);
        userLabel.setForeground(Color.black);
        userLabel.setBounds(400, 30, 80, 20);


        panel2.add(userLabel);

        JTextField userNameText = new JTextField();
        userNameText.setForeground(Color.black);
        userNameText.setOpaque(true); //displays background color
        userNameText.setBackground(Color.white);
        userNameText.setBounds(500, 30, 140, 20);
        panel2.add(userNameText);

        JLabel EmailLabel = new JLabel("Email");
        EmailLabel.setOpaque(true); //displays background color
        EmailLabel.setBackground(Color.white);
        EmailLabel.setForeground(Color.black);
        EmailLabel.setBounds(400, 70, 80, 20);
        panel2.add(EmailLabel);

        JTextField emailText = new JTextField();
        emailText.setForeground(Color.black);
        emailText.setOpaque(true); //displays background color
        emailText.setBackground(Color.white);
        emailText.setBounds(500, 70, 140, 20);
        panel2.add(emailText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setOpaque(true); //displays background color
        passwordLabel.setBackground(Color.white);
        passwordLabel.setForeground(Color.black);
        passwordLabel.setBounds(400, 110, 80, 20);
        panel2.add(passwordLabel);

        JTextField passwordText = new JTextField();
        passwordText.setForeground(Color.black);
        passwordText.setOpaque(true); //displays background color
        passwordText.setBackground(Color.white);
        passwordText.setBounds(500, 110, 140, 20);
        panel2.add(passwordText);

        JLabel clientLabel = new JLabel("Type of Client");
        clientLabel.setOpaque(true); //displays background color
        clientLabel.setBackground(Color.white);
        clientLabel.setForeground(Color.black);
        clientLabel.setBounds(400, 150, 90, 20);
        panel2.add(clientLabel);

        clientCombo = new JComboBox(clientType);
        clientCombo.setBounds(500, 150, 140, 20);
        panel2.add(clientCombo);

        JButton registerButton = new JButton("Complete Registration");
        registerButton.setBounds(280, 300, 200, 25);
        panel2.add(registerButton);
        registerButton.addActionListener(  new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String type = (String) clientCombo.getSelectedItem();
                String name = userNameText.getText();
                String password = passwordText.getText();
                String email = emailText.getText();

                LoginUtilities.verifyRegistration(type, name, email, password,  (error) ->  JOptionPane.showMessageDialog(null, error), () -> {
                    frame.dispose();
                    LoginPage lp = new LoginPage();
                });
            }
        });

        JButton cancelButton = new JButton("Cancel Registration");
        cancelButton.setBounds(490, 300, 200, 25);
        panel2.add(cancelButton);
        cancelButton.addActionListener(cancelListener);

        frame.setVisible(true);


    }



    ActionListener cancelListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            LoginPage lp = new LoginPage();
        }
    };
}
