package gui;


import java.util.ArrayList;
import java.util.Date;

import javax.swing.SwingUtilities;

import database_access.BookAccess;
import database_access.StudentAccess;
import gui.LoginPage;
import models.Items.PhysicalItems.Book;
import models.Users.Student;
import models.Users.User;
import services.itemstrategy.ItemStrategy;
import services.itemstrategy.RentItem;

public class Test {
    public static void main(String[] args) throws Exception{
   //    UserProfilePage up = new UserProfilePage();
       LoginPage lp = new LoginPage();
        // ItemManagerPage ip = new ItemManagerPage();
        
      StudentAccess studentdb = StudentAccess.getInstance();
      BookAccess bookdb = BookAccess.getInstance();
      Student student = new Student("0", "John", "email", "password", true, 0.0, true, new ArrayList<String>());
      Student student2 = new Student("1", "Joe", "hi", "world", true, 0.0, true, new ArrayList<String>());
      Book book = new Book("0", "Game of Thrones", "RM 125", true, new Date().getTime(), 0.0);
      Book book2 = new Book("1", "Game of Thrones2", "RM 125", true, new Date().getTime(), 0.0);
      Book book3 = new Book("2", "Game of Thrones3", "RM 125", true, new Date().getTime(), 0.0);
      SessionManager.login(student);
      studentdb.users.add(student);
      studentdb.update();
     
      bookdb.items.add(book);
      bookdb.items.add(book2);
      bookdb.items.add(book3);
      
      bookdb.update();
       SwingUtilities.invokeLater(() -> {
                try {
                    studentdb.load();
                    
                } catch (Exception e2) {
    
                    e2.printStackTrace();
                }
            });
    
      
      
      //System.out.println("Student: " + studentdb.users.get(0).getName());
     

      

       
        

}}
