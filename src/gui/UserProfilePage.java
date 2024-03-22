package gui;

import javax.swing.*;
import javax.swing.border.Border;

import database_access.CdAccess;
import database_access.MagazineAccess;
import database_access.NewsletterAccess;
import database_access.QueryUtilities;
import database_access.StudentAccess;
import models.FacultyObserver.FacultyObserver;
import models.Items.Item;
import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.PhysicalItem;
import models.Items.PhysicalItems.Textbook;
import models.Users.FacultyMember;
import models.Users.Student;
import models.Users.User;
import services.OverdueService;
import services.itemstrategy.ItemStrategy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class UserProfilePage {
    private JFrame frame;
    private JPanel panel1, panel2, panel3, panel4;
    private JTable table1; // table1 relies on panel2
    private JTable table2;
    private JTable table3;

    QueryUtilities queryUtilities = new QueryUtilities();
    StudentAccess studentdb = StudentAccess.getInstance();
    Object[][] bookesRented;
    ArrayList<PhysicalItem> items;
    CdAccess cddb = CdAccess.getInstance();
    MagazineAccess magdb = MagazineAccess.getInstance();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    User user;
    OverdueService overdue = new OverdueService();

    UserProfilePage() {
        SwingUtilities.invokeLater(() -> {
            try {
                User loggedInUser = SessionManager.getCurrentUser();
                if (loggedInUser != null) {
                    user = queryUtilities.getUser(loggedInUser.getId());
                    panel1 = new JPanel();
                    panel1.setBackground(new Color(175, 13, 11));
                    panel1.setBounds(0, 10, 1000, 100);

                    panel2 = new JPanel();
                    panel2.setBackground(new Color(225, 223, 220));
                    panel2.setBounds(0, 105, 1000, 240);

                    panel3 = new JPanel();
                    panel3.setBackground(new Color(183, 174, 169));
                    panel3.setBounds(0, 320, 1000, 240);

                    panel4 = new JPanel();
                    panel4.setBackground(new Color(104, 98, 96));
                    panel4.setBounds(0, 550, 1000, 100);

                    Border border = BorderFactory.createLineBorder(Color.white, 5);
                    Border border1 = BorderFactory.createLineBorder(Color.black, 5);

                    ImageIcon yu = new ImageIcon("../library/resources/images/profile.jpg");

                    JLabel yuLabel = new JLabel();
                    yuLabel.setIcon(yu);
                    yuLabel.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of image
                    yuLabel.setVerticalTextPosition(JLabel.TOP);

                    yuLabel.setIconTextGap(15);

                    yuLabel.setBounds(800, 0, 160, 160); // set x and y permanent position of the image
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
                    // userProfilePage.setOpaque(true); //displays background color
                    userProfilePage.setBackground(Color.white);
                    userProfilePage.setForeground(Color.black);
                    userProfilePage.setBounds(90, 15, 300, 20);

                    JLabel loggedInAs = new JLabel("Logged in as: " + user.getName());
                    loggedInAs.setOpaque(true); // displays background color
                    loggedInAs.setBackground(Color.white);
                    loggedInAs.setForeground(Color.black);
                    loggedInAs.setBounds(20, 45, 300, 20);

                    JLabel numOfItems = new JLabel(
                            "Number of Items Currently Renting: " + user.getRented_item_list().size());
                    numOfItems.setOpaque(true); // displays background color
                    numOfItems.setBackground(Color.white);
                    numOfItems.setForeground(Color.black);
                    numOfItems.setBounds(20, 75, 300, 20);
                    System.out.println("Overdue Charge: " + user.getName());//OVERDUE CHARGE WORKING NEED TO ADD TO GUI
                    JLabel overdueCharge = new JLabel("Overdue Charge: " + user.getOverdue_charge());
                    overdueCharge.setOpaque(true); // displays background color
                    overdueCharge.setBackground(Color.white);
                    overdueCharge.setForeground(Color.black);
                    overdueCharge.setBounds(600, 75, 300, 20);
                    

                    panel1.add(userProfilePage);
                    panel1.add(loggedInAs);
                    panel1.add(numOfItems);
                    panel1.add(overdueCharge);
                   

                    JButton registerButton = new JButton("Log Out");
                    registerButton.setBounds(750, 35, 200, 27);
                    panel4.add(registerButton);
                    registerButton.addActionListener(cancelListener);

                    JLabel ItemsTitle = new JLabel("Items Currently Renting");
                    ItemsTitle.setFont(new Font("Arial", Font.BOLD, 15));

                    ItemsTitle.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of image

                    ItemsTitle.setForeground(Color.black);
                    ItemsTitle.setBounds(350, 15, 300, 20);
                    panel2.add(ItemsTitle);

                    JLabel textbooks_obtained = new JLabel("Textbooks");
                    textbooks_obtained.setFont(new Font("Arial", Font.BOLD, 15));

                    textbooks_obtained.setForeground(Color.black);
                    textbooks_obtained.setBounds(350, 35, 300, 20);
                    panel3.add(textbooks_obtained);
                    if (user.getRented_item_list().size() > 0) {
                        SwingUtilities.invokeLater(() -> {
                            try {
                                items = queryUtilities.getUserAssociatedItems(user);
                                
                                
                                user = queryUtilities.getUser(loggedInUser.getId());
                                System.out.println("Overdue Charge: " + user.getOverdue_charge());//OVERDUE CHARGE WORKING NEED TO ADD TO GUI 

                                bookesRented = GuiUtilities.convertItemsToViewArray(items);
                                table1 = new JTable(bookesRented, GuiUtilities.viewColumn);
                                JScrollPane scrollPane = new JScrollPane(table1);
                                scrollPane.setBounds(30, 35, 940, 200);
                                panel2.add(scrollPane);

                            } catch (Exception e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }

                        });
                    }


                    if (user instanceof FacultyMember) {
                        SwingUtilities.invokeLater(() -> {
                            try {
                                ArrayList<String> textbook_names = (ArrayList<String>) ((FacultyMember) user).getPreviousTextbooksUsed();
                                System.out.println(textbook_names);
                                ArrayList<Book> textbooks = new ArrayList<>();
                                if (textbook_names.size() > 0) {
                                    for (String name : textbook_names) {
                                        Book book = queryUtilities.getTextbook(name);
                                        if (name != null) {
                                            textbooks.add(book);
                                        }
                                    }
                                    bookesRented = GuiUtilities.convertTextbookToViewArray(textbooks);
                                    table2 = new JTable(bookesRented, GuiUtilities.viewColumn);
                                    JScrollPane scrollPane = new JScrollPane(table2);
                                    scrollPane.setBounds(30, 55, 940, 50);
                                    panel3.add(scrollPane);


                                    JLabel courses = new JLabel("Courses");
                                    courses.setFont(new Font("Arial", Font.BOLD, 15));

                                    courses.setForeground(Color.black);
                                    courses.setBounds(350, 110, 300, 20);
                                    panel3.add(courses);


                                    ArrayList<String> prof_courses = (ArrayList<String>) ((FacultyMember) user).getTeachingCourses();
                                        bookesRented = GuiUtilities.convertDigitalTBToViewArray(prof_courses);
                                        table3 = new JTable(bookesRented, GuiUtilities.viewColumn);
                                        JScrollPane scrollPane1 = new JScrollPane(table3);
                                        scrollPane1.setBounds(30, 140, 940, 50);
                                        panel3.add(scrollPane1);
                                }
                            } catch (Exception e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }

                        });
                    }

                    else if (user instanceof Student) {
                        SwingUtilities.invokeLater(() -> {
                                    Object[][] textbooks = GuiUtilities.convertDigitalTBToViewArray(((Student) user).getDigital_textbooks());
                                    table2 = new JTable(textbooks, GuiUtilities.viewColumn);
                                    JScrollPane scrollPane = new JScrollPane(table2);
                                    scrollPane.setBounds(30, 55, 940, 200);
                                    panel3.add(scrollPane);

                        });
                    }

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

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        });

    }

    ActionListener cancelListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            SessionManager.logout();
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
