package Tests;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import models.Items.PhysicalItems.Cd;

public class CdTest {
    @Test
    public void testGetId() {
        Cd cd = new Cd("1", "CD 1", "Music Store", true, System.currentTimeMillis(), 15.0);
        assertEquals("1", cd.getId());
    }

    @Test
    public void testGetName() {
        Cd cd = new Cd("1", "CD 1", "Music Store", true, System.currentTimeMillis(), 15.0);
        assertEquals("CD 1", cd.getName());
    }

    @Test
    public void testGetLocation() {
        Cd cd = new Cd("1", "CD 1", "Music Store", true, System.currentTimeMillis(), 15.0);
        assertEquals("Music Store", cd.getLocation());
    }

    @Test
    public void testGetPurchasability() {
        Cd cd = new Cd("1", "CD 1", "Music Store", true, System.currentTimeMillis(), 15.0);
        assertEquals(true, cd.getPurchasability());
    }

    @Test
    public void testGetDueDate() {
        long currentTimeMillis = System.currentTimeMillis();
        Cd cd = new Cd("1", "CD 1", "Music Store", true, currentTimeMillis, 15.0);
        assertEquals((Long) currentTimeMillis, cd.getDueDate());
    }

    @Test
    public void testGetDollarAmount() {
        Cd cd = new Cd("1", "CD 1", "Music Store", true, System.currentTimeMillis(), 15.0);
        assertEquals(15.0, cd.getDollarAmount(), 0.001);
    }

    @Test
    public void testSetLocation() {
        Cd cd = new Cd("1", "CD 1", "Music Store", true, System.currentTimeMillis(), 15.0);
        cd.setLocation("Online Store");
        assertEquals("Online Store", cd.getLocation());
    }

    @Test
    public void testSetPurchasability() {
        Cd cd = new Cd("1", "CD 1", "Music Store", true, System.currentTimeMillis(), 15.0);
        cd.setPurchasability(false);
        assertEquals(false, cd.getPurchasability());
    }

    @Test
    public void testSetDueDate() {
        Cd cd = new Cd("1", "CD 1", "Music Store", true, System.currentTimeMillis(), 15.0);
        Date newDueDate = new Date(System.currentTimeMillis() + 100000);
        cd.setDueDate(newDueDate);
        assertEquals((Long) (System.currentTimeMillis() + 100000), cd.getDueDate());
    }

    @Test
    public void testSetDollarAmount() {
        Cd cd = new Cd("1", "CD 1", "Music Store", true, System.currentTimeMillis(), 15.0);
        cd.setDollarAmount(20.0);
        assertEquals(20.0, cd.getDollarAmount(), 0.001);
    }
    
}
