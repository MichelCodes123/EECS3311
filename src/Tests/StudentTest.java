package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import models.Course;
import models.Users.Student;

public class StudentTest {
    private Student student;

    @Before
    public void setUp() {
        student = new Student("1", "John Doe", "john@example.com", "password", true, 0.0, true,
                new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    }

    @Test
    public void testAddingDigitalTextbooks() {
        student.addDigitalTB("Digital Textbook 1");
        assertTrue(student.getDigital_textbooks().contains("Digital Textbook 1"));
    }

    @Test
    public void testRemovingCourse() {
        Course course = new Course("Math", new ArrayList<>());
        student.getCourses().add(course);
        assertTrue(student.removeCourse(course));
        assertFalse(student.getCourses().contains(course));
    }

    @Test
    public void testGettingDigitalTextbooks() {
        assertEquals(student.getDigital_textbooks(), student.getDigital_textbooks());
    }

    @Test
    public void testGettingCourses() {
        assertEquals(student.getCourses(), student.getCourses());
    }

    @Test
    public void testSettingDigitalTextbooks() {
        ArrayList<String> digitalTextbooks = new ArrayList<>();
        digitalTextbooks.add("Digital Textbook 2");
        student.setDigital_textbooks(digitalTextbooks);
        assertEquals(digitalTextbooks, student.getDigital_textbooks());
    }
    @Test
    public void testRemovingDigitalTextbook() {
        student.addDigitalTB("Digital Textbook 4");
        assertTrue(student.getDigital_textbooks().contains("Digital Textbook 4"));
        student.getDigital_textbooks().remove("Digital Textbook 4");
        assertFalse(student.getDigital_textbooks().contains("Digital Textbook 4"));
    } 
    @Test
    public void testRemovingNonExistentDigitalTextbook() {
        student.addDigitalTB("Digital Textbook 5");
        assertFalse(student.getDigital_textbooks().isEmpty());
        assertFalse(student.getDigital_textbooks().remove("Non Existent Digital Textbook"));
    }

    @Test
    public void testSettingCourses() {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Physics", new ArrayList<>()));
        student.setCourses(courses);
        assertEquals(courses, student.getCourses());
    }

    @Test
    public void testRemovingNonExistentCourse() {
        Course nonExistentCourse = new Course("Chemistry", new ArrayList<>());
        assertFalse(student.removeCourse(nonExistentCourse));
    }

    @Test
    public void testAddingDigitalTextbook() {
        student.addDigitalTB("Digital Textbook 3");
        assertTrue(student.getDigital_textbooks().contains("Digital Textbook 3"));
    }
    
}
