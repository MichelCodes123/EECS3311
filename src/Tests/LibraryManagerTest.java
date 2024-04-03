package Tests;

import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.Cd;
import models.Items.PhysicalItems.Magazine;
import models.Items.PhysicalItems.PhysicalItem;
import models.LibraryItem.ItemIdGenerator;
import models.LibraryItem.LibraryManager;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;


public class LibraryManagerTest {
    // Utility method to check if an item exists in a CSV file
    private boolean isItemInCsvFile(String filePath, PhysicalItem item) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            // Skip the header row
            reader.readLine();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 6) {
                    String id = parts[0];
                    String name = parts[1];
                    String location = parts[2];
                    boolean canPurchase = Boolean.parseBoolean(parts[3]);
                    Long csvDueDate = Long.parseLong(parts[4]);

                    double dollarAmount = Double.parseDouble(parts[5]);

                    Long itemDueDateString = item.getDueDate();
                    String csvDueDateString = dateFormat.format(csvDueDate);


                        if (id.equals(item.getId()) && name.equals(item.getName()) && location.equals(item.getLocation()) && canPurchase == item.getPurchasability() && csvDueDate.equals(itemDueDateString) && dollarAmount == item.getDollarAmount()) {
                            return true;
                        }
                }
            }
        } catch (IOException e) {
            fail("Failed to read CSV file: " + e.getMessage());
        } catch (NumberFormatException e) {
            fail("Failed to parse CSV file data: " + e.getMessage());
        }
        return false;
    }
    @Test
    public void addItemTest() throws Exception {
        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/test");
        ItemIdGenerator idGenerator = ItemIdGenerator.getInstance();
//        System.out.println("ItemIdGenerator instance hashCode: " + idGenerator.hashCode());
        long currentTime = System.currentTimeMillis();
        long dueDate1 = currentTime + TimeUnit.DAYS.toMillis(7); // 7 days from now
        long dueDate2 = currentTime + TimeUnit.DAYS.toMillis(14); // 14 days from now
        long dueDate3 = currentTime + TimeUnit.DAYS.toMillis(21);
        String itemId1 = idGenerator.generateId();
        String itemId2 = idGenerator.generateId();
        String itemId3 = idGenerator.generateId();

        // Create a new book
        Cd cd = new Cd(itemId1, "Sample Book", "Shelf A", true, dueDate1, 10.99);
        Cd cd1 = new Cd(itemId2, "Computer Book", "Shelf B", true, dueDate2, 10.00);
        Cd cd2 = new Cd(itemId3, "Science Book", "Shelf B", true, dueDate3, 10.00);


        // Add the book to the library
        libraryManager.addItem(cd);
        libraryManager.addItem(cd1);
        libraryManager.addItem(cd2);

        // Verify that the book is added to the library
        assertTrue(libraryManager.getItems().contains(cd));
        assertTrue(libraryManager.getItems().contains(cd1));
        assertTrue(libraryManager.getItems().contains(cd2));

        // Check if the CSV file contains the added book
        assertTrue(isItemInCsvFile("src/database/Cd.csv", cd));
        assertTrue(isItemInCsvFile("src/database/Cd.csv", cd1));
        assertTrue(isItemInCsvFile("src/database/Cd.csv", cd2));

        // Clean up - remove the added book from the library
        libraryManager.removeItem(cd.getId(), "Cd");
        libraryManager.removeItem(cd1.getId(), "Cd");
        libraryManager.removeItem(cd2.getId(), "Cd");
    }

    @Test
    public void addItemTest1() throws Exception {
        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access/BookAccess");

        // Create new items
        Book book = new Book(Integer.toString(1), "Sample Book", "Shelf A", true, System.currentTimeMillis(), 10.99);
        Cd cd = new Cd(Integer.toString(1), "Sample CD", "CD Rack", true, System.currentTimeMillis(), 15.99);
        Magazine magazine = new Magazine(Integer.toString(1), "Sample Magazine", "Magazine Rack", true, System.currentTimeMillis(), 5.99);

        // Add the items to the library
        libraryManager.addItem(book);
        libraryManager.addItem(cd);
        libraryManager.addItem(magazine);

        // Verify that the items are added to the library
        assertTrue(libraryManager.getItems().contains(book));
        assertTrue(libraryManager.getItems().contains(cd));
        assertTrue(libraryManager.getItems().contains(magazine));

        // Clean up - remove the added items from the library
        libraryManager.removeItem(book.getId(), "Book");
        libraryManager.removeItem(cd.getId(), "Cd");
        libraryManager.removeItem(magazine.getId(), "Magazine");
    }
    @Test
    public void removeItemTest() throws Exception {
        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access");

        // Create new items
        Book book = new Book(Integer.toString(4), "Sample Book", "Shelf A", true, System.currentTimeMillis(), 10.99);
        Magazine magazine = new Magazine(Integer.toString(5), "Sample Magazine", "Magazine Rack", false, System.currentTimeMillis(), 5.99);


        // Add the items to the library
        libraryManager.addItem(book);
        libraryManager.addItem(magazine);


        // Remove an item from the library
        libraryManager.removeItem(book.getId(), "Book");
        libraryManager.removeItem(magazine.getId(), "Magazine");

        // Verify that the removed item is no longer in the library
        assertFalse(libraryManager.getItems().contains(book));
        assertFalse(libraryManager.getItems().contains(magazine));
    }
    @Test
    public void enableItemTest() throws Exception {
        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access/BookAccess");

        // Create a new item
        Magazine magazine = new Magazine(Integer.toString(6), "Sample Magazine", "Magazine Rack", false, System.currentTimeMillis(), 5.99);

        // Add the item to the library
        libraryManager.addItem(magazine);

        // Enable the item
        libraryManager.enableItem(magazine.getId(), "Magazine");

        // Verify that the item is enabled in the library
        assertTrue(libraryManager.getItems().get(0).getPurchasability());
        libraryManager.removeItem(magazine.getId(), "Magazine");
    }
    @Test
    public void disableItemTest() throws Exception {
        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access/BookAccess");

        // Create a new item
        Cd cd = new Cd(Integer.toString(1), "Sample CD", "CD Rack", true, System.currentTimeMillis(), 15.99);

        // Add the item to the library
        libraryManager.addItem(cd);

        // Disable the item
        libraryManager.disableItem(cd.getId(), "Cd");

        // Verify that the item is disabled in the library
        assertFalse(cd.getPurchasability());
        libraryManager.removeItem(cd.getId(), "Cd");
    }
    @Test
    public void updateItemTest() throws Exception {
        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access");

        // Create a new item
        Book book = new Book(Integer.toString(1), "Sample Book", "Shelf A", true, System.currentTimeMillis(), 10.99);

        // Add the item to the library
        libraryManager.addItem(book);

        // Update the item
        Book updatedBook = new Book(Integer.toString(1), "Updated Book", "Shelf B", false, System.currentTimeMillis(), 15.99);
        libraryManager.updateItem(updatedBook);

        // Get the updated item from the library
        List<PhysicalItem> items = libraryManager.getItems();
        Optional<PhysicalItem> optionalItem = items.stream().filter(item -> Objects.equals(item.getId(), updatedBook.getId())).findFirst();

        // Verify that the item is updated in the library
        assertTrue(optionalItem.isPresent());
        PhysicalItem retrievedItem = optionalItem.get();
        assertEquals("Updated Book", retrievedItem.getName());
        assertEquals("Shelf B", retrievedItem.getLocation());
        assertFalse(retrievedItem.getPurchasability());
        assertEquals(15.99, retrievedItem.getDollarAmount(), 0.001);
        libraryManager.removeItem(updatedBook.getId(), "Book");
    }
    @Test
    public void readCsvFileTest() throws Exception {
        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager("src/database_access");

        // Read items from the CSV file
        List<PhysicalItem> itemsBefore = libraryManager.getItems();
        //System.out.println("itemsBefore"+ itemsBefore);

        assertNotNull(itemsBefore);

        // Add a new item
        Book newBook = new Book(Integer.toString(1), "New Book", "Shelf B", true, System.currentTimeMillis(), 19.99);
        libraryManager.addItem(newBook);

        // Read items from the CSV file again
        List<PhysicalItem> itemsAfter = libraryManager.getItems();

        // Verify that the new item is added to the library and CSV file
        assertTrue(itemsAfter.contains(newBook));
        assertEquals(itemsBefore.size() , itemsAfter.size());

        // Clean up - remove the added item from the library
        libraryManager.removeItem(newBook.getId(), "Book");
    }

    @Test
    public void testUniqueItemIds() throws Exception {
    // Create a LibraryManager instance
    LibraryManager libraryManager = new LibraryManager("src/database_access");

    try {
        // Add multiple items to the library
        for (int i = 0; i < 10; i++) {
            libraryManager.addItem(new Book( Integer.toString(i), "Book", "Shelf", true, System.currentTimeMillis(), 10.99));
        }

        // Get all items from the library
        List<PhysicalItem> items = libraryManager.getItems();

        // Verify that each item has a unique ID
        Set<String> itemIds = new HashSet<>();
        for (PhysicalItem item : items) {
            assertTrue(itemIds.add(item.getId()), "Duplicate ID found");
        }
    } finally {
        // Clean up - remove the added items from the library
        for (int i = 0; i < 10; i++) {
            libraryManager.removeItem(Integer.toString(i), "Book");
        }
     }
    }

    @Test
    public void disableItemInvalidTypeTest() throws Exception {
    // Create a LibraryManager instance
    LibraryManager libraryManager = new LibraryManager("src/database_access/BookAccess");

    // Create a new item
    Cd cd = new Cd(Integer.toString(1), "Sample CD", "CD Rack", true, System.currentTimeMillis(), 15.99);

    try {
        // Add the item to the library
        libraryManager.addItem(cd);

        // Disable the item with an invalid item type
        assertThrows(IllegalArgumentException.class, () -> {
            libraryManager.disableItem(cd.getId(), "InvalidType");
        });
    } finally {
        // Clean up - remove the added item from the library
        libraryManager.removeItem(cd.getId(), "Cd");
    }
    }

    @Test
    public void enableItemInvalidTypeTest() throws Exception {
    // Create a LibraryManager instance
    LibraryManager libraryManager = new LibraryManager("src/database_access/BookAccess");

    // Create a new item
    Magazine magazine = new Magazine(Integer.toString(6), "Sample Magazine", "Magazine Rack", false, System.currentTimeMillis(), 5.99);

    try {
        // Add the item to the library
        libraryManager.addItem(magazine);

        // Enable the item with an invalid item type
        assertThrows(IllegalArgumentException.class, () -> {
            libraryManager.enableItem(magazine.getId(), "InvalidType");
        });
    } finally {
        // Clean up - remove the added item from the library
        libraryManager.removeItem(magazine.getId(), "Magazine");
     }
    }



}




