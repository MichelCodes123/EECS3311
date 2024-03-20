package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import models.Course;
import models.Items.DigitalTB.DigitalTB;
import models.Items.PhysicalItems.Textbook;
import models.Users.Student;

class DigitalTextbooksTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void addDigitalTB() {

		ArrayList<Course> arr = new ArrayList<Course>();

		Student s = new Student("12-00", "Mitochondria", "charge@gmail.com", "password13", true, 0.0, true, null, null,
				arr, new ArrayList<DigitalTB>());

		ArrayList<Textbook> ar = new ArrayList<Textbook>();
		Textbook a = new Textbook("100-23", "Quantum Mechanics", "UpperLibrary", true, new Date(0).getTime(), 25.29);

		ar.add(a);
		arr.add(new Course("EECS2311", ar));
		s.setCourses(arr);

		assertEquals(1, s.getDigital_textbooks().size());

	}

}
