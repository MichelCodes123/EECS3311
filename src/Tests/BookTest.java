package Tests;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import models.Items.PhysicalItems.Book;

public class BookTest {
    @Test
    public void testGetId() {
        Book book = new Book("1", "Book 1", "Library", true, System.currentTimeMillis(), 10.0);
        assertEquals("1", book.getId());
    }

    @Test
    public void testGetName() {
        Book book = new Book("1", "Book 1", "Library", true, System.currentTimeMillis(), 10.0);
        assertEquals("Book 1", book.getName());
    }

    @Test
    public void testGetLocation() {
        Book book = new Book("1", "Book 1", "Library", true, System.currentTimeMillis(), 10.0);
        assertEquals("Library", book.getLocation());
    }

    @Test
    public void testGetPurchasability() {
        Book book = new Book("1", "Book 1", "Library", true, System.currentTimeMillis(), 10.0);
        assertEquals(true, book.getPurchasability());
    }

    @Test
    public void testGetDueDate() {
        Book book = new Book("1", "Book 1", "Library", true, System.currentTimeMillis(), 10.0);
        assertEquals((Long) System.currentTimeMillis(), book.getDueDate());
    }

    @Test
    public void testGetDollarAmount() {
        Book book = new Book("1", "Book 1", "Library", true, System.currentTimeMillis(), 10.0);
        assertEquals(10.0, book.getDollarAmount(), 0.001);
    }

    @Test
    public void testSetLocation() {
        Book book = new Book("1", "Book 1", "Library", true, System.currentTimeMillis(), 10.0);
        book.setLocation("Bookstore");
        assertEquals("Bookstore", book.getLocation());
    }

    @Test
    public void testSetPurchasability() {
        Book book = new Book("1", "Book 1", "Library", true, System.currentTimeMillis(), 10.0);
        book.setPurchasability(false);
        assertEquals(false, book.getPurchasability());
    }

    @Test
    public void testSetDueDate() {
        Book book = new Book("1", "Book 1", "Library", true, System.currentTimeMillis(), 10.0);
        Date newDueDate = new Date(System.currentTimeMillis() + 100000);
        book.setDueDate(newDueDate);
        assertEquals((Long) (System.currentTimeMillis() + 100000), book.getDueDate());
    }

    @Test
    public void testSetDollarAmount() {
        Book book = new Book("1", "Book 1", "Library", true, System.currentTimeMillis(), 10.0);
        book.setDollarAmount(20.0);
        assertEquals(20.0, book.getDollarAmount(), 0.001);
    }
    
}
