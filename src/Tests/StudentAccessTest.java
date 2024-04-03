package Tests;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.Before;


import database_access.QueryUtilities;
import database_access.StudentAccess;
import models.Course;


import models.Users.Student;






public class StudentAccessTest {
    private StudentAccess studentdb;
    private QueryUtilities queryUtilities = new QueryUtilities();
    @Before
    public void setUp() {
        
        studentdb = StudentAccess.getInstance();
        studentdb.users.clear(); // Clear the list to ensure a clean state for each test
        
    }
    @After
    public void tearDown() {
        studentdb.users.clear(); // Clear the list to ensure a clean state for each test
    }
    @Test
    public void testSingletonInstance() {
        StudentAccess instance1 = StudentAccess.getInstance();
        StudentAccess instance2 = StudentAccess.getInstance();
        assertSame( instance1, instance2);
    }
    @Test
    public void testAddUser()  {
        Student student = new Student("0", "John", "e", "p", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>(), new ArrayList<Course>(), new ArrayList<String>());
        studentdb.users.add(student);
        assertEquals(1, studentdb.users.size());
    }
  
    @Test
    public void testLoad() throws Exception {
        studentdb.load();
        assertEquals(0, studentdb.users.size());
        
    }
    
    @Test
    public void testUpdate() throws Exception {
        studentdb.update();
        assertEquals(0, studentdb.users.size());
    }
    @Test
    public void testUpdate2() throws Exception {
         Student student = new Student("0", "John", "e", "p", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>(), new ArrayList<Course>(), new ArrayList<String>());
        studentdb.users.add(student);
        studentdb.update();
        assertEquals(0, studentdb.users.size());
    }
    @Test
    public void testLoad2() throws Exception {
         Student student = new Student("0", "John", "e", "p", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>(), new ArrayList<Course>(), new ArrayList<String>());
        studentdb.users.add(student);
        studentdb.update();
        studentdb.load();
        assertEquals(1, studentdb.users.size());
    }
    @Test
    public void testLoad3() throws Exception {
         Student student = new Student("0", "John", "e", "p", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>(), new ArrayList<Course>(), new ArrayList<String>());
        studentdb.users.add(student);
        studentdb.update();
        studentdb.load();
        assertEquals("0", studentdb.users.get(0).getId());
    }
    @Test
    public void testLoad4() throws Exception {
         Student student = new Student("0", "John", "e", "p", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>(), new ArrayList<Course>(), new ArrayList<String>());
        studentdb.users.add(student);
        studentdb.update();
        studentdb.load();
        assertEquals("John", studentdb.users.get(0).getName());
    }
    @Test
    public void testLoad5() throws Exception {
         Student student = new Student("0", "John", "e", "p", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>(), new ArrayList<Course>(), new ArrayList<String>());
        studentdb.users.add(student);
        studentdb.update();
        studentdb.load();
        assertEquals("e", studentdb.users.get(0).getEmail());
    }
    @Test
    public void testUserinDB() throws Exception {
         Student student = new Student("0", "John", "e", "p", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>(), new ArrayList<Course>(), new ArrayList<String>());
        studentdb.users.add(student);
        studentdb.update();
        studentdb.load();
        assertNotNull(queryUtilities.allUsers());

    }
   
    
    

    

}


    
