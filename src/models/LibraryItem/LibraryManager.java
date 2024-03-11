package models.LibraryItem;

import java.util.HashMap;
import java.util.Map;
public class LibraryManager {
    private Map<Integer, LibraryItem> libraryItems;

    public LibraryManager() {
        this.libraryItems = new HashMap<>();
    }

    public void addItem(LibraryItem item) {
        libraryItems.put(item.getId(), item);
    }

    public void enableItem(LibraryItem item) {
        if (item != null && libraryItems.containsKey(item.getId())) {
            item.setCanBePurchased(true);
        }
    }

    public void disableItem(LibraryItem item) {
        if (item != null && libraryItems.containsKey(item.getId())) {
            item.setCanBePurchased(false);
        }
    }

    // Other methods for managing the library items
    public LibraryItem getItemById(int id) {
        return libraryItems.get(id);
    }
}
