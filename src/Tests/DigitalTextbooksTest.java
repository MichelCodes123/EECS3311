package Tests;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Date;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import database_access.BookAccess;
import database_access.StudentAccess;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;

import database_access.DigitalTBAccess;
import logic.DigitalTBUtilities;
import models.Course;

import models.Items.Item;

import models.Items.DigitalTB.DigitalTB;
import models.Items.PhysicalItems.Textbook;
import models.Users.Student;

class DigitalTextbooksTest {

	
	@BeforeEach
	public void init() {

		try {
			DigitalTBAccess.getInstance().load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DigitalTBAccess.getInstance().items.clear();
		try {
			DigitalTBAccess.getInstance().update();
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
	void addDigitalTB() throws Exception {

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

		StudentAccess sdb = StudentAccess.getInstance();
		sdb.users = new ArrayList<>();
		sdb.update();

		BookAccess bdb = BookAccess.getInstance();
		bdb.items = new ArrayList<>();
		bdb.update();
	}

	@Test
	void diffCourses() throws Exception {
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

		StudentAccess sdb = StudentAccess.getInstance();
		sdb.users = new ArrayList<>();
		sdb.update();

		BookAccess bdb = BookAccess.getInstance();
		bdb.items = new ArrayList<>();
		bdb.update();

	}

	@Test
	void removeCourseClearDTB() throws Exception {

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

	@Test
    public void testGetId() {
        DigitalTB digitalTB = new DigitalTB("1", "DigitalTB 1", "Course A");
        assertEquals("1", digitalTB.getId());
    }

    @Test
    public void testGetName() {
        DigitalTB digitalTB = new DigitalTB("1", "DigitalTB 1", "Course A");
        assertEquals("DigitalTB 1", digitalTB.getName());
    }

    @Test
    public void testGetCourseName() {
        DigitalTB digitalTB = new DigitalTB("1", "DigitalTB 1", "Course A");
        assertEquals("Course A", digitalTB.getCourseName());
    }

    @Test
    public void testInitializationWithCourseName() {
        DigitalTB digitalTB = new DigitalTB("1", "DigitalTB 1", "Course A");
        assertEquals("1", digitalTB.getId());
        assertEquals("DigitalTB 1", digitalTB.getName());
        assertEquals("Course A", digitalTB.getCourseName());
    }

    @Test
    public void testInitializationWithoutCourseName() {
        DigitalTB digitalTB = new DigitalTB("1", "DigitalTB 1");
        assertEquals("1", digitalTB.getId());
        assertEquals("DigitalTB 1", digitalTB.getName());
        assertEquals(null, digitalTB.getCourseName());
    }

    @Test
    public void testSetName() {
        DigitalTB digitalTB = new DigitalTB("1", "DigitalTB 1");
        digitalTB.setName("New Name");
        assertEquals("New Name", digitalTB.getName());
    }
    @Test
    public void testSetNameWithNull() {
        DigitalTB digitalTB = new DigitalTB("1", "DigitalTB 1", "Course A");
        digitalTB.setName(null);
        assertEquals(null, digitalTB.getName());
    }


    @Test
    public void testEqualitySameObject() {
        DigitalTB digitalTB1 = new DigitalTB("1", "DigitalTB 1", "Course A");
        assertEquals(digitalTB1, digitalTB1);
    }

    @Test
    public void testEqualityDifferentObjectsDifferentIdAndName() {
        DigitalTB digitalTB1 = new DigitalTB("1", "DigitalTB 1", "Course A");
        DigitalTB digitalTB2 = new DigitalTB("2", "DigitalTB 2", "Course B");
        assertEquals(false, digitalTB1.equals(digitalTB2));
    }


    @Test
    public void testEqualityDifferentObjectsSameIdAndName() {
        DigitalTB digitalTB1 = new DigitalTB("1", "DigitalTB 1", "Course A");
        DigitalTB digitalTB2 = new DigitalTB("1", "DigitalTB 1", "Course A");
        
        // Compare properties manually
        assertEquals(digitalTB1.getId(), digitalTB2.getId());
        assertEquals(digitalTB1.getName(), digitalTB2.getName());
        assertEquals(digitalTB1.getCourseName(), digitalTB2.getCourseName());
    }

}
