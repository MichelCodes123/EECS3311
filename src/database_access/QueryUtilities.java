package database_access;
import models.Items.Item;
import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.PhysicalItem;
import models.Users.*;
import services.itemstrategy.ItemStrategy;
import services.itemstrategy.RentItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class QueryUtilities {

    //REFACTOR UTILS
    FacultyMemberAccess faculty_members = FacultyMemberAccess.getInstance();
    NonFacultyStaffAccess non_faculty_staff =NonFacultyStaffAccess.getInstance();
    StudentAccess students = StudentAccess.getInstance();
    VisitorAccess visitors = VisitorAccess.getInstance();

    BookAccess books = BookAccess.getInstance();
    CdAccess cds = CdAccess.getInstance();
    MagazineAccess magazines = MagazineAccess.getInstance();


    public ArrayList<User> allUsers() throws Exception {
        ArrayList<User> userlist = new ArrayList<>();
        loadUsers();

        userlist.addAll(visitors.users);
        userlist.addAll(students.users);
        userlist.addAll(non_faculty_staff.users);
        userlist.addAll(faculty_members.users);
        return userlist;
    }

    public ArrayList<PhysicalItem> allPhysicalItems() throws Exception {
        ArrayList<PhysicalItem> itemlist = new ArrayList<>();
        loadPhysicalItems();

        itemlist.addAll(books.items);
        itemlist.addAll(magazines.items);
        itemlist.addAll(cds.items);

        return itemlist;
    }

    public User getUser (String id) throws Exception {
       ArrayList<User> users = allUsers();
       for (User user : users) {
           if (user.getId().equals(id)) {
               return user;
           }
       }
       return null;
    }

    public PhysicalItem getPhysicalItem(String id) throws Exception {
        ArrayList<PhysicalItem> items = allPhysicalItems();

        for (PhysicalItem item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<PhysicalItem> getUserAssociatedItems (User user) throws Exception {
        // This is an incredibly lazy implementation. Look back later
        ArrayList<PhysicalItem> physical_items = allPhysicalItems();
        ArrayList<PhysicalItem> user_items = new ArrayList<>();

        for (PhysicalItem item : physical_items) {
            if (user.getRented_item_list().contains(item.getId())) {
                physical_items.add(item);
            }
        }

        return user_items;
    }

    private void loadUsers() throws Exception{
        visitors.load();
        students.load();
        non_faculty_staff.load();
        faculty_members.load();
    }

    private void loadPhysicalItems() throws Exception {
        books.load();
        cds.load();
        magazines.load();
    }

    public static void main(String[] args) throws Exception {
        Student student = new Student("1","Jimmy", "email", "1234", true, 0.0, true, null);
        FacultyMember prof = new FacultyMember("2","Tommy", "email", "1234", true, 0.0, true, new ArrayList<String>());
        Book book = new Book("0", "Game of Thrones", "RM 125", true, new Date().getTime(), 0.0);
        Book book1 = new Book("1", "Game of Thrones", "RM 125", true, new Date().getTime(), 0.0);


        StudentAccess studentdb = StudentAccess.getInstance();
        studentdb.users.add(student);
        studentdb.update();

        FacultyMemberAccess profdb = FacultyMemberAccess.getInstance();
        profdb.users.add(prof);
        profdb.update();

        BookAccess bookdb = BookAccess.getInstance();
        bookdb.items.add(book);
        bookdb.items.add(book1);
        bookdb.update();


        ItemStrategy strat = new RentItem();
        strat.execute(book.getId(), student.getId());
        strat.execute(book1.getId(), student.getId());

        studentdb.load();
        System.out.println(studentdb.users.get(0).getRented_item_list());
    }
}
