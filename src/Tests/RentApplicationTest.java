package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import database_access.BookAccess;
import database_access.FacultyMemberAccess;
import database_access.QueryUtilities;
import database_access.StudentAccess;
import models.Items.PhysicalItems.Book;
import models.Users.FacultyMember;
import models.Users.Student;
import models.Users.User;
import services.itemstrategy.ItemStrategy;
import services.itemstrategy.RentItem;

public class RentApplicationTest {

	@Test
	@DisplayName("RentTest")
	void testRentalService() throws Exception {
		Student student = new Student("1", "Jimmy", "email", "1234", true, 0.0, true, null, null, null, null);
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
	}
}
