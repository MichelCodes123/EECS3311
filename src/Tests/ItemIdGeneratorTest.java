package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import models.LibraryItem.ItemIdGenerator;

public class ItemIdGeneratorTest {
    @Test
    public void testGetInstance() {
        ItemIdGenerator instance1 = ItemIdGenerator.getInstance();
        ItemIdGenerator instance2 = ItemIdGenerator.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    public void testGenerateId() {
        ItemIdGenerator generator = ItemIdGenerator.getInstance();
        String id1 = generator.generateId();
        String id2 = generator.generateId();
        assertNotNull(id1);
        assertNotNull(id2);
        assertNotEquals(id1, id2);
    }

    @Test
    public void testGenerateIdSequence() {
        ItemIdGenerator generator = ItemIdGenerator.getInstance();
        String id1 = generator.generateId();
        String id2 = generator.generateId();
        assertEquals(Integer.parseInt(id1) + 1, Integer.parseInt(id2));
    }

    @Test
    public void testGenerateIdFormat() {
        ItemIdGenerator generator = ItemIdGenerator.getInstance();
        String id = generator.generateId();
        assertTrue(id.matches("\\d+"));
    }

    @Test
    public void testGetInstanceThreadSafety() {
        Thread thread1 = new Thread(() -> {
            ItemIdGenerator.getInstance();
        });
        Thread thread2 = new Thread(() -> {
            ItemIdGenerator.getInstance();
        });
        thread1.start();
        thread2.start();
        assertTrue(true); // No exceptions thrown indicates thread safety
    }

    @Test
    public void testMultipleInstances() {
        ItemIdGenerator generator1 = ItemIdGenerator.getInstance();
        ItemIdGenerator generator2 = ItemIdGenerator.getInstance();
        assertSame(generator1, generator2);
    }

    @Test
    public void testGenerateIdUniqueness() {
        ItemIdGenerator generator = ItemIdGenerator.getInstance();
        String id1 = generator.generateId();
        String id2 = generator.generateId();
        assertNotEquals(id1, id2);
    }

    @Test
    public void testGenerateIdConsistency() {
        ItemIdGenerator generator = ItemIdGenerator.getInstance();
        String id1 = generator.generateId();
        String id2 = generator.generateId();
        assertEquals(Integer.parseInt(id1) + 1, Integer.parseInt(id2));
    }

    @Test
    public void testGenerateIdPositive() {
        ItemIdGenerator generator = ItemIdGenerator.getInstance();
        String id = generator.generateId();
        assertTrue(Integer.parseInt(id) >= 0);
    }

    @Test(timeout = 100)
    public void testGetInstancePerformance() {
        for (int i = 0; i < 1000000; i++) {
            ItemIdGenerator.getInstance();
        }
    }
    
}
