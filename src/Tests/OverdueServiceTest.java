package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import database_access.*;
import models.Items.PhysicalItems.Cd;
import models.Items.PhysicalItems.Magazine;
import models.Items.PhysicalItems.PhysicalItem;
import models.Users.*;
import org.junit.After;
import org.junit.jupiter.api.*;

import models.Items.PhysicalItems.Book;
import org.junit.jupiter.api.TestInstance;
import services.OverdueService;
import services.itemstrategy.ItemStrategy;
import services.itemstrategy.RentItem;

import java.util.ArrayList;
import java.util.Date;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OverdueServiceTest {
	User student;
	User prof;
	User visitor;
	User staff;
	Book book;
	Book book2;
	Book book3;
	Book book4;
	Book book5;
	Cd cd;
	Magazine magazine;

	@BeforeEach
	void setup() throws Exception {
		student = new Student("1", "Jimmy", "email", "1234", true, 0.0, true, null, null, null, new ArrayList<>());
		prof = new FacultyMember("2", "Tommy", "email", "1234", true, 0.0, true, null, null);
		staff = new NonFacultyStaff("3", "Tommy", "email", "1234", true, 0.0, true, null, null);
		visitor = new Visitor("4", "Tommy", "email", "1234", true, 0.0, true, null, null);

		StudentAccess studentdb = StudentAccess.getInstance();
		studentdb.users.add(student);
		studentdb.update();

		FacultyMemberAccess profdb = FacultyMemberAccess.getInstance();
		profdb.users.add(prof);
		profdb.update();

		NonFacultyStaffAccess staffdb = NonFacultyStaffAccess.getInstance();
		staffdb.users.add(staff);
		staffdb.update();

		VisitorAccess visitdb = VisitorAccess.getInstance();
		visitdb.users.add(visitor);
		visitdb.update();

		book = new Book("0", "Game of Thrones", "RM 125", true, new Date().getTime() - 110000000, 0.0);
		book2 = new Book("1", "Game of Thrones", "RM 125", true, new Date().getTime() - 100000000, 0.0);
		book3 = new Book("2", "Game of Thrones", "RM 125", true, new Date().getTime() - 100000000, 0.0);
		book4 = new Book("3", "Game of Thrones", "RM 125", true, new Date().getTime() - 100000000, 0.0);


		book5 = new Book("4", "Game of Thrones", "RM 125", true, new Date().getTime() - 1900000000, 0.0);
		cd = new Cd("5", "Game of Thrones", "RM 125", true, new Date().getTime() - 1900000000, 0.0);
		magazine = new Magazine("6", "Game of Thrones", "RM 125", true, new Date().getTime() - 1900000000, 0.0);


		BookAccess bookdb = BookAccess.getInstance();
		bookdb.items.add(book);
		bookdb.items.add(book2);
		bookdb.items.add(book3);
		bookdb.items.add(book4);
		bookdb.items.add(book5);
		bookdb.update();


		CdAccess cddb = CdAccess.getInstance();
		cddb.items.add(cd);
		cddb.update();

		MagazineAccess magazinedb = MagazineAccess.getInstance();
		magazinedb.items.add(magazine);
		magazinedb.update();
	}

	@AfterEach
	void teardown() throws Exception {
		StudentAccess studentdb = StudentAccess.getInstance();
		studentdb.users = new ArrayList<>();
		studentdb.update();

		FacultyMemberAccess profdb = FacultyMemberAccess.getInstance();
		profdb.users = new ArrayList<>();
		profdb.update();

		VisitorAccess visitdb = VisitorAccess.getInstance();
		visitdb.users = new ArrayList<>();
		visitdb.update();

		NonFacultyStaffAccess staffdb = NonFacultyStaffAccess.getInstance();
		staffdb.users = new ArrayList<>();
		staffdb.update();

		BookAccess bookdb = BookAccess.getInstance();
		bookdb.items = new ArrayList<>();
		bookdb.update();

		CdAccess cddb = CdAccess.getInstance();
		cddb.items = new ArrayList<>();
		cddb.update();

		MagazineAccess magdb = MagazineAccess.getInstance();
		magdb.items = new ArrayList<>();
		magdb.update();
	}

	@Test
	@DisplayName("Applies overdue price to student")
	void testOverduePrice() throws Exception {
		ItemStrategy strat = new RentItem();
		strat.execute(book.getId(), student.getId());

		OverdueService overdue = new OverdueService();
		overdue.reviewOverdueItems();

		StudentAccess studentdb = StudentAccess.getInstance();
		studentdb.load();
		student = studentdb.users.get(0);

		assertEquals(0.5, student.getOverdue_charge());
	}

	@Test
	@DisplayName("Locks staff")
	void setOverdueBlocker() throws Exception {
		ItemStrategy strat = new RentItem();
		strat.execute(book.getId(), staff.getId());
		strat.execute(book2.getId(), staff.getId());
		strat.execute(book3.getId(), staff.getId());
		strat.execute(book4.getId(), staff.getId());

		OverdueService overdue = new OverdueService();
		overdue.reviewOverdueItems();

		NonFacultyStaffAccess staffdb = NonFacultyStaffAccess.getInstance();
		staffdb.load();
		staff = staffdb.users.get(0);

		assertEquals(false, staff.getCan_borrow());
	}


	@Test
	@DisplayName("Applies overdue price to staff")
	void testOverduePriceStaff() throws Exception {
		ItemStrategy strat = new RentItem();
		strat.execute(book.getId(), staff.getId());

		OverdueService overdue = new OverdueService();
		overdue.reviewOverdueItems();

		NonFacultyStaffAccess staffdb = NonFacultyStaffAccess.getInstance();
		staffdb.load();
		staff = staffdb.users.get(0);

		assertEquals(0.5, staff.getOverdue_charge());
	}

	@Test
	@DisplayName("Locks student")
	void setOverdueBlockerStaff() throws Exception {
		ItemStrategy strat = new RentItem();
		strat.execute(book.getId(), student.getId());
		strat.execute(book2.getId(), student.getId());
		strat.execute(book3.getId(), student.getId());
		strat.execute(book4.getId(), student.getId());

		OverdueService overdue = new OverdueService();
		overdue.reviewOverdueItems();

		StudentAccess studentdb = StudentAccess.getInstance();
		studentdb.load();
		student = studentdb.users.get(0);

		assertEquals(false, student.getCan_borrow());
	}

	@Test
	@DisplayName("Locks visitor")
	void setOverdueBlockerVisitor() throws Exception {
		ItemStrategy strat = new RentItem();
		strat.execute(book.getId(), visitor.getId());
		strat.execute(book2.getId(), visitor.getId());
		strat.execute(book3.getId(), visitor.getId());
		strat.execute(book4.getId(), visitor.getId());

		OverdueService overdue = new OverdueService();
		overdue.reviewOverdueItems();

		VisitorAccess db = VisitorAccess.getInstance();
		db.load();
		visitor = db.users.get(0);

		assertEquals(false, visitor.getCan_borrow());
	}

	@Test
	@DisplayName("Applies overdue price to prof")
	void testOverduePriceProf() throws Exception {
		ItemStrategy strat = new RentItem();
		strat.execute(book.getId(), prof.getId());

		OverdueService overdue = new OverdueService();
		overdue.reviewOverdueItems();

		FacultyMemberAccess staffdb = FacultyMemberAccess.getInstance();
		staffdb.load();
		prof = staffdb.users.get(0);

		assertEquals(0.5, prof.getOverdue_charge());
	}

	@Test
	@DisplayName("Locks prof")
	void setOverdueBlockerProf() throws Exception {
		ItemStrategy strat = new RentItem();
		strat.execute(book.getId(), prof.getId());
		strat.execute(book2.getId(), prof.getId());
		strat.execute(book3.getId(), prof.getId());
		strat.execute(book4.getId(), prof.getId());

		OverdueService overdue = new OverdueService();
		overdue.reviewOverdueItems();

		FacultyMemberAccess db = FacultyMemberAccess.getInstance();
		db.load();
		prof = db.users.get(0);

		assertEquals(false, prof.getCan_borrow());
	}

	@Test
	@DisplayName("Lost items are discarded")
	void discardLostItems() throws Exception {
		QueryUtilities utils = new QueryUtilities();
		ArrayList<PhysicalItem> items = utils.allPhysicalItems();

		assertEquals(7, items.size());


		ItemStrategy strat = new RentItem();
		strat.execute(book5.getId(), prof.getId());
		strat.execute(cd.getId(), prof.getId());
		strat.execute(magazine.getId(), prof.getId());

		FacultyMemberAccess db = FacultyMemberAccess.getInstance();
		db.load();
		prof = db.users.get(0);

		assertEquals(3, prof.getRented_item_list().size());

		OverdueService service = new OverdueService();
		service.reviewOverdueItems();

		items = utils.allPhysicalItems();
		assertEquals(4, items.size());
	}

}
