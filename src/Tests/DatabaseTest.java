package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import database_access.BookAccess;
import database_access.CdAccess;
import database_access.FacultyMemberAccess;
import database_access.MagazineAccess;
import database_access.NonFacultyStaffAccess;
import database_access.StudentAccess;
import database_access.VisitorAccess;
import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.Cd;
import models.Items.PhysicalItems.Magazine;
import models.Users.FacultyMember;
import models.Users.NonFacultyStaff;
import models.Users.Student;
import models.Users.Visitor;

public class DatabaseTest {

	@Test
	@DisplayName("BookAccess")
	void testBook() throws Exception {
		BookAccess db = BookAccess.getInstance();
		Book book = new Book("id", "Name", "location", true, new Date().getTime(), 0.0);

		assertEquals(0, db.items.size());

		db.items.add(book);
		assertEquals(1, db.items.size());

		db.update();
		assertEquals(0, db.items.size());

		db.load();
		assertEquals(1, db.items.size());
	}

	@Test
	@DisplayName("CDAccess")
	void testCD() throws Exception {
		CdAccess db = CdAccess.getInstance();
		Cd cd = new Cd("id", "Name", "location", true, new Date().getTime(), 0.0);

		assertEquals(0, db.items.size());

		db.items.add(cd);
		assertEquals(1, db.items.size());

		db.update();
		assertEquals(0, db.items.size());

		db.load();
		assertEquals(1, db.items.size());
	}

	@Test
	@DisplayName("MagazineAccess")
	void testMagazine() throws Exception {
		MagazineAccess db = MagazineAccess.getInstance();
		Magazine magazine = new Magazine("id", "Name", "location", true, new Date().getTime(), 0.0);

		assertEquals(0, db.items.size());

		db.items.add(magazine);
		assertEquals(1, db.items.size());

		db.update();
		assertEquals(0, db.items.size());

		db.load();
		assertEquals(1, db.items.size());
	}

	@Test
	@DisplayName("FacultyAccess")
	void testFaculty() throws Exception {
		FacultyMemberAccess db = FacultyMemberAccess.getInstance();
		FacultyMember prof = new FacultyMember("id", "Name", "location", "password", true, 0.0, true, new ArrayList<>(),
				new ArrayList<>());

		assertEquals(0, db.users.size());

		db.users.add(prof);
		assertEquals(1, db.users.size());

		db.update();
		assertEquals(0, db.users.size());

		db.load();
		assertEquals(1, db.users.size());
	}

	@Test
	@DisplayName("NonFacultyAccess")
	void testNonFaculty() throws Exception {
		NonFacultyStaffAccess db = NonFacultyStaffAccess.getInstance();
		NonFacultyStaff staff = new NonFacultyStaff("id", "Name", "location", "password", true, 0.0, true,
				new ArrayList<>(), new ArrayList<>());

		assertEquals(0, db.users.size());

		db.users.add(staff);
		assertEquals(1, db.users.size());

		db.update();
		assertEquals(0, db.users.size());

		db.load();
		assertEquals(1, db.users.size());
	}

	@Test
	@DisplayName("StudentAccess")
	void testStudent() throws Exception {
		StudentAccess db = StudentAccess.getInstance();
		Student student = new Student("id", "Name", "location", "password", true, 0.0, true, new ArrayList<>(),
				new ArrayList<>(), null, null);

		assertEquals(0, db.users.size());

		db.users.add(student);
		assertEquals(1, db.users.size());

		db.update();
		assertEquals(0, db.users.size());

		db.load();
		assertEquals(1, db.users.size());
	}

	@Test
	@DisplayName("VisitorAccess")
	void testVisitor() throws Exception {
		VisitorAccess db = VisitorAccess.getInstance();
		Visitor visitor = new Visitor("id", "Name", "location", "password", true, 0.0, true, new ArrayList<>(),
				new ArrayList<>());

		assertEquals(0, db.users.size());

		db.users.add(visitor);
		assertEquals(1, db.users.size());

		db.update();
		assertEquals(0, db.users.size());

		db.load();
		assertEquals(1, db.users.size());
	}
}
