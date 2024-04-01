package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;
import java.util.ArrayList;

import database_access.BookAccess;
import database_access.StudentAccess;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import models.Course;
import models.Items.PhysicalItems.Textbook;
import models.Users.Student;

class DigitalTextbooksTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
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

		assertEquals(1, s.getDigital_textbooks().size());

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
		assertEquals(2, s.getDigital_textbooks().size());

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

		assertEquals(1, s.getDigital_textbooks().size());

		StudentAccess sdb = StudentAccess.getInstance();
		sdb.users = new ArrayList<>();
		sdb.update();

		BookAccess bdb = BookAccess.getInstance();
		bdb.items = new ArrayList<>();
		bdb.update();

	}

}
