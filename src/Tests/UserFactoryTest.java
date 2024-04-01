package Tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import logic.UserFactory;

class UserFactoryTest {

	UserFactory u; 
	
	@BeforeAll
	void init() {
		u = new UserFactory();
	}

	@Test
	void verifyStudentCreated() {
		
		UserFactory u = new UserFactory();
		
	}
	@Test
	void verifyFacultyCreated() {
		
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
