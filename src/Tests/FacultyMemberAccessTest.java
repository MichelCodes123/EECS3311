package Tests;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;

import database_access.FacultyMemberAccess;
import database_access.QueryUtilities;
import models.Course;

import models.Items.PhysicalItems.Textbook;
import models.Users.FacultyMember;






public class FacultyMemberAccessTest {
    private FacultyMemberAccess facultyMemberAccess;
    private QueryUtilities queryUtilities = new QueryUtilities();
    @Before
    public void setUp() {
        facultyMemberAccess = FacultyMemberAccess.getInstance();
        facultyMemberAccess.users.clear(); // Clear the list to ensure a clean state for each test
        
    }
    @Test
    public void testSingletonInstance() {
        FacultyMemberAccess instance1 = FacultyMemberAccess.getInstance();
        FacultyMemberAccess instance2 = FacultyMemberAccess.getInstance();
        assertSame( instance1, instance2);
    }
    @Test
    public void testAddUser() throws Exception {
        FacultyMember prof = new FacultyMember("0", "Tom", "m", "pass", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>());
        facultyMemberAccess.users.add(prof);
        assertEquals(1, facultyMemberAccess.users.size());
    }
  
    @Test
    public void testLoad() throws Exception {
        facultyMemberAccess.load();
        assertEquals(0, facultyMemberAccess.users.size());
    }
    
    @Test
    public void testUpdate() throws Exception {
        facultyMemberAccess.update();
        assertEquals(0, facultyMemberAccess.users.size());
    }
    @Test
    public void testUpdate2() throws Exception {
        FacultyMember prof = new FacultyMember("0", "Tom", "m", "pass", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>());
        facultyMemberAccess.users.add(prof);
        facultyMemberAccess.update();
        assertEquals(0, facultyMemberAccess.users.size());
    }
    @Test
    public void testLoad2() throws Exception {
        FacultyMember prof = new FacultyMember("0", "Tom", "m", "pass", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>());
        facultyMemberAccess.users.add(prof);
        facultyMemberAccess.update();
        facultyMemberAccess.load();
        assertEquals(1, facultyMemberAccess.users.size());
    }
    @Test
    public void testLoad3() throws Exception {
        FacultyMember prof = new FacultyMember("0", "Tom", "m", "pass", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>());
        facultyMemberAccess.users.add(prof);
        facultyMemberAccess.update();
        facultyMemberAccess.load();
        assertEquals("Tom", facultyMemberAccess.users.get(0).getName());
    }
    @Test
    public void testUserinDB() throws Exception {
        FacultyMember prof = new FacultyMember("0", "Tom", "m", "pass", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>());
        facultyMemberAccess.users.add(prof);
        facultyMemberAccess.update();
        facultyMemberAccess.load();
        assertNotNull(queryUtilities.allUsers());

    }
    @Test
    public void testTextbook() throws Exception {
        FacultyMember prof = new FacultyMember("0", "Tom", "m", "pass", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>());
        facultyMemberAccess.users.add(prof);
        Textbook textbook = new Textbook("5", "DataStructures", "RM 125", false, new Date().getTime()+ 86400000*2, 0.0);
        prof.addTextbookUsed(textbook.getId());
        facultyMemberAccess.update();
        facultyMemberAccess.load();
       


        assertEquals(prof.getPreviousTextbooksUsed().get(0), textbook.getId());

    }
    @Test
    public void testCourse() throws Exception {
        FacultyMember prof = new FacultyMember("0", "Tom", "m", "pass", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>());
        facultyMemberAccess.users.add(prof);
        Textbook textbook = new Textbook("5", "DataStructures", "RM 125", false, new Date().getTime()+ 86400000*2, 0.0);
        ArrayList<Textbook> textbooks = new ArrayList<>();
        textbooks.add(textbook);
        Course course = new Course("EECS 2101", textbooks);
        prof.addCourse(course.getName());
        facultyMemberAccess.update();
        facultyMemberAccess.load();
       


        assertEquals(prof.getTeachingCourses().get(0), course.getName());

    }
    
    

    

}


    
