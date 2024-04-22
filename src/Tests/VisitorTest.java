package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import models.Users.Visitor;

public class VisitorTest {
    private Visitor visitor;

    @Before
    public void setUp() {
        visitor = new Visitor("1", "John Doe", "john@example.com", "password", false, 0.0, false,
                new ArrayList<>(), new ArrayList<>());
    }

    @Test
    public void testGetId() {
        assertEquals("1", visitor.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", visitor.getName());
    }

    @Test
    public void testGetEmail() {
        assertEquals("john@example.com", visitor.getEmail());
    }

    @Test
    public void testGetPassword() {
        assertEquals("password", visitor.getPassword());
    }

    @Test
    public void testGetCanBorrow() {
        assertFalse(visitor.getCan_borrow());
    }

    @Test
    public void testGetOverdueCharge() {
        assertEquals(0.0, visitor.getOverdue_charge(), 0.01);
    }

    @Test
    public void testGetIsRegistered() {
        assertFalse(visitor.getIs_registered());
    }

    @Test
    public void testAddItem() {
        visitor.add_item("item_id_1");
        assertTrue(visitor.getRented_item_list().contains("item_id_1"));
    }

    @Test
    public void testAddSubscription() {
        visitor.add_subscription("newsletter_link_1");
        assertTrue(visitor.getSubscribed_newsletters().contains("newsletter_link_1"));
    }

    @Test
    public void testRemoveSubscription() {
        visitor.add_subscription("newsletter_link_2");
        assertTrue(visitor.getSubscribed_newsletters().contains("newsletter_link_2"));
        visitor.remove_subscription("newsletter_link_2");
        assertFalse(visitor.getSubscribed_newsletters().contains("newsletter_link_2"));
    }
    
}
