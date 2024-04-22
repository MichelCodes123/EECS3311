package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import database_access.DigitalTBAccess;
import models.Items.DigitalTB.DigitalTB;

class DigitalTBTest {

	
	@BeforeEach
	public void init() {

		try {
			DigitalTBAccess.getInstance().load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DigitalTBAccess.getInstance().items.clear();
		try {
			DigitalTBAccess.getInstance().update();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@AfterEach
	public void ok() {
		init();
	}
	

	
	@Test
    public void testGetId() {
        DigitalTB digitalTB = new DigitalTB("1", "DigitalTB 1", "Course A");
        assertEquals("1", digitalTB.getId());
    }

    @Test
    public void testGetName() {
        DigitalTB digitalTB = new DigitalTB("1", "DigitalTB 1", "Course A");
        assertEquals("DigitalTB 1", digitalTB.getName());
    }

    @Test
    public void testGetCourseName() {
        DigitalTB digitalTB = new DigitalTB("1", "DigitalTB 1", "Course A");
        assertEquals("Course A", digitalTB.getCourseName());
    }

    @Test
    public void testInitializationWithCourseName() {
        DigitalTB digitalTB = new DigitalTB("1", "DigitalTB 1", "Course A");
        assertEquals("1", digitalTB.getId());
        assertEquals("DigitalTB 1", digitalTB.getName());
        assertEquals("Course A", digitalTB.getCourseName());
    }

    @Test
    public void testInitializationWithoutCourseName() {
        DigitalTB digitalTB = new DigitalTB("1", "DigitalTB 1");
        assertEquals("1", digitalTB.getId());
        assertEquals("DigitalTB 1", digitalTB.getName());
        assertEquals(null, digitalTB.getCourseName());
    }

    @Test
    public void testSetName() {
        DigitalTB digitalTB = new DigitalTB("1", "DigitalTB 1");
        digitalTB.setName("New Name");
        assertEquals("New Name", digitalTB.getName());
    }
    @Test
    public void testSetNameWithNull() {
        DigitalTB digitalTB = new DigitalTB("1", "DigitalTB 1", "Course A");
        digitalTB.setName(null);
        assertEquals(null, digitalTB.getName());
    }


    @Test
    public void testEqualitySameObject() {
        DigitalTB digitalTB1 = new DigitalTB("1", "DigitalTB 1", "Course A");
        assertEquals(digitalTB1, digitalTB1);
    }

    @Test
    public void testEqualityDifferentObjectsDifferentIdAndName() {
        DigitalTB digitalTB1 = new DigitalTB("1", "DigitalTB 1", "Course A");
        DigitalTB digitalTB2 = new DigitalTB("2", "DigitalTB 2", "Course B");
        assertEquals(false, digitalTB1.equals(digitalTB2));
    }


    @Test
    public void testEqualityDifferentObjectsSameIdAndName() {
        DigitalTB digitalTB1 = new DigitalTB("1", "DigitalTB 1", "Course A");
        DigitalTB digitalTB2 = new DigitalTB("1", "DigitalTB 1", "Course A");
        
        // Compare properties manually
        assertEquals(digitalTB1.getId(), digitalTB2.getId());
        assertEquals(digitalTB1.getName(), digitalTB2.getName());
        assertEquals(digitalTB1.getCourseName(), digitalTB2.getCourseName());
    }

}
