package Tests;

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
import models.LibraryItem.UpdateCommand;

public class UpdateCommandTest {
    @Test
    public void executeUpdatesBookInLibrary() throws Exception {
        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access/BookAccess");

        // Create a sample book and add it to the library
        Book book = new Book("1", "Sample Book", "Shelf A", true, System.currentTimeMillis(), 10.99);
        libraryManager.addItem(book);

        // Create an updated version of the book
        Book updatedBook = new Book("1", "Updated Book", "Shelf B", false, System.currentTimeMillis(), 15.99);

        // Create an UpdateCommand instance for the updated book
        UpdateCommand updateBookCommand = new UpdateCommand(updatedBook, libraryManager);

        // Execute the command
        updateBookCommand.execute(libraryManager.getItems(), "", libraryManager);

        // Verify that the book is updated in the library
        assertTrue(libraryManager.getItems().contains(updatedBook));
    }

   
    @Test
    public void executeUpdatesCdInLibrary() throws Exception {
        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access/CdAccess");

        // Create a sample CD and add it to the library
        Cd cd = new Cd("1", "Sample CD", "CD Rack", true, System.currentTimeMillis(), 15.99);
        libraryManager.addItem(cd);

        // Create an updated version of the CD
        Cd updatedCd = new Cd("1", "Updated CD", "CD Shelf", false, System.currentTimeMillis(), 20.99);

        // Create an UpdateCommand instance for the updated CD
        UpdateCommand updateCdCommand = new UpdateCommand(updatedCd, libraryManager);

        // Execute the command
        updateCdCommand.execute(libraryManager.getItems(), "", libraryManager);

        // Verify that the CD is updated in the library
        assertTrue(libraryManager.getItems().contains(updatedCd));
    }

   
    @Test
    public void executeUpdatesMagazineInLibrary() throws Exception {
        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access/MagazineAccess");

        // Create a sample magazine and add it to the library
        Magazine magazine = new Magazine("1", "Sample Magazine", "Magazine Rack", true, System.currentTimeMillis(), 5.99);
        libraryManager.addItem(magazine);

        // Create an updated version of the magazine
        Magazine updatedMagazine = new Magazine("1", "Updated Magazine", "Magazine Shelf", false, System.currentTimeMillis(), 8.99);

        // Create an UpdateCommand instance for the updated magazine
        UpdateCommand updateMagazineCommand = new UpdateCommand(updatedMagazine, libraryManager);

        // Execute the command
        updateMagazineCommand.execute(libraryManager.getItems(), "", libraryManager);

        // Verify that the magazine is updated in the library
        assertTrue(libraryManager.getItems().contains(updatedMagazine));
    }

   
    @Test
    public void executeDoesNotUpdateNonExistentItem() throws Exception {
        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access/BookAccess");

        // Create an updated version of a non-existent book
        Book updatedBook = new Book("999", "Updated Book", "Shelf B", false, System.currentTimeMillis(), 15.99);

        // Create an UpdateCommand instance
        UpdateCommand updateCommand = new UpdateCommand(updatedBook, libraryManager);

        // Execute the command
        List<PhysicalItem> items = new ArrayList<>();
        updateCommand.execute(items, "", libraryManager);

        // Verify that the item is not added to the list
        assertTrue(items.isEmpty());
    }


    
    @Test
    public void executeUpdatesItemInLibraryWithMultipleItems() throws Exception {
        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access/BookAccess");

        // Create multiple sample books and add them to the library
        Book book1 = new Book("1", "Book 1", "Shelf A", true, System.currentTimeMillis(), 10.99);
        Book book2 = new Book("2", "Book 2", "Shelf B", true, System.currentTimeMillis(), 15.99);
        libraryManager.addItem(book1);
        libraryManager.addItem(book2);

        // Create an updated version of one of the books
        Book updatedBook = new Book("1", "Updated Book", "Shelf C", false, System.currentTimeMillis(), 20.99);

        // Create an UpdateCommand instance for the updated book
        UpdateCommand updateBookCommand = new UpdateCommand(updatedBook, libraryManager);

        // Execute the command
        updateBookCommand.execute(libraryManager.getItems(), "", libraryManager);

        // Verify that only the specified book is updated in the library
        assertTrue(libraryManager.getItems().contains(updatedBook));
        assertFalse(libraryManager.getItems().contains(book1));
        assertTrue(libraryManager.getItems().contains(book2));
    }

    
    @Test
    public void executeDoesNotUpdateAnyItemsInEmptyLibrary() throws Exception {
        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access/BookAccess");

        // Create an updated version of a book without adding it to the library
        Book updatedBook = new Book("1", "Updated Book", "Shelf B", false, System.currentTimeMillis(), 15.99);

        // Create an UpdateCommand instance for the non-existent book
        UpdateCommand updateBookCommand = new UpdateCommand(updatedBook, libraryManager);

        // Execute the command
        updateBookCommand.execute(libraryManager.getItems(), "", libraryManager);

        // Verify that the library remains empty
        assertTrue(libraryManager.getItems().isEmpty());
    }

   
    @Test
    public void executeUpdatesItemWithSameDetails() throws Exception {
        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access/BookAccess");

        // Create a sample book and add it to the library
        Book book = new Book("1", "Sample Book", "Shelf A", true, System.currentTimeMillis(), 10.99);
        libraryManager.addItem(book);

        // Create an updated version of the book with the same details
        Book updatedBook = new Book("1", "Sample Book", "Shelf A", true, System.currentTimeMillis(), 10.99);

        // Create an UpdateCommand instance for the updated book
        UpdateCommand updateBookCommand = new UpdateCommand(updatedBook, libraryManager);

        // Execute the command
        updateBookCommand.execute(libraryManager.getItems(), "", libraryManager);

        // Verify that the book is updated in the library
        assertTrue(libraryManager.getItems().contains(updatedBook));
    }

   
    @Test
    public void executeUpdatesItemWithDifferentDetails() throws Exception {
        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access/BookAccess");

        // Create a sample book and add it to the library
        Book book = new Book("1", "Sample Book", "Shelf A", true, System.currentTimeMillis(), 10.99);
        libraryManager.addItem(book);

        // Create an updated version of the book with different details
        Book updatedBook = new Book("1", "Updated Book", "Shelf B", false, System.currentTimeMillis(), 15.99);

        // Create an UpdateCommand instance for the updated book
        UpdateCommand updateBookCommand = new UpdateCommand(updatedBook, libraryManager);

        // Execute the command
        updateBookCommand.execute(libraryManager.getItems(), "", libraryManager);

        // Verify that the book is updated in the library
        assertTrue(libraryManager.getItems().contains(updatedBook));
    }

    
    @Test
    public void executeUpdatesItemWithDifferentDetailsInMultipleItemTypes() throws Exception {
        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access/BookAccess");

        // Create a sample book and add it to the library
        Book book = new Book("1", "Sample Book", "Shelf A", true, System.currentTimeMillis(), 10.99);
        libraryManager.addItem(book);

        // Create a sample CD and add it to the library
        Cd cd = new Cd("2", "Sample CD", "CD Rack", true, System.currentTimeMillis(), 15.99);
        libraryManager.addItem(cd);

        // Create an updated version of the book with different details
        Book updatedBook = new Book("1", "Updated Book", "Shelf B", false, System.currentTimeMillis(), 15.99);

        // Create an UpdateCommand instance for the updated book
        UpdateCommand updateBookCommand = new UpdateCommand(updatedBook, libraryManager);

        // Execute the command
        updateBookCommand.execute(libraryManager.getItems(), "", libraryManager);

        // Verify that the book is updated in the library
        assertTrue(libraryManager.getItems().contains(updatedBook));
        assertTrue(libraryManager.getItems().contains(cd)); // Ensure other item type remains unaffected
    }


    @Test
    public void executeUpdatesItemWithDifferentDetailsInExistingItems() throws Exception {
        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access/BookAccess");

        // Create multiple sample books and add them to the library
        Book book1 = new Book("1", "Book 1", "Shelf A", true, System.currentTimeMillis(), 10.99);
        Book book2 = new Book("2", "Book 2", "Shelf B", true, System.currentTimeMillis(), 15.99);
        libraryManager.addItem(book1);
        libraryManager.addItem(book2);

        // Create an updated version of one of the books with different details
        Book updatedBook = new Book("2", "Updated Book", "Shelf C", false, System.currentTimeMillis(), 20.99);

        // Create an UpdateCommand instance for the updated book
        UpdateCommand updateBookCommand = new UpdateCommand(updatedBook, libraryManager);

        // Execute the command
        updateBookCommand.execute(libraryManager.getItems(), "", libraryManager);

        // Verify that only the specified book is updated in the library
        assertTrue(libraryManager.getItems().contains(updatedBook));
        assertTrue(libraryManager.getItems().contains(book1)); // Ensure other items are still present
    }
    
}
