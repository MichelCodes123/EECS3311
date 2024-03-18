package gui;


import java.util.ArrayList;
import java.util.Date;

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
      Student student = new Student("1", "John", "email", "password", true, 0.0, true, new ArrayList<String>());
      Book book = new Book("0", "Game of Thrones", "RM 125", true, new Date().getTime(), 0.0);
      Book book2 = new Book("1", "Game of Thrones2", "RM 125", true, new Date().getTime(), 0.0);
      Book book3 = new Book("3", "Game of Thrones3", "RM 125", true, new Date().getTime(), 0.0);
      SessionManager.login(student);
      studentdb.users.add(student);
      bookdb.items.add(book);
      bookdb.items.add(book2);
      bookdb.items.add(book3);
      studentdb.update();
      bookdb.update();
     

      

       
        

}}
