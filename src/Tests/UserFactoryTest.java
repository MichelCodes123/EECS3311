package Tests;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import database_access.FacultyMemberAccess;
import database_access.NonFacultyStaffAccess;
import database_access.QueryUtilities;
import database_access.VisitorAccess;
import logic.UserFactory;
import models.Users.Student;
import models.Users.User;

class UserFactoryTest {

	public static UserFactory u;

	@BeforeAll
	static void init() {
		u = new UserFactory();
	}

	@Test
	void verifyStudentCreated() {
		User usr = u.CreateUser("Student", "1011", "Johnny", "j@gmail.com", "pass", true, 0.0, true, null, null);

		assertTrue(usr instanceof Student);
	}

	@Test
	void verifyFacultyCreated() {

		User usr = u.CreateUser("FacultyMember", "1011", "Johnny", "j@gmail.com", "pass", true, 0.0, true, null, null);

		assertEquals(1, FacultyMemberAccess.getInstance().users.size());
	}

	@Test
	void verifyVisitorCreated() {
		User usr = u.CreateUser("Visitor", "1011", "Johnny", "j@gmail.com", "pass", true, 0.0, true, null, null);

		assertEquals(1, VisitorAccess.getInstance().users.size());

	}

	@Test
	void verifyNonFacultyCreated() {
		User usr = u.CreateUser("NonFacultyStaff", "1011", "Johnny", "j@gmail.com", "pass", true, 0.0, true, null,
				null);

		assertEquals(1, NonFacultyStaffAccess.getInstance().users.size());

	}

	@Test
	void verifyPersistedFieldStudent() {

	}

	@Test
	void verifyPersistedFieldFaculty() {

	}

	@Test
	void verifyPersistedFieldVisitor() {

	}

	@Test
	void verifyPersistedFieldNonFaculty() {

	}

	@Test
	void verifyInvalidType() {
		
		assertNull(u.CreateUser("NotValid", "1011", "Johnny", "j@gmail.com", "pass", true,0.0, true, null, null));

	}

	@Test
	void verifyNoUserAdded_ForInvalidType() {
		
		User usr = u.CreateUser("Student", "1011", "Johnny", "j@gmail.com", "pass", true, 0.0, true, null, null);
		QueryUtilities u = new QueryUtilities();
		try {
			assertEquals(0, u.allUsers().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
