package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import models.Items.Item;
import models.Items.Newsletter;
import models.Items.DigitalTB.DigitalTB;

public class ItemtTest {
    @Test
    public void testGetId() {
        Item item = new DigitalTB("1", "Item 1");
        assertEquals("1", item.getId());
    }

    @Test
    public void testGetName() {
        Item item = new DigitalTB("1", "Item 1");
        assertEquals("Item 1", item.getName());
    }

    @Test
    public void testSetName() {
        Item item = new DigitalTB("1", "Item 1");
        item.setName("New Name");
        assertEquals("New Name", item.getName());
    }

    @Test
    public void testInitialization() {
        Item item = new DigitalTB("1", "Item 1");
        assertEquals("1", item.getId());
        assertEquals("Item 1", item.getName());
    }

    @Test
    public void testSetNameWithEmptyString() {
        Item item = new DigitalTB("1", "Item 1");
        item.setName("");
        assertEquals("", item.getName());
    }

    @Test
    public void testSetNameWithNull() {
        Item item = new Newsletter("1", "Newsletter 1", "https://example.com");
        item.setName(null);
        assertEquals(null, item.getName());
    }

    @Test
    public void testEqualitySameObject() {
        Item item1 = new Newsletter("1", "Newsletter 1", "https://example.com");
        assertEquals(item1, item1);
    }
    
    @Test
    public void testEqualityDifferentObjectsDifferentIdAndName() {
        Item item1 = new Newsletter("1", "Newsletter 1", "https://example.com");
        Item item2 = new Newsletter("2", "Newsletter 2", "https://example.com");
        assertEquals(false, item1.equals(item2));
    }



    @Test
    public void testEqualityWithDifferentId() {
        Item item1 = new Newsletter("1", "Newsletter 1", "https://example.com");
        Item item2 = new Newsletter("2", "Newsletter 1", "https://example.com");
        assertEquals(false, item1.equals(item2));
    }
    @Test
    public void testHashCodeInequality() {
        Item item1 = new Newsletter("1", "Newsletter 1", "https://example.com");
        Item item2 = new Newsletter("2", "Newsletter 2", "https://example.com");
        assertEquals(false, item1.hashCode() == item2.hashCode());
    }

    
}
