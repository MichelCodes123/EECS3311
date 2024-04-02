package Tests;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.Cd;
import models.Items.PhysicalItems.Magazine;
import models.Items.PhysicalItems.PhysicalItem;

public class PhysicalItemTest {
    @Test
    public void testGetId() {
        PhysicalItem item = new Book("1", "Item 1", "Library", true, System.currentTimeMillis(), 10.0);
        assertEquals("1", item.getId());
    }

    @Test
    public void testGetName() {
        PhysicalItem item = new Book("1", "Item 1", "Library", true, System.currentTimeMillis(), 10.0);
        assertEquals("Item 1", item.getName());
    }

    @Test
    public void testGetLocation() {
        PhysicalItem item = new Book("1", "Item 1", "Library", true, System.currentTimeMillis(), 10.0);
        item.setLocation("Library");
        assertEquals("Library", item.getLocation());
    }

    @Test
    public void testGetPurchasability() {
        PhysicalItem item = new Magazine("1", "Item 1", "Library", true, System.currentTimeMillis(), 10.0);
        assertEquals(true, item.getPurchasability());
    }

    @Test
    public void testGetDueDate() {
        PhysicalItem item = new Magazine("1", "Item 1", "Library", true, System.currentTimeMillis(), 10.0);
        Date dueDate = new Date(System.currentTimeMillis() + 86400000); // Adding one day
        item.setDueDate(dueDate);
        assertEquals(dueDate.getTime(), (long) item.getDueDate());
    }

    @Test
    public void testGetDollarAmount() {
        PhysicalItem item = new Magazine("1", "Item 1", "Library", true, System.currentTimeMillis(), 10.0);
        assertEquals(10.0, item.getDollarAmount(), 0.001);
    }

    @Test
    public void testSetLocation() {
        PhysicalItem item = new Book("1", "Item 1", "Library", true, System.currentTimeMillis(), 10.0);
        item.setLocation("Bookstore");
        assertEquals("Bookstore", item.getLocation());
    }

    @Test
    public void testSetPurchasability() {
        PhysicalItem item = new Cd("1", "Item 1", "Library", true, System.currentTimeMillis(), 10.0);
        item.setPurchasability(false);
        assertEquals(false, item.getPurchasability());
    }

    @Test
    public void testSetDueDate() {
        PhysicalItem item = new Cd("1", "Item 1", "Library", true, System.currentTimeMillis(), 10.0);
        Date dueDate = new Date(System.currentTimeMillis() + 86400000); // Adding one day
        item.setDueDate(dueDate);
        assertEquals(dueDate.getTime(), (long) item.getDueDate());
    }

    @Test
    public void testSetDollarAmount() {
        PhysicalItem item = new Cd("1", "Item 1", "Library", true, System.currentTimeMillis(), 10.0);
        item.setDollarAmount(15.0);
        assertEquals(15.0, item.getDollarAmount(), 0.001);
    }
    
}
