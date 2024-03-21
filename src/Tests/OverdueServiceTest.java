package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import database_access.BookAccess;
import database_access.FacultyMemberAccess;
import database_access.StudentAccess;
import models.Items.PhysicalItems.Book;
import models.Users.FacultyMember;
import models.Users.Student;
import models.Users.User;
import services.OverdueService;
import services.itemstrategy.ItemStrategy;
import services.itemstrategy.RentItem;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OverdueServiceTest {
	User student;
	User prof;
	Book book;
	Book book2;
	Book book3;
	Book book4;

	@BeforeEach
	void setup() throws Exception {
		student = new Student("1", "Jimmy", "email", "1234", true, 0.0, true, null, null, null, null);
		prof = new FacultyMember("2", "Tommy", "email", "1234", true, 0.0, true, null, null);

		StudentAccess studentdb = StudentAccess.getInstance();
		studentdb.users.add(student);
		studentdb.update();

		FacultyMemberAccess profdb = FacultyMemberAccess.getInstance();
		profdb.users.add(prof);
		profdb.update();

		book = new Book("0", "Game of Thrones", "RM 125", true, (long) 0, 0.0);
		book2 = new Book("1", "Game of Thrones", "RM 125", true, (long) 0, 0.0);
		book3 = new Book("2", "Game of Thrones", "RM 125", true, (long) 0, 0.0);
		book4 = new Book("3", "Game of Thrones", "RM 125", true, (long) 0, 0.0);
		BookAccess bookdb = BookAccess.getInstance();
		bookdb.items.add(book);
		bookdb.items.add(book2);
		bookdb.items.add(book3);
		bookdb.items.add(book4);
		bookdb.update();
	}

	@Test
	@DisplayName("Applies overdue price to user")
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
	@DisplayName("Locks user")
	void setOverdueBlocker() throws Exception {
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
}
