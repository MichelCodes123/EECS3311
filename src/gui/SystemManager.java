package gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SystemManager {

    private JFrame frame;
    private JPanel panel1, panel2, panel3, panel4;


    SystemManager() {

        panel1 = new JPanel();
        panel1.setBackground(Color.white);
        panel1.setBounds(0, 0, 1000, 205);

        panel2 = new JPanel();
        panel2.setBackground(new Color(172,230,248));
        panel2.setBounds(0, 100, 1000, 350);

        panel4 = new JPanel();
        panel4.setBackground(new Color(172,230,248));
        panel4.setBounds(0, 420, 1000, 220);

//        panel3 = new JPanel();
//        panel3.setBackground(Color.red);
//        panel3.setBounds(0, 580, 1000, 120);

        JButton logOutButton = new JButton("Log Out");
        logOutButton.setBounds(20, 130, 200, 27);
        panel1.add(logOutButton);
        logOutButton.addActionListener(cancelListener);

        JButton addButton = new JButton("ADD");
        addButton.setBounds(140, 180, 200, 17);
        panel4.add(addButton);
       // logOutButton.addActionListener(cancelListener);

        JButton removeButton = new JButton("REMOVE");
        removeButton.setBounds(440, 180, 200, 17);
        panel4.add(removeButton);
     //   logOutButton.addActionListener(cancelListener);


        JButton updateButton = new JButton("UPDATE");
        updateButton.setBounds(740, 180, 200, 17);
        panel4.add(updateButton);
//   logOutButton.addActionListener(cancelListener);

        JTextField searchTextField = new JTextField();
        searchTextField.setForeground(Color.black);
        searchTextField.setOpaque(true); //displays background color
        searchTextField.setBackground(Color.white);
        searchTextField.setBounds(300, 120, 340, 40);
        panel1.add(searchTextField);

        JLabel sysadminLabel = new JLabel("SYSTEM MANAGER");
        sysadminLabel.setForeground(Color.black);
        sysadminLabel.setOpaque(true); //displays background color
        sysadminLabel.setBackground(Color.white);
        sysadminLabel.setBounds(360, 0, 340, 80);
        sysadminLabel.setFont(new Font("Arial", Font.BOLD, 22));
        panel1.add(sysadminLabel);

        JLabel searchTextLabel = new JLabel("SEARCH");
        searchTextLabel.setForeground(Color.black);
        searchTextLabel.setOpaque(true); //displays background color
        searchTextLabel.setBackground(Color.white);
        searchTextLabel.setBounds(445, 160, 140, 40);
        panel1.add(searchTextLabel);

        JLabel loggedInAsLabel = new JLabel("Logged in as: ");
        loggedInAsLabel.setForeground(Color.black);
       // loggedInAsLabel.setOpaque(true); //displays background color
        loggedInAsLabel.setBackground(Color.BLACK);
        loggedInAsLabel.setBounds(20, 80, 200, 40);
        panel1.add(loggedInAsLabel);

        JLabel idLabel = new JLabel("ID");
        idLabel.setForeground(Color.white);
        idLabel.setOpaque(true); //displays background color
        idLabel.setBackground(Color.BLACK);
        idLabel.setBounds(100, 50, 100, 20);
        panel4.add(idLabel);


        JLabel nameLabel = new JLabel("Name");
        nameLabel.setForeground(Color.white);
        nameLabel.setOpaque(true); //displays background color
        nameLabel.setBackground(Color.BLACK);
        nameLabel.setBounds(260, 50, 100, 20);
        panel4.add(nameLabel);

        JTextField nameTextField = new JTextField();
        nameTextField.setForeground(Color.black);
        nameTextField.setOpaque(true); //displays background color
        nameTextField.setBackground(Color.white);
        nameTextField.setBounds(260, 80, 100, 20);
        panel4.add(nameTextField);

        JLabel typeLabel = new JLabel("Type");
        typeLabel.setForeground(Color.white);
        typeLabel.setOpaque(true); //displays background color
        typeLabel.setBackground(Color.BLACK);
        typeLabel.setBounds(420, 50, 100, 20);
        panel4.add(typeLabel);

        JTextField typeTextField = new JTextField();
        typeTextField.setForeground(Color.black);
        typeTextField.setOpaque(true); //displays background color
        typeTextField.setBackground(Color.white);
        typeTextField.setBounds(420, 80, 100, 20);
        panel4.add(typeTextField);

        JLabel locationLabel = new JLabel("Location");
        locationLabel.setForeground(Color.white);
        locationLabel.setOpaque(true); //displays background color
        locationLabel.setBackground(Color.black);
        locationLabel.setBounds(580, 50, 100, 20);
        panel4.add(locationLabel);

        JTextField locationTextField = new JTextField();
        locationTextField.setForeground(Color.black);
        locationTextField.setOpaque(true); //displays background color
        locationTextField.setBackground(Color.white);
        locationTextField.setBounds(580, 80, 100, 20);
        panel4.add(locationTextField);

        JLabel canPurchaseLabel = new JLabel("Can Purchase?");
        canPurchaseLabel.setForeground(Color.white);
        canPurchaseLabel.setOpaque(true); //displays background color
        canPurchaseLabel.setBackground(Color.black);
        canPurchaseLabel.setBounds(740, 50, 100, 20);
        panel4.add(canPurchaseLabel);

        JTextField canPurcahseTextField = new JTextField();
        canPurcahseTextField .setForeground(Color.black);
        canPurcahseTextField .setOpaque(true); //displays background color
        canPurcahseTextField .setBackground(Color.white);
        canPurcahseTextField .setBounds(740, 80, 100, 20);
        panel4.add(canPurcahseTextField );

        JLabel dollarAmountLabel = new JLabel("Dollar Amount");
        dollarAmountLabel.setForeground(Color.white);
        dollarAmountLabel.setOpaque(true); //displays background color
        dollarAmountLabel.setBackground(Color.black);
        dollarAmountLabel.setBounds(420, 110, 100, 20);
        panel4.add(dollarAmountLabel);

//        JTextField dollarAmountTextField = new JTextField();
//        dollarAmountTextField .setForeground(Color.black);
//        dollarAmountTextField .setOpaque(true); //displays background color
//        dollarAmountTextField .setBackground(Color.white);
//        dollarAmountTextField .setBounds(530, 80, 100, 20);
//        panel4.add(dollarAmountTextField );

        JLabel dueDateLabel = new JLabel("Due Date?");
        dueDateLabel.setForeground(Color.white);
        dueDateLabel.setOpaque(true); //displays background color
        dueDateLabel.setBackground(Color.black);
        dueDateLabel.setBounds(260, 110, 100, 20);
        panel4.add(dueDateLabel);

        JLabel canRentLabel = new JLabel("Can Rent?");
        canRentLabel.setForeground(Color.white);
        canRentLabel.setOpaque(true); //displays background color
        canRentLabel.setBackground(Color.black);
        canRentLabel.setBounds(580, 110, 100, 20);
        panel4.add(canRentLabel);

        JTextField dueDateTextField = new JTextField();
        dueDateTextField.setForeground(Color.black);
        dueDateTextField.setOpaque(true); //displays background color
        dueDateTextField.setBackground(Color.white);
        dueDateTextField.setBounds(260, 135, 100, 20);
        panel4.add(dueDateTextField);

        JTextField dollarAmountTextField = new JTextField();
        dollarAmountTextField.setForeground(Color.black);
        dollarAmountTextField.setOpaque(true); //displays background color
        dollarAmountTextField.setBackground(Color.white);
        dollarAmountTextField.setBounds(420, 135, 100, 20);
        panel4.add(dollarAmountTextField);

        JTextField canRentTextField = new JTextField();
        canRentTextField.setForeground(Color.black);
        canRentTextField.setOpaque(true); //displays background color
        canRentTextField.setBackground(Color.white);
        canRentTextField.setBounds(580, 135, 100, 20);
        panel4.add(canRentTextField);

        Border border = BorderFactory.createLineBorder(Color.white, 5);
        Border border1 = BorderFactory.createLineBorder(Color.black, 5);

        ImageIcon yu = new ImageIcon("../library/resources/images/Picture1.jpg");

        JLabel yuLabel = new JLabel();
        yuLabel.setIcon(yu);
        yuLabel.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of image
        yuLabel.setVerticalTextPosition(JLabel.TOP);
        yuLabel.setForeground(Color.white);
        yuLabel.setIconTextGap(15);
        yuLabel.setBackground(Color.black);
        //yuLabel.setOpaque(true); //displays background color
        yuLabel.setBorder(border); //displays border
        yuLabel.setBounds(800, 5, 200, 500); //set x and y permanent position of the image
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
        //frame.add(panel3);
        frame.add(panel4);


        panel1.setLayout(null);
        panel2.setLayout(null);
       // panel3.setLayout(null);
        panel4.setLayout(null);




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