package Tests;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;


import database_access.VisitorAccess;
import database_access.QueryUtilities;

import models.Users.Visitor;






public class VisitorAccessTest {
    private VisitorAccess visitordb;
    private QueryUtilities queryUtilities = new QueryUtilities();
    @BeforeEach
    public void setUp() {
        
        visitordb = VisitorAccess.getInstance();
        visitordb.users.clear(); // Clear the list to ensure a clean state for each test
        
    }
    @AfterEach
    public void tearDown() throws Exception {
        visitordb.users.clear(); // Clear the list to ensure a clean state for each test
       
        visitordb.update();
        
    }
    @Test
    public void testSingletonInstance() {
        VisitorAccess instance1 = VisitorAccess.getInstance();
        VisitorAccess instance2 = VisitorAccess.getInstance();
        assertSame( instance1, instance2);
    }
    @Test
    public void testAddUser() throws Exception {
        Visitor visitor = new Visitor("1", "John", "Yorku.ca", "york", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>());
        visitordb.users.add(visitor);
        assertEquals(1, visitordb.users.size());
    }
  
    @Test
    public void testLoad() throws Exception {
        visitordb.load();
        assertEquals(0, visitordb.users.size());
    }
    
    @Test
    public void testUpdate() throws Exception {
        visitordb.update();
        assertEquals(0, visitordb.users.size());
    }
    @Test
    public void testUpdate2() throws Exception {
        Visitor visitor = new Visitor("1", "John", "Yorku.ca", "york", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>());
        visitordb.users.add(visitor);
        visitordb.update();
        assertEquals(0, visitordb.users.size());
    }
    @Test
    public void testLoad2() throws Exception {
        Visitor visitor = new Visitor("1", "John", "Yorku.ca", "york", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>());
        visitordb.users.add(visitor);
        visitordb.update();
        visitordb.load();
        assertEquals(1, visitordb.users.size());
    }
    @Test
    public void testLoad3() throws Exception {
        Visitor visitor = new Visitor("1", "John", "Yorku.ca", "york", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>());
        visitordb.users.add(visitor);
        visitordb.update();
        visitordb.load();
        assertEquals("1", visitordb.users.get(0).getId());
    }
    @Test
    public void testLoad4() throws Exception {
        Visitor visitor = new Visitor("1", "John", "Yorku.ca", "york", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>());
        visitordb.users.add(visitor);
        visitordb.update();
        visitordb.load();
        assertEquals("John", visitordb.users.get(0).getName());
    }
    @Test
    public void testLoad5() throws Exception {
        Visitor visitor = new Visitor("1", "John", "Yorku.ca", "york", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>());
        visitordb.users.add(visitor);
        visitordb.update();
        visitordb.load();
        assertEquals("Yorku.ca", visitordb.users.get(0).getEmail());
    }
    @Test
    public void testUserinDB() throws Exception {
        Visitor visitor = new Visitor("1", "John", "Yorku.ca", "york", true, 0.0, true, new ArrayList<String>(),new ArrayList<String>());
        visitordb.users.add(visitor);
        visitordb.update();
        visitordb.load();
        assertNotNull(queryUtilities.allUsers());

    }
   
    
    

    

}


    
