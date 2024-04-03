package Tests;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import database_access.FacultyMemberAccess;
import database_access.NonFacultyStaffAccess;
import database_access.QueryUtilities;
import database_access.StudentAccess;
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
	
	
	@BeforeEach
	public void inits() {
		
		VisitorAccess.getInstance().users.clear();
		try {
			VisitorAccess.getInstance().update();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FacultyMemberAccess.getInstance().users.clear();
		try {
			FacultyMemberAccess.getInstance().update();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		NonFacultyStaffAccess.getInstance().users.clear();
		try {
			NonFacultyStaffAccess.getInstance().update();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StudentAccess.getInstance().users.clear();
		try {
			StudentAccess.getInstance().update();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	@AfterEach
	public void ok() {
		inits();
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
	void verifyCorrectFieldStudent() {
		User usr = u.CreateUser("Student", "1011", "Johnny", "j@gmail.com", "pass", true, 0.0, true, null, null);

		assertEquals("Johnny", usr.getName());
	}

	@Test
	void verifyCorrectFieldFaculty() {
		
		User usr = u.CreateUser("FacultyMember", "1011", "Johnny", "j@gmail.com", "pass", true, 0.0, true, null, null);
		assertEquals("Johnny", usr.getName());
	}
	@Test
	void verifyCorrectFieldVisitor() {
		
		User usr = u.CreateUser("Visitor", "1011", "Johnny", "j@gmail.com", "pass", true, 0.0, true, null, null);
		VisitorAccess a = VisitorAccess.getInstance();
		try {
			a.load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("Johnny",a.users.get(0).getName());
	}
	@Test
	void verifyCorrectFieldNonFaculty() {

		User usr = u.CreateUser("NonFacultyStaff", "1011", "Johnny", "j@gmail.com", "pass", true, 0.0, true, null,
				null);
		NonFacultyStaffAccess a = NonFacultyStaffAccess.getInstance();
		try {
			a.load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("Johnny",a.users.get(0).getName());
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
