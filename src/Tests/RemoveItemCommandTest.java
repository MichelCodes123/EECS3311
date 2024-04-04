package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.Cd;
import models.Items.PhysicalItems.Magazine;
import models.Items.PhysicalItems.PhysicalItem;
import models.LibraryItem.LibraryManager;
import models.LibraryItem.RemoveItemCommand;

public class RemoveItemCommandTest {

    @Test
    public void executeRemovesBookFromList() throws Exception {
        // Create a sample book
        Book book = new Book("1", "Sample Book", "Shelf A", true, System.currentTimeMillis(), 10.99);

        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access/BookAccess");
        libraryManager.addItem(book);

        // Create a RemoveItemCommand instance for a book
        RemoveItemCommand removeBookCommand = new RemoveItemCommand("1", "Book", libraryManager);

        // Execute the command
        List<PhysicalItem> items = new ArrayList<>();
        removeBookCommand.execute(items, "", libraryManager);

        // Verify that the book is removed from the list
        assertFalse(items.contains(book));
    }

    @Test
    public void executeRemovesCdFromList() throws Exception {
        // Create a sample CD
        Cd cd = new Cd("1", "Sample CD", "CD Rack", true, System.currentTimeMillis(), 15.99);

        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access/CdAccess");
        libraryManager.addItem(cd);

        // Create a RemoveItemCommand instance for a CD
        RemoveItemCommand removeCdCommand = new RemoveItemCommand("1", "Cd", libraryManager);

        // Execute the command
        List<PhysicalItem> items = new ArrayList<>();
        removeCdCommand.execute(items, "", libraryManager);

        // Verify that the CD is removed from the list
        assertFalse(items.contains(cd));
    }

    

    @Test
    public void getItemIdReturnsCorrectId() {
        // Create a RemoveItemCommand instance
        RemoveItemCommand removeItemCommand = new RemoveItemCommand("1", "Book", null);

        // Verify that getItemId returns the correct ID
        assertEquals("1", removeItemCommand.getItemId());
    }

    @Test
    public void getItemTypeReturnsCorrectType() {
        // Create a RemoveItemCommand instance
        RemoveItemCommand removeItemCommand = new RemoveItemCommand("1", "Book", null);

        // Verify that getItemType returns the correct type
        assertEquals("Book", removeItemCommand.getItemType());
    }

    @Test
    public void executeRemovesMagazineFromList() throws Exception {
        // Create a sample magazine
        Magazine magazine = new Magazine("1", "Sample Magazine", "Magazine Rack", true, System.currentTimeMillis(), 5.99);

        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access/MagazineAccess");
        libraryManager.addItem(magazine);

        // Create a RemoveItemCommand instance for a magazine
        RemoveItemCommand removeMagazineCommand = new RemoveItemCommand("1", "Magazine", libraryManager);

        // Execute the command
        List<PhysicalItem> items = new ArrayList<>();
        removeMagazineCommand.execute(items, "", libraryManager);

        // Verify that the magazine is removed from the list
        assertFalse(items.contains(magazine));
    }

    @Test
    public void getItemIdReturnsCorrectIdForCd() {
        // Create a RemoveItemCommand instance for a CD
        RemoveItemCommand removeItemCommand = new RemoveItemCommand("1", "Cd", null);

        // Verify that getItemId returns the correct ID
        assertEquals("1", removeItemCommand.getItemId());
    }

    @Test
    public void getItemTypeReturnsCorrectTypeForMagazine() {
        // Create a RemoveItemCommand instance for a magazine
        RemoveItemCommand removeItemCommand = new RemoveItemCommand("1", "Magazine", null);

        // Verify that getItemType returns the correct type
        assertEquals("Magazine", removeItemCommand.getItemType());
    }
    @Test
    public void executeDoesNotRemoveItemIfListIsEmpty() throws Exception {
        // Create an empty list of items
        List<PhysicalItem> items = new ArrayList<>();

        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access/BookAccess");

        // Create a RemoveItemCommand instance for a book
        RemoveItemCommand removeBookCommand = new RemoveItemCommand("1", "Book", libraryManager);

        // Execute the command
        removeBookCommand.execute(items, "", libraryManager);

        // Verify that the list remains empty
        assertTrue(items.isEmpty());
    }
    
    @Test
    public void executeRemovesBookFromLibraryWithMultipleItems() throws Exception {
        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access/BookAccess");

        // Create multiple sample books and add them to the library
        Book book1 = new Book("1", "Book 1", "Shelf A", true, System.currentTimeMillis(), 10.99);
        Book book2 = new Book("2", "Book 2", "Shelf B", true, System.currentTimeMillis(), 15.99);
        libraryManager.addItem(book1);
        libraryManager.addItem(book2);

        // Create a RemoveItemCommand instance for one of the books
        RemoveItemCommand removeBookCommand = new RemoveItemCommand("1", "Book", libraryManager);

        // Execute the command
        removeBookCommand.execute(libraryManager.getItems(), "", libraryManager);

        // Verify that only the specified book is removed from the library
        assertFalse(libraryManager.getItems().contains(book1));
        assertTrue(libraryManager.getItems().contains(book2));
    }
    @Test
    public void executeRemovesItemFromLibraryWithMultipleItemsOfDifferentTypes() throws Exception {
        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access/BookAccess");

        // Create sample items of different types and add them to the library
        Book book = new Book("1", "Book 1", "Shelf A", true, System.currentTimeMillis(), 10.99);
        Cd cd = new Cd("2", "Sample CD", "CD Rack", true, System.currentTimeMillis(), 15.99);
        Magazine magazine = new Magazine("3", "Sample Magazine", "Magazine Rack", true, System.currentTimeMillis(), 5.99);
        libraryManager.addItem(book);
        libraryManager.addItem(cd);
        libraryManager.addItem(magazine);

        // Create a RemoveItemCommand instance for one of the items
        RemoveItemCommand removeItemCommand = new RemoveItemCommand("2", "Cd", libraryManager);

        // Execute the command
        removeItemCommand.execute(libraryManager.getItems(), "", libraryManager);

        // Verify that only the specified item is removed from the library
        assertTrue(libraryManager.getItems().contains(book));
        assertFalse(libraryManager.getItems().contains(cd));
        assertTrue(libraryManager.getItems().contains(magazine));
    }
    
}
