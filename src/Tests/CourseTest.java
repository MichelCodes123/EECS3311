package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import models.Course;
import models.Items.PhysicalItems.Textbook;

public class CourseTest {
    private Course course;
    private Textbook textbook1;
    private Textbook textbook2;

    @Before
    public void setUp() {
        textbook1 = new Textbook("1", "Introduction to Biology", "Library A", true, null, 50.0);
        textbook2 = new Textbook("2", "Chemistry Basics", "Library B", true, null, 40.0);
        ArrayList<Textbook> textbooks = new ArrayList<>();
        textbooks.add(textbook1);
        course = new Course("Biology 101", textbooks);
    }

    @Test
    public void testConstructor2() {
    	Course c = new Course("Intro to Chem");
    	assertEquals("Intro to Chem", c.getName());
    }
    @Test
    public void testGetCode() {
        course.setCode(123);
        assertEquals(123, course.getCode());
    }

    @Test
    public void testGetName() {
        assertEquals("Biology 101", course.getName());
    }

    @Test
    public void testSetName() {
        course.setName("Chemistry 101");
        assertEquals("Chemistry 101", course.getName());
    }

    @Test
    public void testGetTextbooks() {
        assertEquals(1, course.getTextbooks().size());
        assertTrue(course.getTextbooks().contains(textbook1));
    }

    @Test
    public void testSetTextbook() {
        ArrayList<Textbook> textbooks = new ArrayList<>();
        textbooks.add(textbook2);
        course.setTextbook(textbooks);
        assertEquals(1, course.getTextbooks().size());
        assertTrue(course.getTextbooks().contains(textbook2));
    }

    @Test
    public void testAddTextbook() {
        course.addTextbook(textbook2);
        assertEquals(2, course.getTextbooks().size());
        assertTrue(course.getTextbooks().contains(textbook2));
    }

    @Test
    public void testAddMultipleTextbooks() {
        course.addTextbook(textbook2);
        assertEquals(2, course.getTextbooks().size());
        assertTrue(course.getTextbooks().contains(textbook1));
        assertTrue(course.getTextbooks().contains(textbook2));
    }


    @Test
    public void testGetTextbooksEmpty() {
        Course emptyCourse = new Course("Physics 101", new ArrayList<>());
        assertTrue(emptyCourse.getTextbooks().isEmpty());
    }


    @Test
    public void testSetNameNull() {
        course.setName(null);
        assertNull(course.getName());
    }

    @Test
    public void testGetCodeDefault() {
        assertEquals(0, course.getCode());
    }
}
