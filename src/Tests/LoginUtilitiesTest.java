package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import database_access.FacultyMemberAccess;
import database_access.NonFacultyStaffAccess;
import database_access.StudentAccess;
import database_access.VisitorAccess;
import logic.LoginUtilities;

class LoginUtilitiesTest {
	
	
	@BeforeEach
	public void init() {
		
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
		init();
	}
	

	@Test
	void tooShort() {
		LoginUtilities.verifyRegistration("Visitor", "Jeff", "Cheese@gmail.com", "sho",
				(error) -> assertEquals(error, "Password length must be greater than 4"), () -> {
				});
	}

	@Test
	void noUpperCasePass() {
		LoginUtilities.verifyRegistration("Visitor", "Jeff", "Cheese@gmail.com", "pencilandpaper",
				(error) -> assertEquals("Password must contain at least one uppercase letter", error), () -> {
				});

	}

	@Test
	void nolowerCasePass() {
		LoginUtilities.verifyRegistration("Visitor", "Jeff", "Cheese@gmail.com", "PENCILANDPAPER",
				(error) -> assertEquals("Password must contain at least one lowercase letter", error), () -> {
				});

	}


	@Test
	void nodigitPass() {
		LoginUtilities.verifyRegistration("Visitor", "Jeff", "Cheese@gmail.com", "Pencilandpaper",
				(error) -> assertEquals("Password must contain at least one digit", error), () -> {

				});

	}

	@Test
	void emptyFields() {
		LoginUtilities.verifyRegistration("Visitor", "", "Cheese@gmail.com", "Pencilandpaper",
				(error) -> assertEquals("Cannot have empty fields!", error), () -> {
				});
	}
	
	@Test 
	void uniqueEmail(){
		
		LoginUtilities.verifyRegistration("Visitor", "Benjamin", "Cheese@gmail.com", "Pencilandpaper",
				(error) -> {}, () -> {
					
				});
	}
	
	@Test
	void duplicateEmail() {
	
		LoginUtilities.verifyRegistration("Visitor", "Benjamin", "Cheese@gmail.com", "Pencilandpaper1*",
				(error) -> {}, () -> {
				});
	
		LoginUtilities.verifyRegistration("Visitor", "Benjamin", "Cheese@gmail.com", "Pencilandpaper1*",
				(error) -> assertEquals("This email already exists", error), () -> {
					
				});
		
		
	}
	
	@Test
	void verifyStudentAdded() {
		
		LoginUtilities.verifyRegistration("Student", "Benjamin", "Ch@gmail.com", "Pencilandpaper1*",
				(error) -> {}, () -> {
				});
		try {
			StudentAccess.getInstance().load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(1, StudentAccess.getInstance().users.size());
		
	
		
	}
	@Test
	void verifyVisitorAdded() {
		LoginUtilities.verifyRegistration("Visitor", "Benjamin", "C@gmail.com", "Pencilandpaper1*",
				(error) -> {}, () -> {
				});
		
		try {
			VisitorAccess.getInstance().load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(1, VisitorAccess.getInstance().users.size());
		
		
	}
	@Test
	void verifyFacultyAdded() {
		LoginUtilities.verifyRegistration("FacultyMember", "Benjamin", "Jam@gmail.com", "Pencilandpaper1*",
				(error) -> System.out.print(error + "ok"), () -> {
				});
		
		
		try {
			FacultyMemberAccess.getInstance().load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(1, FacultyMemberAccess.getInstance().users.size());
	
	
	}
	@Test
	void verifyNonFacultyAdded() {
		LoginUtilities.verifyRegistration("NonFacultyStaff", "Benjamin", "Ben@gmail.com", "Pencilandpaper1*",
				(error) -> {}, () -> {
				});

		
		try {
			NonFacultyStaffAccess.getInstance().load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(1, NonFacultyStaffAccess.getInstance().users.size());
		
	
	

		
	}
	
	
	
	
	
	

}