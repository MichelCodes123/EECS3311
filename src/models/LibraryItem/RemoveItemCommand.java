package models.LibraryItem;

import models.Items.PhysicalItems.PhysicalItem;

import java.util.Iterator;
import java.util.List;

public class RemoveItemCommand implements Command {
    private int itemId;
    private String itemType;
    private LibraryManager libraryManager;

    public RemoveItemCommand(int itemId, String itemType, LibraryManager libraryManager) {
        this.itemId = itemId;
        this.itemType = itemType;
        this.libraryManager = libraryManager;
    }

    @Override
    public void execute(List<PhysicalItem> items, String path, LibraryManager libraryManager) {
        libraryManager.removeItem(itemId, itemType);
    }

    public int getItemId() {
        return itemId;
    }
    public String getItemType() {
        return itemType;
    }
}
