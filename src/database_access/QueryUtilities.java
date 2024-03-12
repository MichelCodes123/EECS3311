package database_access;
import models.Items.Item;
import models.Items.PhysicalItems.PhysicalItem;
import models.Users.*;

import java.util.ArrayList;

public class QueryUtilities {

    //REFACTOR UTILS
    FacultyMemberAccess faculty_members = new FacultyMemberAccess();
    NonFacultyStaffAccess non_faculty_staff = new NonFacultyStaffAccess();
    StudentAccess students = new StudentAccess();
    VisitorAccess visitors = new VisitorAccess();

    BookAccess books = new BookAccess();
    CdAccess cds = new CdAccess();
    MagazineAccess magazines = new MagazineAccess();


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


}
