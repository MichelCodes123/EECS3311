package Tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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
		User usr = u.CreateUser("Student", "1011", "Johnny", "j@gmail.com", "pass", true,0.0, true, null, null);
	
		assertTrue(usr instanceof Student);
	}
	@Test
	void verifyFacultyCreated() {
		
		User usr = u.CreateUser("Student", "1011", "Johnny", "j@gmail.com", "pass", true,0.0, true, null, null);
	}
	@Test
	void verifyVisitorCreated() {
		
	}
	@Test
	void verifyNonFacultyCreated() {
		
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
		
	}
	
	@Test
	void verifyNoUserAdded_ForInvalidType() {
		//Make sure the db isnt updated.
	}

}
