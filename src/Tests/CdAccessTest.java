package Tests;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import database_access.CdAccess;

import models.Items.PhysicalItems.Cd;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

class CdAccessTest {

    private CdAccess cdAccess;

    @BeforeEach
    void setUp() {
        // Assuming cdAccess.items can be reset or cleared for testing purposes
        cdAccess = CdAccess.getInstance();
        cdAccess.items.clear(); // Clear the list to ensure a clean state for each test
    }
    @AfterEach
    void tearDown() {
        cdAccess.items.clear(); // Clear the list to ensure a clean state for each test
        try {
            cdAccess.update();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    void testSingletonInstance() {
        CdAccess instance1 = CdAccess.getInstance();
        CdAccess instance2 = CdAccess.getInstance();
        assertSame(instance1, instance2, "getInstance() should return the same instance.");
    }

    @Test
    void testAddItem() throws Exception {
        Cd Cd = new Cd("1", "Test Cd", "Location", true, new Date().getTime(), 10.0);
        cdAccess.addItem(Cd);
        assertEquals(1, cdAccess.items.size(), "Cd should be added to the list.");
        
    }

    @Test
    void testAddItem2() throws Exception {
         assertThrows(Exception.class, () -> cdAccess.addItem(null));
        
        assertEquals(0, cdAccess.items.size(), "Cd should not be added to the list.");
        
    }
   
   

    @Test
    void testEnableItem() throws Exception {
        Cd Cd = new Cd("0", "Test Cd", "Location", false, new Date().getTime(), 10.0);
        cdAccess.addItem(Cd);
        cdAccess.enableItem(Cd.getId());
        assertEquals(1, cdAccess.items.size());
        assertTrue(Cd.getPurchasability(),"Cd should be enabled.");
    }

    @Test
    void testDisableItem() throws Exception {
        Cd Cd = new Cd("0", "Test Cd", "Location", true, new Date().getTime(), 10.0);
        cdAccess.addItem(Cd);
        cdAccess.disableItem(Cd.getId());
        assertFalse(Cd.getPurchasability(), "Cd should be disabled.");
    }

    @Test
    void testRemoveItem() throws Exception {
        Cd Cd = new Cd("1", "Test Cd", "Location", true, new Date().getTime(), 10.0);
        cdAccess.addItem(Cd);
        cdAccess.removeItem("1");
        assertFalse(cdAccess.items.contains(Cd), "Cd should be removed from the list.");
    }
    @Test
    void testRemoveItem2() throws Exception {
        Cd Cd = new Cd("1", "Test Cd", "Location", true, new Date().getTime(), 10.0);
        cdAccess.addItem(Cd);
        cdAccess.removeItem("0");
        assertEquals(1, cdAccess.items.size(),"Cd should not be removed from the list.");
    }
    @Test
    void testRemoveItem3() throws Exception {
        Cd Cd = new Cd("1", "Test Cd", "Location", true, new Date().getTime(), 10.0);
        cdAccess.addItem(Cd);
        assertThrows(Exception.class, () -> cdAccess.addItem(null));
        assertEquals(1, cdAccess.items.size(),"Cd should not be removed from the list.");
    }

    @Test
    void testUpdateItem() throws Exception {
        Cd originalCd = new Cd("1", "Original Name", "Location", true, new Date().getTime(), 10.0);
        cdAccess.addItem(originalCd);
        Cd updatedCd = new Cd("1", "Updated Name", "Location", true, new Date().getTime(), 15.0);
        cdAccess.updateItem(updatedCd);
        Cd resultCd = (Cd) cdAccess.items.get(0);
        assertEquals("Updated Name", resultCd.getName(), "Cd name should be updated.");
        assertEquals(15.0, resultCd.getDollarAmount(), "Cd price should be updated.");
    }

    @Test
    void testLoad() throws Exception {
        Cd Cd = new Cd("0", "Test Cd", "Location", true, new Date().getTime(), 10.0);
        assertEquals(0, cdAccess.items.size());
        cdAccess.items.add(Cd);
		assertEquals(1, cdAccess.items.size());
        cdAccess.update();
		assertEquals(0, cdAccess.items.size());

		cdAccess.load();
		assertEquals(1, cdAccess.items.size());
    }
    
    @Test
    void testUpdate() throws Exception {
        Cd Cd = new Cd("0", "Test Cd", "Location", true, new Date().getTime(), 10.0);
        assertEquals(0, cdAccess.items.size());
        cdAccess.items.add(Cd);
		assertEquals(1, cdAccess.items.size());
        cdAccess.update();
		assertEquals(0, cdAccess.items.size());

    }

    


}
