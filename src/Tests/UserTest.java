package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import models.Users.NonFacultyStaff;
import models.Users.User;

public class UserTest {
    private User user;
 
    @Before
    public void setUp() {
        user = new NonFacultyStaff("1", "John Doe", "john@example.com", "password", true, 0.0, true,
                new ArrayList<>(), new ArrayList<>());
    }

    @Test
    public void testGetId() {
        assertEquals("1", user.getId());
    }
    @Test
    public void setCanBorrow() {
    	user.setCan_borrow(false);
    	assertEquals(false, user.getCan_borrow());
    }
    @Test
    public void increase() {
    	user.increaseOverdue_charge(0.5);
    	
    	assertEquals(0, Double.compare(0.5, user.getOverdue_charge()));
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", user.getName());
    }

    @Test
    public void testGetEmail() {
        assertEquals("john@example.com", user.getEmail());
    }

    @Test
    public void testGetPassword() {
        assertEquals("password", user.getPassword());
    }

    @Test
    public void testGetCanBorrow() {
        assertTrue(user.getCan_borrow());
    }

    @Test
    public void testGetOverdueCharge() {
        assertEquals(0.0, user.getOverdue_charge(), 0.01);
    }

    @Test
    public void testSetOverdueCharge() {
        user.setOverdue_charge(10.5);
        assertEquals(10.5, user.getOverdue_charge(), 0.01);
    }

    @Test
    public void testGetIsRegistered() {
        assertTrue(user.getIs_registered());
    }

    @Test
    public void testAddItem() {
        user.add_item("item_id_1");
        assertTrue(user.getRented_item_list().contains("item_id_1"));
    }

    @Test
    public void testAddSubscription() {
        user.add_subscription("newsletter_link_1");
        assertTrue(user.getSubscribed_newsletters().contains("newsletter_link_1"));
    }

    @Test
    public void testRemoveSubscription() {
        user.add_subscription("newsletter_link_2");
        assertTrue(user.getSubscribed_newsletters().contains("newsletter_link_2"));
        user.remove_subscription("newsletter_link_2");
        assertFalse(user.getSubscribed_newsletters().contains("newsletter_link_2"));
    }
    
    
}
