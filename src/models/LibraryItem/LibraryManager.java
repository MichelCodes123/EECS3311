package models.LibraryItem;

import models.Items.PhysicalItems.PhysicalItem;

import java.util.HashMap;
import java.util.Map;
public class LibraryManager {
    private Map<Integer, PhysicalItem> libraryItems;

    public LibraryManager() {
        this.libraryItems = new HashMap<>();
    }

    public void addItem(PhysicalItem item) {
        libraryItems.put(item.getId(), item);
    }

    public void enableItem(PhysicalItem item) {
        if (item != null && libraryItems.containsKey(item.getId())) {
            item.setCan_purchase(true);
        }
    }

    public void disableItem(PhysicalItem item) {
        if (item != null && libraryItems.containsKey(item.getId())) {
            item.setCan_purchase(false);
        }
    }

    // Other methods for managing the library items
    public PhysicalItem getItemById(int id) {
        return libraryItems.get(id);
    }
    public void removeItem(PhysicalItem item) {
        if (item != null) {
            libraryItems.remove(item.getId());
        }
    }
}
