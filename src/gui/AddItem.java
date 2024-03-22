package gui;

import controllers.LoginController;
import database_access.QueryUtilities;
import logic.LoginUtilities;
import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.Cd;
import models.Items.PhysicalItems.Magazine;
import models.LibraryItem.ItemIdGenerator;
import models.LibraryItem.LibraryManager;

import javax.management.Query;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class AddItem {
    private JFrame frame;
    private JPanel panel1, panel2;
    private JComboBox clientCombo;
    final String[] clientType = {"Book", "Cd", "Magazine"};
    ItemIdGenerator itemIdGenerator = ItemIdGenerator.getInstance();
    LibraryManager libraryManager = new LibraryManager("path");
    QueryUtilities queryUtilities = new QueryUtilities();



    AddItem(){

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
        frame.setTitle("Add Item");

        frame.add(panel1);
        frame.add(panel2);
        panel1.setLayout(null);
        panel2.setLayout(null);

        JLabel logoLabel = new JLabel();
        logoLabel.setText("Add Item"); //set text of label
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

        JLabel title = new JLabel("Title");
        title.setOpaque(true); //displays background color
        title.setBackground(Color.white);
        title.setForeground(Color.black);
        title.setBounds(400, 30, 80, 20);


        panel2.add(title);

        JTextField titleText = new JTextField();
        titleText.setForeground(Color.black);
        titleText.setOpaque(true); //displays background color
        titleText.setBackground(Color.white);
        titleText.setBounds(500, 30, 140, 20);
        panel2.add(titleText);

        JLabel Location = new JLabel("Location");
        Location.setOpaque(true); //displays background color
        Location.setBackground(Color.white);
        Location.setForeground(Color.black);
        Location.setBounds(400, 70, 80, 20);
        panel2.add(Location);

        JTextField locationText = new JTextField();
        locationText.setForeground(Color.black);
        locationText.setOpaque(true); //displays background color
        locationText.setBackground(Color.white);
        locationText.setBounds(500, 70, 140, 20);
        panel2.add(locationText);

        JLabel Price = new JLabel("Price");
        Price.setOpaque(true); //displays background color
        Price.setBackground(Color.white);
        Price.setForeground(Color.black);
        Price.setBounds(400, 110, 80, 20);
        panel2.add(Price);

        JTextField priceText = new JTextField();
        priceText.setForeground(Color.black);
        priceText.setOpaque(true); //displays background color
        priceText.setBackground(Color.white);
        priceText.setBounds(500, 110, 140, 20);
        panel2.add(priceText);

        JLabel type = new JLabel("Type of Item");
        type.setOpaque(true); //displays background color
        type.setBackground(Color.white);
        type.setForeground(Color.black);
        type.setBounds(400, 150, 90, 20);
        panel2.add(type);

        clientCombo = new JComboBox(clientType);
        clientCombo.setBounds(500, 150, 140, 20);
        panel2.add(clientCombo);

        JButton registerButton = new JButton("Add");
        registerButton.setBounds(280, 300, 200, 25);
        panel2.add(registerButton);
        registerButton.addActionListener(e -> {
            String itemType = (String) clientCombo.getSelectedItem();
            String itemTitle = titleText.getText();
            String itemLocation = locationText.getText();
            Double price = Double.parseDouble(priceText.getText());
            

                        if(itemType.equals("Book")){
                            
                            Book book = new Book(itemIdGenerator.generateId(), itemTitle, itemLocation,true,new Date().getTime()+ 86400000*2, price);
                            try {
                                libraryManager.addItem(book);
                                queryUtilities.allPhysicalItems();
                            } catch (Exception e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                            }
                            
                            
                        }
                        else if(itemType.equals("Cd")){
                            Cd cd = new Cd(itemIdGenerator.generateId(), itemTitle, itemLocation,true,new Date().getTime()+ 86400000*2, price);
                            try {
                                libraryManager.addItem(cd);
                                queryUtilities.allPhysicalItems();
                            } catch (Exception e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                            }
                        }
                        else if(itemType.equals("Magazine")){
                            Magazine mag = new Magazine(itemIdGenerator.generateId(), itemTitle, itemLocation,true,new Date().getTime()+ 86400000*2, price);
                            try {
                                libraryManager.addItem(mag);
                                queryUtilities.allPhysicalItems();
                            } catch (Exception e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                            }
                        }
                        //could add a message here to show that the item has been added
                        frame.dispose();
                        SystemManager systemManager = new SystemManager();

            
        });

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(490, 300, 200, 25);
        panel2.add(cancelButton);
        cancelButton.addActionListener(cancelListener);

        frame.setVisible(true);


    }



    ActionListener cancelListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            SystemManager systemManager = new SystemManager();
        }
    };
}
