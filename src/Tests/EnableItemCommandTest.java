package Tests;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.Cd;
import models.Items.PhysicalItems.Magazine;
import models.LibraryItem.EnableItemCommand;
import models.LibraryItem.LibraryManager;

public class EnableItemCommandTest {
    private LibraryManager libraryManager;

    @Before
    public void setUp() {
        libraryManager = new LibraryManager("path");
    }

    @Test
    public void testEnableExistingBook() throws Exception {
        // Arrange
        Book book = new Book("1", "Book 1", "Library", false, System.currentTimeMillis(), 10.0);
        libraryManager.addItem(book);

        // Act
        EnableItemCommand command = new EnableItemCommand("1", "Book", libraryManager);
        command.execute(libraryManager.getItems(), "path", libraryManager);

        // Assert
        assertTrue(book.getPurchasability());
    }
    @Test
    public void testEnableNonexistentBook() throws Exception {
        // Arrange
        assertTrue(libraryManager.getItems().isEmpty()); // Ensure the list is initially empty

        // Act
        EnableItemCommand command = new EnableItemCommand("2", "Book", libraryManager);
        command.execute(libraryManager.getItems(), "path", libraryManager);

        // Assert: Should not throw an exception, and no item should be enabled since none exist
        assertTrue(libraryManager.getItems().isEmpty()); // Ensure the list remains empty
    }


    

    @Test
    public void testEnableExistingMagazine() throws Exception {
        // Arrange
        Magazine magazine = new Magazine("1", "Magazine 1", "Library", false, System.currentTimeMillis(), 5.0);
        libraryManager.addItem(magazine);

        // Act
        EnableItemCommand command = new EnableItemCommand("1", "Magazine", libraryManager);
        command.execute(libraryManager.getItems(), "path", libraryManager);

        // Assert
        assertTrue(magazine.getPurchasability());
    }

    @Test
    public void testEnableNonexistentMagazine() throws Exception {
        // Arrange
        assertTrue(libraryManager.getItems().isEmpty()); // Ensure the list is initially empty

        // Act
        EnableItemCommand command = new EnableItemCommand("2", "Magazine", libraryManager);
        command.execute(libraryManager.getItems(), "path", libraryManager);

        // Assert: Should not throw an exception, and no item should be enabled since none exist
        assertTrue(libraryManager.getItems().isEmpty()); // Ensure the list remains empty
    }

    @Test
    public void testEnableExistingCd() throws Exception {
        // Arrange
        Cd cd = new Cd("1", "CD 1", "Library", false, System.currentTimeMillis(), 15.0);
        libraryManager.addItem(cd);

        // Act
        EnableItemCommand command = new EnableItemCommand("1", "Cd", libraryManager);
        command.execute(libraryManager.getItems(), "path", libraryManager);

        // Assert
        assertTrue(cd.getPurchasability());
    }

    @Test
    public void testEnableNonexistentCd() throws Exception {
        // Arrange
        assertTrue(libraryManager.getItems().isEmpty()); // Ensure the list is initially empty

        // Act
        EnableItemCommand command = new EnableItemCommand("2", "Cd", libraryManager);
        command.execute(libraryManager.getItems(), "path", libraryManager);

        // Assert: Should not throw an exception, and no item should be enabled since none exist
        assertTrue(libraryManager.getItems().isEmpty()); // Ensure the list remains empty
    }
    

  
    @Test
    public void testEnableItemWithNullItemId() throws Exception {
        // Attempt to enable an item with null item ID
        LibraryManager libraryManager = new LibraryManager("path");
        EnableItemCommand command = new EnableItemCommand(null, "Book", libraryManager);
        command.execute(libraryManager.getItems(), "path", libraryManager);
        // No exception is expected, so the test passes if it reaches this point
        assertTrue(true);
    }



    @Test
    public void testEnableNonExistentItem() throws Exception {
        // Attempt to enable a non-existent item
        LibraryManager libraryManager = new LibraryManager("path");
        EnableItemCommand command = new EnableItemCommand("100", "Book", libraryManager);
        command.execute(libraryManager.getItems(), "path", libraryManager);
        // No exception is expected, so the test passes if it reaches this point
        assertTrue(true);
    }

    @Test
    public void testEnableItemWithNonMatchingType() throws Exception {
        // Attempt to enable an item with a non-matching item type
        Magazine magazine = new Magazine("1", "Magazine 1", "Library", false, System.currentTimeMillis(), 5.0);
        LibraryManager libraryManager = new LibraryManager("path");
        libraryManager.addItem(magazine);
        
        EnableItemCommand command = new EnableItemCommand("1", "Book", libraryManager);
        command.execute(libraryManager.getItems(), "path", libraryManager);
        // No exception is expected, so the test passes if it reaches this point
        assertTrue(true);
    }


    @Test
    public void testEnableItemWithDuplicateItemIds() throws Exception {
        // Enable an item with duplicate item IDs but different item types
        Book book = new Book("1", "Book 1", "Library", false, System.currentTimeMillis(), 10.0);
        Magazine magazine = new Magazine("1", "Magazine 1", "Library", false, System.currentTimeMillis(), 5.0);
        LibraryManager libraryManager = new LibraryManager("path");
        libraryManager.addItem(book);
        libraryManager.addItem(magazine);
        
        EnableItemCommand command = new EnableItemCommand("1", "Book", libraryManager);
        command.execute(libraryManager.getItems(), "path", libraryManager);

        assertTrue(book.getPurchasability());
    }

    @Test
    public void testEnableItemWithDuplicateItemTypes() throws Exception {
        // Enable an item with duplicate item types but different item IDs
        Book book1 = new Book("1", "Book 1", "Library", false, System.currentTimeMillis(), 10.0);
        Book book2 = new Book("2", "Book 2", "Library", false, System.currentTimeMillis(), 10.0);
        LibraryManager libraryManager = new LibraryManager("path");
        libraryManager.addItem(book1);
        libraryManager.addItem(book2);
        
        EnableItemCommand command = new EnableItemCommand("1", "Book", libraryManager);
        command.execute(libraryManager.getItems(), "path", libraryManager);

        assertTrue(book1.getPurchasability());
    }
    
    
}
