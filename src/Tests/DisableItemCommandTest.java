package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.Cd;
import models.Items.PhysicalItems.Magazine;
import models.Items.PhysicalItems.PhysicalItem;
import models.LibraryItem.AddItemCommand;
import models.LibraryItem.DisableItemCommand;
import models.LibraryItem.LibraryManager;

public class DisableItemCommandTest {
    private LibraryManager libraryManager;

    @Before
    public void setUp() {
        libraryManager = new LibraryManager("path");
    }
    @Test
    public void testDisableBookItem() throws Exception {
        Book book = new Book("1", "Book 1", "Library", true, System.currentTimeMillis(), 10.0);
        libraryManager.addItem(book);
        assertTrue(book.getPurchasability()); // Ensure book is initially purchasable

        DisableItemCommand command = new DisableItemCommand("1", "Book", libraryManager);
        command.execute(libraryManager.getItems(), "path", libraryManager);

        assertFalse(book.getPurchasability()); // Verify book is disabled
        libraryManager.removeItem("1", "Book");
    }



    @Test
    public void testDisableCdItem() throws Exception {
        Cd cd = new Cd("3", "CD 1", "Library", true, System.currentTimeMillis(), 15.0);
        libraryManager.addItem(cd);
        assertTrue(cd.getPurchasability()); // Ensure CD is initially purchasable

        DisableItemCommand command = new DisableItemCommand("3", "Cd", libraryManager);
        command.execute(libraryManager.getItems(), "path", libraryManager);

        assertFalse(cd.getPurchasability()); // Verify CD is disabled
        libraryManager.removeItem("3", "Cd");
    }

    @Test
    public void testExecute_DisableInvalidItemType() throws Exception {
        List<PhysicalItem> items = new ArrayList<>();
        AddItemCommand addItemCommand = new AddItemCommand(new Book("4", "Book 2", "Library", true, System.currentTimeMillis(), 12.0), libraryManager);
        addItemCommand.execute(items, "path", libraryManager);

        List<PhysicalItem> itemsBefore = new ArrayList<>(items);
        try {
            DisableItemCommand command = new DisableItemCommand("4", "InvalidType", libraryManager);
            command.execute(items, "path", libraryManager);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals(itemsBefore.size(), items.size());
        }
        libraryManager.removeItem("4", "Book");
    }

 

    @Test
    public void testExecute_DisableItemWithNullItemType() throws Exception {
        List<PhysicalItem> items = new ArrayList<>();
        try {
            DisableItemCommand command = new DisableItemCommand("9", null, libraryManager);
            command.execute(items, "path", libraryManager);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException e) {
            assertEquals(0, items.size());
        }
    }
   
    @Test
    public void testDisableMagazineItem() throws Exception {
        // Add a magazine item
        Magazine magazine = new Magazine("1", "National Geographic", "Library", true, System.currentTimeMillis(), 5.0);
        libraryManager.addItem(magazine);

        // Disable the magazine item
        DisableItemCommand disableCommand = new DisableItemCommand("1", "Magazine", libraryManager);
        disableCommand.execute(libraryManager.getItems(), "path", libraryManager);

        // Verify that the magazine item is disabled
        assertFalse("Purchasability of the magazine is not set to false after disabling", libraryManager.getItems().get(0).getPurchasability());
        libraryManager.removeItem("1", "Magazine");
    }
    @Test(expected = IllegalArgumentException.class)
    public void testDisableItemWithInvalidType() throws Exception {
        // Add a magazine item
        Magazine magazine = new Magazine("1", "National Geographic", "Library", true, System.currentTimeMillis(), 5.0);
        libraryManager.addItem(magazine);

        // Attempt to disable the magazine item with an invalid type
        DisableItemCommand disableCommand = new DisableItemCommand("1", "InvalidType", libraryManager);
        disableCommand.execute(libraryManager.getItems(), "path", libraryManager);
        libraryManager.removeItem("1", "Magazine");
    }
   
  
    @Test
    public void testDisableMultipleItems() throws Exception {
        // Add items to the library
        Book book = new Book("B001", "Harry Potter", "Library", true, System.currentTimeMillis(), 15.0);
        Magazine magazine = new Magazine("M001", "National Geographic", "Library", true, System.currentTimeMillis(), 5.0);
        Cd cd = new Cd("C001", "Thriller", "Library", true, System.currentTimeMillis(), 10.0);
        libraryManager.addItem(book);
        libraryManager.addItem(magazine);
        libraryManager.addItem(cd);

        // Disable each item
        DisableItemCommand disableBookCommand = new DisableItemCommand("B001", "Book", libraryManager);
        disableBookCommand.execute(libraryManager.getItems(), "path", libraryManager);

        DisableItemCommand disableMagazineCommand = new DisableItemCommand("M001", "Magazine", libraryManager);
        disableMagazineCommand.execute(libraryManager.getItems(), "path", libraryManager);

        DisableItemCommand disableCdCommand = new DisableItemCommand("C001", "Cd", libraryManager);
        disableCdCommand.execute(libraryManager.getItems(), "path", libraryManager);

        // Verify that all items are disabled
        assertFalse("Purchasability of the book is not set to false after disabling", libraryManager.getItems().get(0).getPurchasability());
        assertFalse("Purchasability of the magazine is not set to false after disabling", libraryManager.getItems().get(1).getPurchasability());
        assertFalse("Purchasability of the CD is not set to false after disabling", libraryManager.getItems().get(2).getPurchasability());
        libraryManager.removeItem("B001", "Book");
        libraryManager.removeItem("M001", "Magazine");
        libraryManager.removeItem("C001", "Cd");
    }
    @Test
    public void testDisableAlreadyDisabledItem() throws Exception {
        // Add a magazine item and disable it
        Magazine magazine = new Magazine("1", "National Geographic", "Library", true, System.currentTimeMillis(), 5.0);
        libraryManager.addItem(magazine);
        DisableItemCommand disableCommand = new DisableItemCommand("1", "Magazine", libraryManager);
        disableCommand.execute(libraryManager.getItems(), "path", libraryManager);

        // Attempt to disable the magazine item again
        disableCommand.execute(libraryManager.getItems(), "path", libraryManager);

        // Verify that the magazine item remains disabled
        assertFalse("Purchasability of the magazine is not set to false after disabling again", libraryManager.getItems().get(0).getPurchasability());
        libraryManager.removeItem("1", "Magazine");
    }
    @Test
    public void testDisableAlreadyDisabledBookItem() throws Exception {
        Book book = new Book("8", "Book 2", "Library", false, System.currentTimeMillis(), 20.0);
        libraryManager.addItem(book);
        assertFalse(book.getPurchasability()); // Ensure book is initially not purchasable

        DisableItemCommand command = new DisableItemCommand("8", "Book", libraryManager);
        command.execute(libraryManager.getItems(), "path", libraryManager);

        assertFalse(book.getPurchasability()); // Verify book remains disabled
        libraryManager.removeItem("8", "Book");
    }
    @Test
    public void testDisableAlreadyDisabledCdItem() throws Exception {
        Cd cd = new Cd("10", "CD 2", "Library", false, System.currentTimeMillis(), 25.0);
        libraryManager.addItem(cd);
        assertFalse(cd.getPurchasability()); // Ensure CD is initially not purchasable

        DisableItemCommand command = new DisableItemCommand("10", "Cd", libraryManager);
        command.execute(libraryManager.getItems(), "path", libraryManager);

        assertFalse(cd.getPurchasability()); // Verify CD remains disabled
        libraryManager.removeItem("10", "Cd");
    }
    
}
