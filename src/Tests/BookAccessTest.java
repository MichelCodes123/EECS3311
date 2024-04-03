package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import database_access.BookAccess;

import models.Items.PhysicalItems.Book;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

class BookAccessTest {

    private BookAccess bookAccess;

    @BeforeEach
    void setUp() {
        // Assuming BookAccess.items can be reset or cleared for testing purposes
        bookAccess = BookAccess.getInstance();
        bookAccess.items.clear(); // Clear the list to ensure a clean state for each test
    }
    @AfterEach
    void tearDown() {
        bookAccess.items.clear(); // Clear the list to ensure a clean state for each test
        try {
            bookAccess.update();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    void testSingletonInstance() {
        BookAccess instance1 = BookAccess.getInstance();
        BookAccess instance2 = BookAccess.getInstance();
        assertSame(instance1, instance2, "getInstance() should return the same instance.");
    }

    @Test
    void testAddItem() throws Exception {
        Book book = new Book("1", "Test Book", "Location", true, new Date().getTime(), 10.0);
        bookAccess.addItem(book);
        assertEquals(1, bookAccess.items.size(), "Book should be added to the list.");
        
    }

    @Test
    void testAddItem2() throws Exception {
        assertThrows(Exception.class, () -> bookAccess.addItem(null));
        assertEquals(0, bookAccess.items.size(), "Book should not be added to the list.");
        
    }
   
   

    @Test
    void testEnableItem() throws Exception {
        Book book = new Book("0", "Test Book", "Location", false, new Date().getTime(), 10.0);
        bookAccess.addItem(book);
        bookAccess.enableItem(book.getId());
        assertEquals(1, bookAccess.items.size());
        assertTrue(book.getPurchasability(),"Book should be enabled.");
    }

    @Test
    void testDisableItem() throws Exception {
        Book book = new Book("0", "Test Book", "Location", true, new Date().getTime(), 10.0);
        bookAccess.addItem(book);
        bookAccess.disableItem(book.getId());
        assertFalse(book.getPurchasability(), "Book should be disabled.");
    }

    @Test
    void testRemoveItem() throws Exception {
        Book book = new Book("1", "Test Book", "Location", true, new Date().getTime(), 10.0);
        bookAccess.addItem(book);
        bookAccess.removeItem("1");
        assertFalse(bookAccess.items.contains(book), "Book should be removed from the list.");
    }
    @Test
    void testRemoveItem2() throws Exception {
        Book book = new Book("1", "Test Book", "Location", true, new Date().getTime(), 10.0);
        bookAccess.addItem(book);
        bookAccess.removeItem("0");
        assertEquals(1, bookAccess.items.size(),"Book should not be removed from the list.");
    }
    @Test
    void testRemoveItem3() throws Exception {
        Book book = new Book("1", "Test Book", "Location", true, new Date().getTime(), 10.0);
        bookAccess.addItem(book);
        assertThrows(Exception.class, () -> bookAccess.addItem(null));
        assertEquals(1, bookAccess.items.size(),"Book should not be removed from the list.");
    }

    @Test
    void testUpdateItem() throws Exception {
        Book originalBook = new Book("1", "Original Name", "Location", true, new Date().getTime(), 10.0);
        bookAccess.addItem(originalBook);
        Book updatedBook = new Book("1", "Updated Name", "Location", true, new Date().getTime(), 15.0);
        bookAccess.updateItem(updatedBook);
        Book resultBook = (Book) bookAccess.items.get(0);
        assertEquals("Updated Name", resultBook.getName(), "Book name should be updated.");
        assertEquals(15.0, resultBook.getDollarAmount(), "Book price should be updated.");
    }

    @Test
    void testLoad() throws Exception {
        Book book = new Book("0", "Test Book", "Location", true, new Date().getTime(), 10.0);
        assertEquals(0, bookAccess.items.size());
        bookAccess.items.add(book);
		assertEquals(1, bookAccess.items.size());
        bookAccess.update();
		assertEquals(0, bookAccess.items.size());

		bookAccess.load();
		assertEquals(1, bookAccess.items.size());
    }
    
    @Test
    void testUpdate() throws Exception {
        Book book = new Book("0", "Test Book", "Location", true, new Date().getTime(), 10.0);
        assertEquals(0, bookAccess.items.size());
        bookAccess.items.add(book);
		assertEquals(1, bookAccess.items.size());
        bookAccess.update();
		assertEquals(0, bookAccess.items.size());

    }

    


}
