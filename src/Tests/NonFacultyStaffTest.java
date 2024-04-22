package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import models.Users.NonFacultyStaff;

public class NonFacultyStaffTest {
    @Test
    public void testNonFacultyStaffInitialization() {
        NonFacultyStaff staff = new NonFacultyStaff("123", "John Doe", "john@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>());

        assertNotNull(staff);
        assertEquals("123", staff.getId());
        assertEquals("John Doe", staff.getName());
        assertEquals("john@example.com", staff.getEmail());
        assertEquals("password", staff.getPassword());
        assertTrue(staff.getCan_borrow());
        assertEquals(0.0, staff.getOverdue_charge(), 0.001);
        assertTrue(staff.getIs_registered());
        assertEquals(0, staff.getRented_item_list().size());
        assertEquals(0, staff.getSubscribed_newsletters().size());
    }

    @Test
    public void testSetOverdueCharge() {
        NonFacultyStaff staff = new NonFacultyStaff("123", "John Doe", "john@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>());
        staff.setOverdue_charge(10.0);
        assertEquals(10.0, staff.getOverdue_charge(), 0.001);
    }

    @Test
    public void testIncreaseOverdueCharge() {
        NonFacultyStaff staff = new NonFacultyStaff("123", "John Doe", "john@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>());
        staff.increaseOverdue_charge(5.0);
        assertEquals(5.0, staff.getOverdue_charge(), 0.001);
        staff.increaseOverdue_charge(3.0);
        assertEquals(8.0, staff.getOverdue_charge(), 0.001);
    }

    @Test
    public void testSetCanBorrow() {
        NonFacultyStaff staff = new NonFacultyStaff("123", "John Doe", "john@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>());
        staff.setCan_borrow(false);
        assertFalse(staff.getCan_borrow());
    }

    @Test
    public void testAddItem() {
        NonFacultyStaff staff = new NonFacultyStaff("123", "John Doe", "john@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>());
        staff.add_item("item123");
        assertEquals(1, staff.getRented_item_list().size());
        assertTrue(staff.getRented_item_list().contains("item123"));
    }

    @Test
    public void testAddSubscription() {
        NonFacultyStaff staff = new NonFacultyStaff("123", "John Doe", "john@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>());
        staff.add_subscription("newsletter1");
        assertEquals(1, staff.getSubscribed_newsletters().size());
        assertTrue(staff.getSubscribed_newsletters().contains("newsletter1"));
    }

    @Test
    public void testRemoveSubscription() {
        NonFacultyStaff staff = new NonFacultyStaff("123", "John Doe", "john@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>());
        staff.add_subscription("newsletter1");
        staff.add_subscription("newsletter2");
        staff.remove_subscription("newsletter1");
        assertEquals(1, staff.getSubscribed_newsletters().size());
        assertFalse(staff.getSubscribed_newsletters().contains("newsletter1"));
    }
   

    @Test
    public void testInitializationWithNullLists() {
        NonFacultyStaff staff = new NonFacultyStaff("123", "John Doe", "john@example.com", "password", true, 0.0, true, null, null);
        assertNotNull(staff);
        assertEquals(0, staff.getRented_item_list().size());
        assertEquals(0, staff.getSubscribed_newsletters().size());
    }


    @Test
    public void testAddDuplicateItem() {
        NonFacultyStaff staff = new NonFacultyStaff("123", "John Doe", "john@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>());
        staff.add_item("item123");
        staff.add_item("item123");
        assertEquals(2, staff.getRented_item_list().size());
    }

    @Test
    public void testAddSubscriptionWithNullLink() {
        NonFacultyStaff staff = new NonFacultyStaff("123", "John Doe", "john@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>());
        staff.add_subscription(null);
        assertEquals(1, staff.getSubscribed_newsletters().size());
    }
    
}
