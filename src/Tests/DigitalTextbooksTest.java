package Tests;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Date;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import database_access.DigitalTBAccess;
import database_access.VisitorAccess;
import logic.DigitalTBUtilities;
import models.Course;
import models.Items.Item;
import models.Items.DigitalTB.DigitalTB;
import models.Items.PhysicalItems.Textbook;
import models.Users.Student;

class DigitalTextbooksTest {

	
	
	@BeforeEach
	public void init() {
		
		DigitalTBAccess.getInstance().items.clear();
		try {
			VisitorAccess.getInstance().update();
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
	void addDigitalTB() {

		ArrayList<Course> arr = new ArrayList<Course>();

		Student s = new Student("12-00", "Mitochondria", "charge@gmail.com", "password13", true, 0.0, true, null, null,
				arr, new ArrayList<String>());

		ArrayList<Textbook> ar = new ArrayList<Textbook>();
		Textbook a = new Textbook("100-23", "Quantum Mechanics", "UpperLibrary", true, new Date(0).getTime(), 25.29);

		ar.add(a);
		arr.add(new Course("EECS2311", ar));
		s.setCourses(arr);

		try {
			DigitalTBAccess.getInstance().load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(1, DigitalTBAccess.getInstance().items.size());

	}

	@Test
	void diffCourses() {
		ArrayList<Course> arr = new ArrayList<Course>();

		Student s = new Student("12-00", "Mitochondria", "charge@gmail.com", "password13", true, 0.0, true, null, null,
				arr, new ArrayList<String>());

		ArrayList<Textbook> ar1 = new ArrayList<Textbook>();
		Textbook a = new Textbook("100-23", "Quantum Mechanics", "UpperLibrary", true, new Date(0).getTime(), 25.29);
		ar1.add(a);
		ArrayList<Textbook> ar2 = new ArrayList<Textbook>();
		Textbook b = new Textbook("100-24", "Advanced Controllers", "UpperLibrary", true, new Date(0).getTime(), 25.29);
		ar2.add(b);
		arr.add(new Course("EECS2311", ar1));
		arr.add(new Course("PHYS2211", ar2));

		s.setCourses(arr);
		
		try {
			DigitalTBAccess.getInstance().load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(2, DigitalTBAccess.getInstance().items.size());

	}

	@Test
	void removeCourseClearDTB() {

		ArrayList<Course> arr = new ArrayList<Course>();

		Student s = new Student("12-00", "Mitochondria", "charge@gmail.com", "password13", true, 0.0, true, null, null,
				arr, new ArrayList<String>());

		ArrayList<Textbook> ar1 = new ArrayList<Textbook>();
		Textbook a = new Textbook("100-23", "Quantum Mechanics", "UpperLibrary", true, new Date(0).getTime(), 25.29);
		ar1.add(a);
		ArrayList<Textbook> ar2 = new ArrayList<Textbook>();
		Textbook b = new Textbook("100-24", "Advanced Controllers", "UpperLibrary", true, new Date(0).getTime(), 25.29);
		ar2.add(b);
		Course a1 = new Course("EECS2311", ar1);
		Course a2 = new Course("PHYS2211", ar2);
		arr.add(a1);
		arr.add(a2);

		s.setCourses(arr);
		s.removeCourse(a2);

		try {
			DigitalTBAccess.getInstance().load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(1, DigitalTBAccess.getInstance().items.size());

	}
	
	@Test 
	void testDigitize() {
		
		Textbook a = new Textbook("100-23", "Quantum Mechanics", "UpperLibrary", true, new Date(0).getTime(), 25.29);
		Item b = DigitalTBUtilities.digitize(a, "EECS2311");
		assertTrue(b instanceof DigitalTB);
		
	}
	
	@Test 
	void testDigitizeName() {
		
		Textbook a = new Textbook("100-23", "Quantum Mechanics", "UpperLibrary", true, new Date(0).getTime(), 25.29);
		Item b = DigitalTBUtilities.digitize(a, "EECS2311");
		assertEquals(b.getName(), "Quantum Mechanics");
		
	}
	@Test 
	void testDigitizeId(){
		
		Textbook a = new Textbook("100-23", "Quantum Mechanics", "UpperLibrary", true, new Date(0).getTime(), 25.29);
		Item b = DigitalTBUtilities.digitize(a, "EECS2311");
		assertEquals(b.getId(), "100-23");
		
	}
	@Test 
	void testDigitizeCourseName(){
		
		Textbook a = new Textbook("100-23", "Quantum Mechanics", "UpperLibrary", true, new Date(0).getTime(), 25.29);
		Item b = DigitalTBUtilities.digitize(a, "EECS2311");
		assertEquals(((DigitalTB) b).getCourseName(), "EECS2311");
		
	}
	
	@Test
	void courseNoTB() {
		ArrayList<Course> arr = new ArrayList<Course>();

		Student s = new Student("12-00", "Mitochondria", "charge@gmail.com", "password13", true, 0.0, true, null, null,
				arr, new ArrayList<String>());
		
		arr.add(new Course("EECS2311"));
		
		s.setCourses(arr);
	
		try {
			DigitalTBAccess.getInstance().load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(0, DigitalTBAccess.getInstance().items.size());

		
	}
	
	@Test
	void testNullTB() {
		
		Textbook a = new Textbook("100-23", "Quantum Mechanics", "UpperLibrary", true, new Date(0).getTime(), 25.29);
		Item b = DigitalTBUtilities.digitize(null, "EECS2311");
		assertNull(b);
		
	}
	
	@Test
	void testBlankCourseName() {
		
		Textbook a = new Textbook("100-23", "Quantum Mechanics", "UpperLibrary", true, new Date(0).getTime(), 25.29);
		Item b = DigitalTBUtilities.digitize(a, "");
		assertNull(b);
		
	}
	
	
	
	

}
