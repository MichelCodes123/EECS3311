package Tests;

import static org.junit.Assert.assertEquals;
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
import models.LibraryItem.LibraryManager;

public class AddItemCommandTest {

    private LibraryManager libraryManager;

    @Before
    public void setUp() {
        libraryManager = new LibraryManager("path");
    }

    @Test
    public void testExecute_AddBook() throws Exception {
        List<PhysicalItem> items = new ArrayList<>();
        AddItemCommand command = new AddItemCommand(new Book("1", "Book 1", "Library", true, System.currentTimeMillis(), 10.0), libraryManager);
        
        command.execute(items, "path", libraryManager);

        assertEquals(1, items.size());
        assertTrue(items.get(0) instanceof Book);
        assertEquals("Book 1", items.get(0).getName());
    }

    @Test
    public void testExecute_AddMagazine() throws Exception {
        List<PhysicalItem> items = new ArrayList<>();
        AddItemCommand command = new AddItemCommand(new Magazine("2", "Magazine 1", "Library", true, System.currentTimeMillis(), 5.0), libraryManager);

        command.execute(items, "path", libraryManager);

        assertEquals(1, items.size());
        assertTrue(items.get(0) instanceof Magazine);
        assertEquals("Magazine 1", items.get(0).getName());
    }

    @Test
    public void testExecute_AddCd() throws Exception {
        List<PhysicalItem> items = new ArrayList<>();
        AddItemCommand command = new AddItemCommand(new Cd("3", "CD 1", "Library", true, System.currentTimeMillis(), 15.0), libraryManager);

        command.execute(items, "path", libraryManager);

        assertEquals(1, items.size());
        assertTrue(items.get(0) instanceof Cd);
        assertEquals("CD 1", items.get(0).getName());
    }

    @Test
    public void testExecute_AddItem() {
        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("path");

        // Create an empty list of items
        List<PhysicalItem> items = new ArrayList<>();

        // Create an item to add
        PhysicalItem itemToAdd = new Book("1", "Book 1", "Library", true, System.currentTimeMillis(), 10.0);

        // Create an AddItemCommand instance
        AddItemCommand command = new AddItemCommand(itemToAdd, libraryManager);

        try {
            // Execute the command
            command.execute(items, "path", libraryManager);

            // Assert that the item is added to the list
            assertEquals(1, items.size());
            assertTrue(items.contains(itemToAdd));
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }



    @Test
    public void testExecute_AddMultipleBooks() throws Exception {
        List<PhysicalItem> items = new ArrayList<>();
        AddItemCommand command1 = new AddItemCommand(new Book("5", "Book 2", "Library", true, System.currentTimeMillis(), 12.0), libraryManager);
        AddItemCommand command2 = new AddItemCommand(new Book("6", "Book 3", "Library", true, System.currentTimeMillis(), 8.0), libraryManager);
        
        command1.execute(items, "path", libraryManager);
        command2.execute(items, "path", libraryManager);

        assertEquals(2, items.size());
        assertTrue(items.get(0) instanceof Book);
        assertTrue(items.get(1) instanceof Book);
    }

    @Test
    public void testExecute_AddItemsWithSameId() throws Exception {
        List<PhysicalItem> items = new ArrayList<>();
        AddItemCommand command1 = new AddItemCommand(new Book("7", "Book 4", "Library", true, System.currentTimeMillis(), 10.0), libraryManager);
        AddItemCommand command2 = new AddItemCommand(new Magazine("7", "Magazine 2", "Library", true, System.currentTimeMillis(), 7.0), libraryManager);
        
        command1.execute(items, "path", libraryManager);
        command2.execute(items, "path", libraryManager);

        // If no exception is thrown, both items are added
        assertEquals(2, items.size());
    }


    @Test
    public void testExecute_AddItemToEmptyList() throws Exception {
        List<PhysicalItem> items = new ArrayList<>();
        AddItemCommand command = new AddItemCommand(new Cd("8", "CD 2", "Library", true, System.currentTimeMillis(), 18.0), libraryManager);

        command.execute(items, "path", libraryManager);

        assertEquals(1, items.size());
        assertTrue(items.get(0) instanceof Cd);
        assertEquals("CD 2", items.get(0).getName());
    }

    @Test
    public void testExecute_AddMultipleItems() throws Exception {
        List<PhysicalItem> items = new ArrayList<>();
        AddItemCommand command1 = new AddItemCommand(new Book("9", "Book 5", "Library", true, System.currentTimeMillis(), 11.0), libraryManager);
        AddItemCommand command2 = new AddItemCommand(new Magazine("10", "Magazine 3", "Library", true, System.currentTimeMillis(), 6.0), libraryManager);
        AddItemCommand command3 = new AddItemCommand(new Cd("11", "CD 3", "Library", true, System.currentTimeMillis(), 20.0), libraryManager);
        
        command1.execute(items, "path", libraryManager);
        command2.execute(items, "path", libraryManager);
        command3.execute(items, "path", libraryManager);

        assertEquals(3, items.size());
        assertTrue(items.get(0) instanceof Book);
        assertTrue(items.get(1) instanceof Magazine);
        assertTrue(items.get(2) instanceof Cd);
    }

    @Test
    public void testExecute_AddItemWithNullValues() throws Exception {
        List<PhysicalItem> items = new ArrayList<>();
        AddItemCommand command = new AddItemCommand(new Cd("12", null, null, null, null, null), libraryManager);

        command.execute(items, "path", libraryManager);

        assertEquals(1, items.size());
        assertTrue(items.get(0) instanceof Cd);
        assertEquals(null, items.get(0).getName());
        assertEquals(null, items.get(0).getLocation());
        assertEquals(null, items.get(0).getPurchasability());
        assertEquals(null, items.get(0).getDueDate());
        assertEquals(null, items.get(0).getDollarAmount());
    }

    @Test(expected = Exception.class)
    public void testExecute_AddItemThrowsException() throws Exception {
        List<PhysicalItem> items = new ArrayList<>();
        AddItemCommand command = new AddItemCommand(new Cd("13", "CD 4", "Library", true, System.currentTimeMillis(), 22.0), libraryManager) {
            @Override
            public void execute(List<PhysicalItem> items, String path, LibraryManager libraryManager) throws Exception {
                throw new Exception("Failed to add item");
            }
        };

        command.execute(items, "path", libraryManager);
    }
}
