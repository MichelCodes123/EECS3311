package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Date;

import database_access.*;
import models.Items.PhysicalItems.Cd;
import models.Items.PhysicalItems.Magazine;
import models.Items.PhysicalItems.Textbook;
import models.Users.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import models.Items.PhysicalItems.Book;
import services.itemstrategy.ItemStrategy;
import services.itemstrategy.RentItem;

public class RentApplicationTest {

	@Test
	@DisplayName("RentTestStudent")
	void testRentalServiceStudent() throws Exception {
		Student student = new Student("1", "Jimmy", "email", "1234", true, 0.0, true, null, null, null, new ArrayList<>());
		FacultyMember prof = new FacultyMember("2", "Tommy", "email", "1234", true, 0.0, true, new ArrayList<String>(),
				new ArrayList<>());
		Book book = new Book("0", "Game of Thrones", "RM 125", true, new Date().getTime(), 0.0);

		StudentAccess studentdb = StudentAccess.getInstance();
		studentdb.users.add(student);
		studentdb.update();

		FacultyMemberAccess profdb = FacultyMemberAccess.getInstance();
		profdb.users.add(prof);
		profdb.update();

		BookAccess bookdb = BookAccess.getInstance();
		bookdb.items.add(book);
		bookdb.update();

		ItemStrategy strat = new RentItem();
		strat.execute(book.getId(), student.getId());
		studentdb.load();
		assertEquals(1, studentdb.users.get(0).getRented_item_list().size());
		studentdb.update();


        QueryUtilities utils = new QueryUtilities();
        ArrayList<User> users = utils.allUsers();
        assertEquals(2, users.size());

        studentdb.users = new ArrayList<>();
        profdb.users = new ArrayList<>();
        bookdb.items = new ArrayList<>();

        studentdb.update();
        bookdb.update();
        profdb.update();
    }

    @Test
    @DisplayName("RentTestVisitor")
    void testRentalServiceVisitor() throws Exception {
        Visitor visitor = new Visitor("1", "Jimmy", "email", "1234", true, 0.0, true, null, null);
        FacultyMember prof = new FacultyMember("2", "Tommy", "email", "1234", true, 0.0, true, new ArrayList<String>(),
                new ArrayList<>());
        Book book = new Book("1", "Game of Thrones", "RM 125", true, new Date().getTime(), 0.0);

        VisitorAccess visitdb = VisitorAccess.getInstance();
        visitdb.users.add(visitor);
        visitdb.update();

        FacultyMemberAccess profdb = FacultyMemberAccess.getInstance();
        profdb.users.add(prof);
        profdb.update();

        BookAccess bookdb = BookAccess.getInstance();
        bookdb.items.add(book);
        bookdb.update();

        ItemStrategy strat = new RentItem();
        strat.execute(book.getId(), visitor.getId());
        visitdb.load();
        assertEquals(1, visitdb.users.get(0).getRented_item_list().size());
        visitdb.update();


        QueryUtilities utils = new QueryUtilities();
        ArrayList<User> users = utils.allUsers();
        assertEquals(2, users.size());


        visitdb.users = new ArrayList<>();
        profdb.users = new ArrayList<>();
        bookdb.items = new ArrayList<>();

        visitdb.update();
        bookdb.update();
        profdb.update();
    }

    @Test
    @DisplayName("RentTestProf")
    void testRentalServiceProf() throws Exception {
        Visitor visitor = new Visitor("1", "Jimmy", "email", "1234", true, 0.0, true, null, null);
        FacultyMember prof = new FacultyMember("2", "Tommy", "email", "1234", true, 0.0, true, new ArrayList<String>(),
                new ArrayList<>());
        Book book = new Book("1", "Game of Thrones", "RM 125", true, new Date().getTime(), 0.0);

        VisitorAccess visitdb = VisitorAccess.getInstance();
        visitdb.users.add(visitor);
        visitdb.update();

        FacultyMemberAccess profdb = FacultyMemberAccess.getInstance();
        profdb.users.add(prof);
        profdb.update();

        BookAccess bookdb = BookAccess.getInstance();
        bookdb.items.add(book);
        bookdb.update();

        ItemStrategy strat = new RentItem();
        strat.execute(book.getId(), prof.getId());
        profdb.load();
        assertEquals(1, profdb.users.get(0).getRented_item_list().size());
        profdb.update();


        QueryUtilities utils = new QueryUtilities();
        ArrayList<User> users = utils.allUsers();
        assertEquals(2, users.size());


        visitdb.users = new ArrayList<>();
        profdb.users = new ArrayList<>();
        bookdb.items = new ArrayList<>();

        visitdb.update();
        bookdb.update();
        profdb.update();
    }


    @Test
    @DisplayName("RentTestStaff")
    void testRentalServiceStaff() throws Exception {
        NonFacultyStaff staff = new NonFacultyStaff("1", "Jimmy", "email", "1234", true, 0.0, true, null, null);
        FacultyMember prof = new FacultyMember("2", "Tommy", "email", "1234", true, 0.0, true, new ArrayList<String>(),
                new ArrayList<>());
        Book book = new Book("1", "Game of Thrones", "RM 125", true, new Date().getTime(), 0.0);

        NonFacultyStaffAccess staffdb = NonFacultyStaffAccess.getInstance();
        staffdb.users.add(staff);
        staffdb.update();

        FacultyMemberAccess profdb = FacultyMemberAccess.getInstance();
        profdb.users.add(prof);
        profdb.update();

        BookAccess bookdb = BookAccess.getInstance();
        bookdb.items.add(book);
        bookdb.update();

        ItemStrategy strat = new RentItem();
        strat.execute(book.getId(), staff.getId());
        staffdb.load();
        assertEquals(1, staffdb.users.get(0).getRented_item_list().size());
        staffdb.update();


        QueryUtilities utils = new QueryUtilities();
        ArrayList<User> users = utils.allUsers();
        assertEquals(2, users.size());


        staffdb.users = new ArrayList<>();
        profdb.users = new ArrayList<>();
        bookdb.items = new ArrayList<>();

        staffdb.update();
        bookdb.update();
        profdb.update();
    }


    @Test
    @DisplayName("RentTestCd")
    void testRentalServiceCd() throws Exception {
        NonFacultyStaff staff = new NonFacultyStaff("1", "Jimmy", "email", "1234", true, 0.0, true, null, null);
        FacultyMember prof = new FacultyMember("2", "Tommy", "email", "1234", true, 0.0, true, new ArrayList<String>(),
                new ArrayList<>());
        Cd Cd = new Cd("1", "Game of Thrones", "RM 125", true, new Date().getTime(), 0.0);

        NonFacultyStaffAccess staffdb = NonFacultyStaffAccess.getInstance();
        staffdb.users.add(staff);
        staffdb.update();

        FacultyMemberAccess profdb = FacultyMemberAccess.getInstance();
        profdb.users.add(prof);
        profdb.update();

        CdAccess itemdb = CdAccess.getInstance();
        itemdb.items.add(Cd);
        itemdb.update();

        ItemStrategy strat = new RentItem();
        strat.execute(Cd.getId(), staff.getId());
        staffdb.load();
        assertEquals(1, staffdb.users.get(0).getRented_item_list().size());
        staffdb.update();


        QueryUtilities utils = new QueryUtilities();
        ArrayList<User> users = utils.allUsers();
        assertEquals(2, users.size());


        staffdb.users = new ArrayList<>();
        profdb.users = new ArrayList<>();
        itemdb.items = new ArrayList<>();

        staffdb.update();
        itemdb.update();
        profdb.update();
    }

    @Test
    @DisplayName("RentTestMagazine")
    void testRentalServiceMagazine() throws Exception {
        NonFacultyStaff staff = new NonFacultyStaff("1", "Jimmy", "email", "1234", true, 0.0, true, null, null);
        FacultyMember prof = new FacultyMember("2", "Tommy", "email", "1234", true, 0.0, true, new ArrayList<String>(),
                new ArrayList<>());
        Magazine magazine = new Magazine("1", "Game of Thrones", "RM 125", true, new Date().getTime(), 0.0);


        NonFacultyStaffAccess staffdb = NonFacultyStaffAccess.getInstance();
        staffdb.users.add(staff);
        staffdb.update();

        FacultyMemberAccess profdb = FacultyMemberAccess.getInstance();
        profdb.users.add(prof);
        profdb.update();

        CdAccess itemdb = CdAccess.getInstance();
        itemdb.items.add(magazine);
        itemdb.update();

        ItemStrategy strat = new RentItem();
        strat.execute(magazine.getId(), staff.getId());
        staffdb.load();
        assertEquals(1, staffdb.users.get(0).getRented_item_list().size());
        staffdb.update();


        QueryUtilities utils = new QueryUtilities();
        ArrayList<User> users = utils.allUsers();
        assertEquals(2, users.size());


        staffdb.users = new ArrayList<>();
        profdb.users = new ArrayList<>();
        itemdb.items = new ArrayList<>();

        staffdb.update();
        itemdb.update();
        profdb.update();
    }


    @Test
    @DisplayName("RentTestTextbook")
    void testRentalServiceTextbook() throws Exception {
        NonFacultyStaff staff = new NonFacultyStaff("1", "Jimmy", "email", "1234", true, 0.0, true, null, null);
        FacultyMember prof = new FacultyMember("2", "Tommy", "email", "1234", true, 0.0, true, new ArrayList<String>(),
                new ArrayList<>());
        Textbook textbook = new Textbook("1", "Game of Thrones", "RM 125", true, new Date().getTime(), 0.0);


        NonFacultyStaffAccess staffdb = NonFacultyStaffAccess.getInstance();
        staffdb.users.add(staff);
        staffdb.update();

        FacultyMemberAccess profdb = FacultyMemberAccess.getInstance();
        profdb.users.add(prof);
        profdb.update();

        CdAccess itemdb = CdAccess.getInstance();
        itemdb.items.add(textbook);
        itemdb.update();

        ItemStrategy strat = new RentItem();
        strat.execute(textbook.getId(), staff.getId());
        staffdb.load();
        assertEquals(1, staffdb.users.get(0).getRented_item_list().size());
        staffdb.update();


        QueryUtilities utils = new QueryUtilities();
        ArrayList<User> users = utils.allUsers();
        assertEquals(2, users.size());


        staffdb.users = new ArrayList<>();
        profdb.users = new ArrayList<>();
        itemdb.items = new ArrayList<>();

        staffdb.update();
        itemdb.update();
        profdb.update();
    }

    @Test
    @DisplayName("ErrorThrowing")
    void testCapacityError() throws Exception {

        ArrayList<String> list = new ArrayList<>();
        for (Integer i = 10; i <= 21; i++) {
            list.add(i.toString());
        }

        NonFacultyStaff staff = new NonFacultyStaff("1", "Jimmy", "email", "1234", true, 0.0, true, list,null);
        Book book = new Book("1", "Game of Thrones", "RM 125", true, new Date().getTime(), 0.0);

        NonFacultyStaffAccess staffdb = NonFacultyStaffAccess.getInstance();
        staffdb.users.add(staff);
        staffdb.update();


        BookAccess bookdb = BookAccess.getInstance();
        bookdb.items.add(book);
        bookdb.update();

        ItemStrategy strat = new RentItem();

        assertThrows(Exception.class, () -> {
            strat.execute(book.getId(), staff.getId());
        });



        staffdb.users = new ArrayList<>();
        bookdb.items = new ArrayList<>();

        staffdb.update();
        bookdb.update();
    }

    @Test
    @DisplayName("ErrorThrowing")
    void testCapacityErrorEdge() throws Exception {

        ArrayList<String> list = new ArrayList<>();
        for (Integer i = 10; i <= 19; i++) {
            list.add(i.toString());
        }

        assertEquals(10, list.size());
        NonFacultyStaff staff = new NonFacultyStaff("1", "Jimmy", "email", "1234", true, 0.0, true, list,null);
        Book book = new Book("1", "Game of Thrones", "RM 125", true, new Date().getTime(), 0.0);

        NonFacultyStaffAccess staffdb = NonFacultyStaffAccess.getInstance();
        staffdb.users.add(staff);
        staffdb.update();


        BookAccess bookdb = BookAccess.getInstance();
        bookdb.items.add(book);
        bookdb.update();

        ItemStrategy strat = new RentItem();

        assertThrows(Exception.class, () -> {
            strat.execute(book.getId(), staff.getId());
        });



        staffdb.users = new ArrayList<>();
        bookdb.items = new ArrayList<>();

        staffdb.update();
        bookdb.update();
    }

}
