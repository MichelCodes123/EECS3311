package Tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import database_access.BookAccess;
import database_access.CdAccess;
import database_access.FacultyMemberAccess;
import database_access.MagazineAccess;
import database_access.NonFacultyStaffAccess;
import database_access.QueryUtilities;
import database_access.StudentAccess;
import database_access.VisitorAccess;
import models.Course;
import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.Cd;
import models.Items.PhysicalItems.Magazine;
import models.Items.PhysicalItems.PhysicalItem;
import models.Items.PhysicalItems.Textbook;
import models.Users.FacultyMember;
import models.Users.NonFacultyStaff;
import models.Users.Student;
import models.Users.Visitor;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.itemstrategy.ItemStrategy;
import services.itemstrategy.RentItem;

import java.util.ArrayList;
import java.util.Date;

public class QueryUtilsTest {
    private FacultyMemberAccess profdb;
    private StudentAccess studentdb;
    private VisitorAccess visitordb;
    private NonFacultyStaffAccess staffdb;
    private BookAccess bookdb;
    private CdAccess cddb;
    private MagazineAccess magdb;

    @BeforeEach
    void setUp() {
        // Assuming BookAccess.items can be reset or cleared for testing purposes
        profdb = FacultyMemberAccess.getInstance();
        studentdb = StudentAccess.getInstance();
        visitordb = VisitorAccess.getInstance();
        staffdb = NonFacultyStaffAccess.getInstance();
        bookdb = BookAccess.getInstance();
        cddb = CdAccess.getInstance(); 
        magdb = MagazineAccess.getInstance();

        profdb.users.clear();
        studentdb.users.clear();
        visitordb.users.clear();
        staffdb.users.clear();
        bookdb.items.clear();
        cddb.items.clear();
        magdb.items.clear();

    }
    @AfterEach
    void tearDown() {
        profdb.users.clear();
        studentdb.users.clear();
        visitordb.users.clear();
        staffdb.users.clear();
        bookdb.items.clear();
        cddb.items.clear();
        magdb.items.clear();
    }

    @Test
    void getAllUsersTest() throws Exception {
        QueryUtilities utils = new QueryUtilities();

        Student student = new Student("0", "John", "e", "p", true, 0.0, true, new ArrayList<String>(),
                new ArrayList<String>(), new ArrayList<Course>(), new ArrayList<String>());
        Student student2 = new Student("1", "Joe", "z", "pass", true, 0.0, true, new ArrayList<String>(),
                new ArrayList<String>(), new ArrayList<Course>(), new ArrayList<String>());
        FacultyMember prof = new FacultyMember("2", "Tom", "m", "pass", true, 0.0, true, new ArrayList<String>(),
                new ArrayList<String>());
        Visitor visitor = new Visitor("3", "Admin", "a", "a", true, 0.0, true, new ArrayList<String>(),
                new ArrayList<String>());
        NonFacultyStaff staff = new NonFacultyStaff("4", "Hello", "a", "a", true, 0.0, true, new ArrayList<String>(),
                new ArrayList<String>());

        profdb.users.add(prof);
        studentdb.users.add(student);
        studentdb.users.add(student2);
        visitordb.users.add(visitor);
        staffdb.users.add(staff);

        profdb.update();
        studentdb.update();
        visitordb.update();
        staffdb.update();

        assertNotNull(utils.allUsers());
        assertEquals(5, utils.allUsers().size());

    }
    @Test
    void getAllItemsTest() throws Exception{
        QueryUtilities utils = new QueryUtilities();

        Book book = new Book("0", "Game of Thrones", "RM 125", false, new Date().getTime(), 0.0);
        Book book2 = new Book("1", "Game of Thrones2", "RM 125", true, new Date().getTime() + 86400000 * 2, 0.0);
        Book book3 = new Book("2", "Game of Thrones3", "RM 125", true, new Date().getTime() + 86400000 * 2, 0.0);
        Cd cd = new Cd("3", "Game of Thrones Movie", "RM 125", true, new Date().getTime() + 86400000, 0.0);
        Magazine mag = new Magazine("4", "Game of Thrones Vogue Magazine", "RM 125", true, new Date().getTime() - 86400000, 0.0);

        bookdb.items.add(book);
        bookdb.items.add(book2);
        bookdb.items.add(book3);
        cddb.items.add(cd);
        magdb.items.add(mag);

        bookdb.update();
        cddb.update();
        magdb.update();

        assertNotNull(utils.allPhysicalItems());
        assertEquals(5, utils.allPhysicalItems().size());
    }
    @Test
    void getUserTest() throws Exception {
        QueryUtilities utils = new QueryUtilities();

        Student student = new Student("0", "John", "e", "p", true, 0.0, true, new ArrayList<String>(),
                new ArrayList<String>(), new ArrayList<Course>(), new ArrayList<String>());
        FacultyMember prof = new FacultyMember("2", "Tom", "m", "pass", true, 0.0, true, new ArrayList<String>(),
                new ArrayList<String>());

        studentdb.users.add(student);
        profdb.users.add(prof);

        studentdb.update();
        profdb.update();

        assertNotNull(utils.getUser("0"));
        assertNotNull(utils.getUser("2"));
        assertEquals(student.getId(), utils.getUser("0").getId());

        assertEquals(prof.getId(), utils.getUser("2").getId());
    }
    @Test
    void getUserbyEmailTest() throws Exception {
        QueryUtilities utils = new QueryUtilities();

        Student student = new Student("0", "John", "e", "p", true, 0.0, true, new ArrayList<String>(),
                new ArrayList<String>(), new ArrayList<Course>(), new ArrayList<String>());
        FacultyMember prof = new FacultyMember("2", "Tom", "m", "pass", true, 0.0, true, new ArrayList<String>(),
                new ArrayList<String>());

        studentdb.users.add(student);
        profdb.users.add(prof);

        studentdb.update();
        profdb.update();

        assertNotNull(utils.getUserByEmail("e"));
        assertNotNull(utils.getUserByEmail("m"));
        assertEquals(student.getEmail(), utils.getUserByEmail("e").getEmail());
        assertEquals(prof.getEmail(), utils.getUserByEmail("m").getEmail());
    }
    @Test
    void getPhysicalItemTest() throws Exception{
        QueryUtilities utils = new QueryUtilities();

        Book book = new Book("0", "Game of Thrones", "RM 125", false, new Date().getTime(), 0.0);
        Book book2 = new Book("1", "Game of Thrones2", "RM 125", true, new Date().getTime() + 86400000 * 2, 0.0);
        Book book3 = new Book("2", "Game of Thrones3", "RM 125", true, new Date().getTime() + 86400000 * 2, 0.0);
        Cd cd = new Cd("3", "Game of Thrones Movie", "RM 125", true, new Date().getTime() + 86400000, 0.0);
        Magazine mag = new Magazine("4", "Game of Thrones Vogue Magazine", "RM 125", true, new Date().getTime() - 86400000, 0.0);

        bookdb.items.add(book);
        bookdb.items.add(book2);
        bookdb.items.add(book3);
        cddb.items.add(cd);
        magdb.items.add(mag);

        bookdb.update();
        cddb.update();
        magdb.update();

        assertNotNull(utils.getPhysicalItem("0"));
        assertNotNull(utils.getPhysicalItem("1"));
        assertNotNull(utils.getPhysicalItem("2"));
        assertNotNull(utils.getPhysicalItem("3"));
        assertNotNull(utils.getPhysicalItem("4"));

        assertEquals(book.getId(), utils.getPhysicalItem("0").getId());
        assertEquals(book2.getId(), utils.getPhysicalItem("1").getId());
        assertEquals(book3.getId(), utils.getPhysicalItem("2").getId());
        assertEquals(cd.getId(), utils.getPhysicalItem("3").getId());
        assertEquals(mag.getId(), utils.getPhysicalItem("4").getId());
    }
    @Test
    void getUserAssociatedItemsTest() throws Exception{
        QueryUtilities utils = new QueryUtilities();

       
        

        Book book = new Book("0", "Game of Thrones", "RM 125", false, new Date().getTime(), 0.0);
        Book book2 = new Book("1", "Game of Thrones2", "RM 125", true, new Date().getTime() + 86400000 * 2, 0.0);
        Book book3 = new Book("2", "Game of Thrones3", "RM 125", true, new Date().getTime() + 86400000 * 2, 0.0);
        
        
       

        bookdb.items.add(book);
        bookdb.items.add(book2);
        bookdb.items.add(book3);
   
        
     
        ArrayList<String> items = new ArrayList<>();
        items.add(book.getId());
        items.add(book2.getId());
        items.add(book3.getId());
        Student student = new Student("0", "John", "e", "p", true, 0.0, true, items,
        new ArrayList<String>(), new ArrayList<Course>(), new ArrayList<String>());

        studentdb.users.add(student);

        assertNotNull(items);
        assertEquals(3, items.size());
        
        studentdb.update();
        studentdb.load();
        assertEquals(items.size(), student.getRented_item_list().size());
        


        assertNotNull(utils.getUserAssociatedItems(student));
        assertEquals(3, utils.getUserAssociatedItems(student).size());
    }

    @Test
    void getExpiringItemsTest() throws Exception {
        BookAccess db = BookAccess.getInstance();
        Long current_date = new Date().getTime();

        Book book = new Book("id", "Name", "location", true, current_date + (long) 1000000000, 0.0);
        Book book2 = new Book("id2", "Name1", "location", true, (long) (24 * 60 * 60 * 1000), 0.0);
        Book book3 = new Book("id3", "Name2", "location", true, (long) (24 * 60 * 60 * 1000), 0.0);
        Book book4 = new Book("id4", "Name3", "location", true, (long) (24 * 60 * 60 * 1000), 0.0);
        FacultyMember prof = new FacultyMember("id", "Name", "location", "password", true, 0.0, true, new ArrayList<>(),
                new ArrayList<>());

        db.items.add(book);
        db.items.add(book2);
        db.items.add(book3);
        db.items.add(book4);
        db.update();

        FacultyMemberAccess profdb = FacultyMemberAccess.getInstance();
        profdb.users.add(prof);
        profdb.update();

        QueryUtilities utils = new QueryUtilities();
        ItemStrategy strat = new RentItem();
        ArrayList<PhysicalItem> items = utils.allPhysicalItems();

        for (PhysicalItem item : items) {
            strat.execute(item.getId(), prof.getId());
        }

        ArrayList<PhysicalItem> expiring_items = utils.getExpiringItems(prof.getId());
        assertEquals(3, expiring_items.size());

        profdb.users = new ArrayList<>();
        db.items = new ArrayList<>();

        db.update();
        profdb.update();

    }
    @Test
    void getExpiringItemsTest2() throws Exception {
        BookAccess db = BookAccess.getInstance();
        Long current_date = new Date().getTime();

        Book book = new Book("id", "Name", "location", true, current_date + (long) 1000000000, 0.0);
      
        FacultyMember prof = new FacultyMember("id", "Name", "location", "password", true, 0.0, true, new ArrayList<>(),
                new ArrayList<>());

        db.items.add(book);
      
        db.update();

        FacultyMemberAccess profdb = FacultyMemberAccess.getInstance();
        profdb.users.add(prof);
        profdb.update();

        QueryUtilities utils = new QueryUtilities();
        ItemStrategy strat = new RentItem();
       

       
        strat.execute(book.getId(), prof.getId());
        

        ArrayList<PhysicalItem> expiring_items = utils.getExpiringItems(prof.getId());
        assertEquals(0, expiring_items.size());

    }

    @Test 
    void getTextbookTest() throws Exception{
        QueryUtilities utils = new QueryUtilities();
        Textbook textbook = new Textbook("5", "DataStructures", "RM 125", false, new Date().getTime()+ 86400000*2, 0.0);
        Book book = new Book("0", "Game of Thrones", "RM 125", false, new Date().getTime(), 0.0);
        bookdb.items.add(book);
        bookdb.items.add(textbook);
        bookdb.update();
        bookdb.load();
        assertNotNull(bookdb.items);
        assertEquals(2, bookdb.items.size());
       
        assertEquals(textbook.getId(), utils.getTextbook("5").getId());
    }
    @Test
    void getTextbookTes2t() throws Exception{
        QueryUtilities utils = new QueryUtilities();
        
        Book book = new Book("0", "Game of Thrones", "RM 125", false, new Date().getTime(), 0.0);
        bookdb.items.add(book);
       
        bookdb.update();
        bookdb.load();
        assertNotNull(bookdb.items);
        assertEquals(1, bookdb.items.size());
       
        assertNull(utils.getTextbook("5"));
    }

   

}
