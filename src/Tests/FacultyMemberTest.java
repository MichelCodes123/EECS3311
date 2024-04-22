package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Prompts.SystemPrompts;
import Prompts.SystemWarnings;
import models.Users.FacultyMember;

public class FacultyMemberTest {

    private FacultyMember facultyMember;

    @Before
    public void setUp() {
        facultyMember = new FacultyMember("1", "John Doe", "john@example.com", "password123", true, 0.5, true,
                new ArrayList<>(), new ArrayList<>());
    }

    @Test
    public void testGetTeachingCoursesEmpty() {
        assertTrue(facultyMember.getTeachingCourses().isEmpty());
    }

    @Test
    public void testAddCourse() {
        facultyMember.addCourse("Biology 101");
        assertEquals(1, facultyMember.getTeachingCourses().size());
        assertTrue(facultyMember.getTeachingCourses().contains("Biology 101"));
    }

    @Test
    public void testGetPreviousTextbooksUsedEmpty() {
        assertTrue(facultyMember.getPreviousTextbooksUsed().isEmpty());
    }

    @Test
    public void testAddTextbookUsed() {
        facultyMember.addTextbookUsed("Introduction to Biology");
        assertEquals(1, facultyMember.getPreviousTextbooksUsed().size());
        assertTrue(facultyMember.getPreviousTextbooksUsed().contains("Introduction to Biology"));
    }

    @Test
    public void testUpdateNotification() {
        String message = "Your textbook request has been approved.";
        SystemPrompts prompt = new SystemWarnings(message);
        assertEquals("Faculty Member Notification: " + message, facultyMember.update(prompt));
    }

    @Test
    public void testGetLastNotification() {
        String message = "Your textbook request has been approved.";
        SystemPrompts prompt = new SystemWarnings(message);
        facultyMember.update(prompt);
        assertEquals("Faculty Member Notification: " + message, facultyMember.getLastNotification());
    }
     @Test
     public void testGetId() {
         assertEquals("1", facultyMember.getId());
      }
      @Test
      public void testGetName() {
          assertEquals("John Doe", facultyMember.getName());
       }
      
      @Test
      public void testAddTextbookUsedAddsToPreviousTextbooksUsedList() {
          facultyMember.addTextbookUsed("Chemistry Fundamentals");
          assertEquals(1, facultyMember.getPreviousTextbooksUsed().size());
          assertTrue(facultyMember.getPreviousTextbooksUsed().contains("Chemistry Fundamentals"));
      }
      
       @Test
       public void testGetEmail() {
           assertEquals("john@example.com", facultyMember.getEmail());
        }
    
}
