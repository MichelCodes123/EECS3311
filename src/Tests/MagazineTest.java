package Tests;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import models.Items.PhysicalItems.Magazine;

public class MagazineTest {

    @Test
    public void testGetId() {
        Magazine magazine = new Magazine("1", "Magazine 1", "Library", true, System.currentTimeMillis(), 5.0);
        assertEquals("1", magazine.getId());
    }

    @Test
    public void testGetName() {
        Magazine magazine = new Magazine("1", "Magazine 1", "Library", true, System.currentTimeMillis(), 5.0);
        assertEquals("Magazine 1", magazine.getName());
    }

    @Test
    public void testGetLocation() {
        Magazine magazine = new Magazine("1", "Magazine 1", "Library", true, System.currentTimeMillis(), 5.0);
        assertEquals("Library", magazine.getLocation());
    }

    @Test
    public void testGetPurchasability() {
        Magazine magazine = new Magazine("1", "Magazine 1", "Library", true, System.currentTimeMillis(), 5.0);
        assertEquals(true, magazine.getPurchasability());
    }

    @Test
    public void testGetDueDate() {
        long currentTimeMillis = System.currentTimeMillis();
        Magazine magazine = new Magazine("1", "Magazine 1", "Library", true, currentTimeMillis, 5.0);
        assertEquals((Long) currentTimeMillis, magazine.getDueDate());
    }

    @Test
    public void testGetDollarAmount() {
        Magazine magazine = new Magazine("1", "Magazine 1", "Library", true, System.currentTimeMillis(), 5.0);
        assertEquals(5.0, magazine.getDollarAmount(), 0.001);
    }

    @Test
    public void testSetLocation() {
        Magazine magazine = new Magazine("1", "Magazine 1", "Library", true, System.currentTimeMillis(), 5.0);
        magazine.setLocation("Bookstore");
        assertEquals("Bookstore", magazine.getLocation());
    }

    @Test
    public void testSetPurchasability() {
        Magazine magazine = new Magazine("1", "Magazine 1", "Library", true, System.currentTimeMillis(), 5.0);
        magazine.setPurchasability(false);
        assertEquals(false, magazine.getPurchasability());
    }

    @Test
    public void testSetDueDate() {
        Magazine magazine = new Magazine("1", "Magazine 1", "Library", true, System.currentTimeMillis(), 5.0);
        Date newDueDate = new Date(System.currentTimeMillis() + 100000);
        magazine.setDueDate(newDueDate);
        assertEquals((Long) (System.currentTimeMillis() + 100000), magazine.getDueDate());
    }

    @Test
    public void testSetDollarAmount() {
        Magazine magazine = new Magazine("1", "Magazine 1", "Library", true, System.currentTimeMillis(), 5.0);
        magazine.setDollarAmount(10.0);
        assertEquals(10.0, magazine.getDollarAmount(), 0.001);
    }
    
}
