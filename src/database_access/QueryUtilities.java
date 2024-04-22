package database_access;
import models.Items.Item;
import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.PhysicalItem;
import models.Items.PhysicalItems.Textbook;
import models.Users.*;
import org.w3c.dom.Text;
import services.OverdueService;
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

    public User getUserByEmail (String email) throws Exception {
        ArrayList<User> users = allUsers();
        for (User user : users) {
            if (user.getEmail().equals(email)) {
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
                user_items.add(item);
            }
        }
        return user_items;
    }

    public ArrayList<PhysicalItem> getExpiringItems (String user_id) throws Exception {
       User user = getUser(user_id);
        Long current_date = new Date().getTime();
        ArrayList<PhysicalItem> near_overdue_items = new ArrayList<>();


        for (String item_id : user.getRented_item_list()) {
            PhysicalItem item = getPhysicalItem(item_id);
            if ((item.getDueDate() - (24*60*60*1000)) < current_date) {
                near_overdue_items.add(item);
            }

        }
        return near_overdue_items;
    }

    public Book getTextbook(String id) throws Exception {
        ArrayList<PhysicalItem> items = allPhysicalItems();

        for (Item item : items) {
            if (item instanceof Book && item.getId().equals(id)) {
                return (Book) item;
            }
        }
        return null;
    }

    private void loadUsers() throws Exception{
        visitors.users = new ArrayList<>();
        students.users = new ArrayList<>();
        non_faculty_staff.users = new ArrayList<>();
        faculty_members.users = new ArrayList<>();


        visitors.load();
        students.load();
        non_faculty_staff.load();
        faculty_members.load();
    }

    private void loadPhysicalItems() throws Exception {
        books.items = new ArrayList<>();
        cds.items = new ArrayList<>();
        magazines.items = new ArrayList<>();

        books.load();
        cds.load();
        magazines.load();
    }
}
