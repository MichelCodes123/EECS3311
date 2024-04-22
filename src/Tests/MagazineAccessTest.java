package Tests;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import database_access.MagazineAccess;
import models.Items.PhysicalItems.Magazine;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

public class MagazineAccessTest {

    private MagazineAccess magazineAccess;

    @BeforeEach
    void setUp() {
        // Assuming magazineAccess.items can be reset or cleared for testing purposes
        magazineAccess = MagazineAccess.getInstance();
        magazineAccess.items.clear(); // Clear the list to ensure a clean state for each test
    }
    @AfterEach
    void tearDown() {
        magazineAccess.items.clear(); // Clear the list to ensure a clean state for each test
        try {
            magazineAccess.update();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    void testSingletonInstance() {
        MagazineAccess instance1 = MagazineAccess.getInstance();
        MagazineAccess instance2 = MagazineAccess.getInstance();
        assertSame(instance1, instance2, "getInstance() should return the same instance.");
    }

    @Test
    void testAddItem() throws Exception {
        Magazine Magazine = new Magazine("1", "Test Magazine", "Location", true, new Date().getTime(), 10.0);
        magazineAccess.addItem(Magazine);
        assertEquals(1, magazineAccess.items.size(), "Magazine should be added to the list.");
        
    }

    @Test
    void testAddItem2() {
        assertThrows(Exception.class, () -> magazineAccess.addItem(null));
        assertEquals(0, magazineAccess.items.size(), "Magazine should not be added to the list.");
    }
   
   

    @Test
    void testEnableItem() throws Exception {
        Magazine Magazine = new Magazine("0", "Test Magazine", "Location", false, new Date().getTime(), 10.0);
        magazineAccess.addItem(Magazine);
        magazineAccess.enableItem(Magazine.getId());
        assertEquals(1, magazineAccess.items.size());
        Magazine = (Magazine) magazineAccess.items.get(0);
        assertTrue(Magazine.getPurchasability(),"Magazine should be enabled.");
    }

    @Test
    void testDisableItem() throws Exception {
        Magazine Magazine = new Magazine("0", "Test Magazine", "Location", true, new Date().getTime(), 10.0);
        magazineAccess.addItem(Magazine);
        magazineAccess.disableItem(Magazine.getId());
        Magazine = (Magazine) magazineAccess.items.get(0);
        assertFalse(Magazine.getPurchasability(), "Magazine should be disabled.");
    }

    @Test
    void testRemoveItem() throws Exception {
        Magazine Magazine = new Magazine("1", "Test Magazine", "Location", true, new Date().getTime(), 10.0);
        magazineAccess.addItem(Magazine);
        magazineAccess.removeItem("1");
        assertFalse(magazineAccess.items.contains(Magazine), "Magazine should be removed from the list.");
    }
    @Test
    void testRemoveItem2() throws Exception {
        Magazine Magazine = new Magazine("1", "Test Magazine", "Location", true, new Date().getTime(), 10.0);
        magazineAccess.addItem(Magazine);
        magazineAccess.removeItem("0");
        assertEquals(1, magazineAccess.items.size(),"Magazine should not be removed from the list.");
    }
    @Test
    void testRemoveItem3() throws Exception {
        Magazine Magazine = new Magazine("1", "Test Magazine", "Location", true, new Date().getTime(), 10.0);
        magazineAccess.addItem(Magazine);
        assertThrows(Exception.class, () -> magazineAccess.addItem(null));
        assertEquals(1, magazineAccess.items.size(),"Magazine should not be removed from the list.");
    }

    @Test
    void testUpdateItem() throws Exception {
        Magazine originalMagazine = new Magazine("1", "Original Name", "Location", true, new Date().getTime(), 10.0);
        magazineAccess.addItem(originalMagazine);
        Magazine updatedMagazine = new Magazine("1", "Updated Name", "Location", true, new Date().getTime(), 15.0);
        magazineAccess.updateItem(updatedMagazine);
        Magazine resultMagazine = (Magazine) magazineAccess.items.get(0);
        assertEquals("Updated Name", resultMagazine.getName(), "Magazine name should be updated.");
        assertEquals(15.0, resultMagazine.getDollarAmount(), "Magazine price should be updated.");
    }

    @Test
    void testLoad() throws Exception {
        Magazine Magazine = new Magazine("0", "Test Magazine", "Location", true, new Date().getTime(), 10.0);
        assertEquals(0, magazineAccess.items.size());
        magazineAccess.items.add(Magazine);
		assertEquals(1, magazineAccess.items.size());
        magazineAccess.update();
		assertEquals(0, magazineAccess.items.size());

		magazineAccess.load();
		assertEquals(1, magazineAccess.items.size());
    }
    
    @Test
    void testUpdate() throws Exception {
        Magazine Magazine = new Magazine("0", "Test Magazine", "Location", true, new Date().getTime(), 10.0);
        assertEquals(0, magazineAccess.items.size());
        magazineAccess.items.add(Magazine);
		assertEquals(1, magazineAccess.items.size());
        magazineAccess.update();
		assertEquals(0, magazineAccess.items.size());

    }

    


}
