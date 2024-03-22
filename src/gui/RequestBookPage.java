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

public class RequestBookPage {
    private JFrame frame;
    private JPanel panel1, panel2, panel3, panel4;
    private JComboBox bookTypeComboBox;

    RequestBookPage() {

        panel1 = new JPanel();
        panel1.setBackground(new Color(175, 13, 11));
        panel1.setBounds(0, 10, 1000, 100);

        panel2 = new JPanel();
        panel2.setBackground(new Color(225, 223, 220));
        panel2.setBounds(0, 105, 1000, 400);

        panel4 = new JPanel();
        panel4.setBackground(new Color(104, 98, 96));
        panel4.setBounds(0, 550, 1000, 100);

        frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);
        frame.setTitle("RequestBookPage");

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel4);

        panel1.setLayout(null);
        panel2.setLayout(null);
        panel4.setLayout(null);

        JLabel requestBookLabel = new JLabel("Request a Book");
        requestBookLabel.setFont(new Font("Arial", Font.BOLD, 17));
        requestBookLabel.setBackground(Color.white);
        requestBookLabel.setForeground(Color.black);
        requestBookLabel.setBounds(380, 25, 300, 20);
        panel1.add(requestBookLabel);

        String[] bookTypes = {"Textbooks for Course Teaching", "Self-Improvement"};
        bookTypeComboBox = new JComboBox<>(bookTypes);
        bookTypeComboBox.setBounds(375, 100, 250, 25);
        panel2.add(bookTypeComboBox);

        JButton requestButton = new JButton("Request Book");
        requestButton.setBounds(375, 150, 250, 25);
        panel2.add(requestButton);
        requestButton.addActionListener(requestAction);

        JButton backButton = new JButton("Back");
        backButton.setBounds(400, 35, 200, 27);
        panel4.add(backButton);
        backButton.addActionListener(back);

        frame.setVisible(true);
    }

    ActionListener requestAction = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedBookType = (String) bookTypeComboBox.getSelectedItem();
            if (selectedBookType.equals("Textbooks for Course Teaching")) {
                JOptionPane.showMessageDialog(frame, "Your request for a textbook has been prioritized.");
            } else {
                JOptionPane.showMessageDialog(frame, "Your request for self-improvement book has been processed.");
            }
        }
    };


    ActionListener sub = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            //PaymentPage pp = new PaymentPage();
        }
    };

    ActionListener back = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            frame.dispose();
            ItemManagerPage ip = new ItemManagerPage();
        }
    };

    ActionListener cb = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            LoginPage lp = new LoginPage();
        }
    };
}
