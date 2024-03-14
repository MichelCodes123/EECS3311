package models.LibraryItem;

import models.Items.PhysicalItems.PhysicalItem;

import java.util.List;

public class DisableItemCommand implements Command {
    private int itemId;
    private String itemType;
    private LibraryManager libraryManager;

    public DisableItemCommand(int itemId, String itemType, LibraryManager libraryManager) {
        this.itemId = itemId;
        this.itemType = itemType;
        this.libraryManager = libraryManager;
    }

    @Override
    public void execute(List<PhysicalItem> items, String path, LibraryManager libraryManager) {
        libraryManager.disableItem(itemId, itemType);
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemType() {
        return itemType;
    }
}