package gui;


import java.util.ArrayList;
import java.util.Date;

import javax.swing.SwingUtilities;

import database_access.*;
import gui.LoginPage;
import models.Course;
import models.Items.Newsletter;
import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.Cd;
import models.Items.PhysicalItems.Magazine;
import models.Items.PhysicalItems.Textbook;
import models.Users.FacultyMember;
import models.Users.Student;
import models.Users.User;
import models.Users.Visitor;
import services.OverdueService;
import services.itemstrategy.ItemStrategy;
import services.itemstrategy.RentItem;

public class Test {
    public static void main(String[] args) throws Exception{
   //    UserProfilePage up = new UserProfilePage();
       LoginPage lp = new LoginPage();
       //SubscriptionPage sp = new SubscriptionPage();
        // ItemManagerPage ip = new ItemManagerPage();

        FacultyMemberAccess profdb = FacultyMemberAccess.getInstance();
        StudentAccess studentdb = StudentAccess.getInstance();
        VisitorAccess visitordb = VisitorAccess.getInstance();
        BookAccess bookdb = BookAccess.getInstance();
        CdAccess cddb = CdAccess.getInstance();
        MagazineAccess magdb = MagazineAccess.getInstance();
        ItemStrategy strat = new RentItem();
        NewsletterAccess newsdb = NewsletterAccess.getInstance();
        Student student = new Student("0", "John", "e", "p", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>(), new ArrayList<Course>(), new ArrayList<String>());
        Student student2 = new Student("1", "Joe", "z", "pass", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>(), new ArrayList<Course>(), new ArrayList<String>());
        FacultyMember prof = new FacultyMember("2", "Tom", "m", "pass", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>());
        Visitor admin = new Visitor("-1", "Admin", "admin", "admin", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>());
        OverdueService overdue = new OverdueService();

        Book book = new Book("0", "Game of Thrones", "RM 125", false, new Date().getTime()+ 86400000*2, 0.0);
        Book book2 = new Book("1", "Game of Thrones2", "RM 125", true, new Date().getTime()+ 86400000*2, 0.0);
        Book book3 = new Book("2", "Game of Thrones3", "RM 125", true, new Date().getTime()+ 86400000*2, 0.0);
        Textbook textbook = new Textbook("5", "Data Structures", "RM 125", false, new Date().getTime()+ 86400000*2, 0.0);
        Cd cd = new Cd("3", "Game of Thrones Movie", "RM 125", true, new Date().getTime()+ 86400000*2, 0.0);
        Magazine mag = new Magazine("4", "Game of Thrones Vogue Magazine", "RM 125", true, new Date().getTime() - 86400000 , 0.0);
        
        Newsletter news = new Newsletter("5", "New York Times", "https://www.nytimes.com/");
        Newsletter news2 = new Newsletter("6", "The Star", "https://www.thestar.com/");
        Newsletter news3 = new Newsletter("7", "Washington Post Newsletter", "https://www.washingtonpost.com/");
        newsdb.items.add(news);
        newsdb.items.add(news2);
        newsdb.items.add(news3);
        
        
        studentdb.users.add(student);
        studentdb.users.add(student2);
        profdb.users.add(prof);
        visitordb.users.add(admin);
        studentdb.update();
        profdb.update();
        visitordb.update();
        
        bookdb.items.add(book);
        bookdb.items.add(book2);
        bookdb.items.add(book3);
        bookdb.items.add(textbook);
        cddb.items.add(cd);
        magdb.items.add(mag);
      
        bookdb.update();
        cddb.update();
        magdb.update();
        newsdb.update();
        SwingUtilities.invokeLater(() -> {
            try {
                strat.execute(cd.getId(), student.getId());
                studentdb.load();
                
            } catch (Exception e2) {

                e2.printStackTrace();
            }
        });
        SwingUtilities.invokeLater(() -> {
            try {
                strat.execute(mag.getId(), student.getId());
                studentdb.load();
              
            } catch (Exception e2) {

                e2.printStackTrace();
            }
        });
        SwingUtilities.invokeLater(() -> {
            try {
                newsdb.load();
              
            } catch (Exception e2) {

                e2.printStackTrace();
            }
        });
        
        

      
      
      //System.out.println("Student: " + studentdb.users.get(0).getName());
     

      

       
        

}}
