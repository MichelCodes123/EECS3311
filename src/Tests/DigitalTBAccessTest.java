package Tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import database_access.DigitalTBAccess;

import models.Items.DigitalTB.DigitalTB;


public class DigitalTBAccessTest {
    private DigitalTBAccess digitalTBdb;
    

    @BeforeEach
    void setUp() {
        // Assuming BookAccess.items can be reset or cleared for testing purposes
        digitalTBdb = DigitalTBAccess.getInstance();
        digitalTBdb.items.clear(); // Clear the list to ensure a clean state for each test
    }
    @AfterEach
    void tearDown() {
        digitalTBdb.items.clear(); // Clear the list to ensure a clean state for each test
        try {
            digitalTBdb.update();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    void testSingletonInstance() {
        DigitalTBAccess instance1 = DigitalTBAccess.getInstance();
        DigitalTBAccess instance2 = DigitalTBAccess.getInstance();
        assertSame(instance1, instance2, "getInstance() should return the same instance.");
    }
     @Test
    public void testAddTextbook() throws Exception {
        DigitalTB textbook = new DigitalTB("1", "Software Design Principles", "EECS 3311");
        digitalTBdb.items.add(textbook);
        assertEquals(1, digitalTBdb.items.size());
    }
  
    @Test
    public void testLoad() throws Exception {
        digitalTBdb.load();
        assertEquals(0, digitalTBdb.items.size());
    }
    
    @Test
    public void testUpdate() throws Exception {
        digitalTBdb.update();
        assertEquals(0, digitalTBdb.items.size());
    }
    @Test
    public void testUpdate2() throws Exception {
         DigitalTB textbook = new DigitalTB("1", "Software Design Principles", "EECS 3311");
        digitalTBdb.items.add(textbook);
        digitalTBdb.update();
        assertEquals(0, digitalTBdb.items.size());
    }
    @Test
    public void testUpdate3() throws Exception {
        DigitalTB textbook = new DigitalTB("1", "Software Design Principles", "EECS 3311");
        digitalTBdb.items.add(textbook);
        textbook.setName("Data Structures");
        digitalTBdb.update();
        digitalTBdb.load();

        
        assertEquals("Data Structures", digitalTBdb.items.get(0).getName());

    }
    @Test
    public void testLoad2() throws Exception {
         DigitalTB textbook = new DigitalTB("1", "Software Design Principles", "EECS 3311");
        digitalTBdb.items.add(textbook);
        digitalTBdb.update();
        digitalTBdb.load();
        assertEquals(1, digitalTBdb.items.size());
    }
    @Test
    public void testLoad3() throws Exception {
         DigitalTB textbook = new DigitalTB("1", "Software Design Principles", "EECS 3311");
        digitalTBdb.items.add(textbook);
        digitalTBdb.update();
        digitalTBdb.load();
        assertEquals("1", digitalTBdb.items.get(0).getId());
    }
    @Test
    public void testLoad4() throws Exception {
        DigitalTB textbook = new DigitalTB("1", "Software Design Principles", "EECS 3311");
        digitalTBdb.items.add(textbook);
        digitalTBdb.update();
        digitalTBdb.load();
        assertEquals("Software Design Principles", digitalTBdb.items.get(0).getName());

    }
  
    
    @Test
    public void testAdditionOfDuplicateTextbooks() throws Exception {
        DigitalTB textbook = new DigitalTB("1", "Software Design Principles", "EECS 3311");
        DigitalTB textbook2 = new DigitalTB("1", "Software Design Principles", "EECS 3311");
        digitalTBdb.items.add(textbook);
        digitalTBdb.items.add(textbook2);
        digitalTBdb.update(); 

        digitalTBdb.load(); 
       
        assertEquals( 2, digitalTBdb.items.size());
    }

    
}
