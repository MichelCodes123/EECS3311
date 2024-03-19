package models.LibraryItem;

import models.Items.PhysicalItems.PhysicalItem;

import java.util.List;

public class DisableItemCommand implements Command {
    private String itemId;
    private String itemType;
    private LibraryManager libraryManager;

    public DisableItemCommand(String itemId, String itemType, LibraryManager libraryManager) {
        this.itemId = itemId;
        this.itemType = itemType;
        this.libraryManager = libraryManager;
    }

    @Override
    public void execute(List<PhysicalItem> items, String path, LibraryManager libraryManager) throws Exception {
        libraryManager.disableItem(itemId, itemType);
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemType() {
        return itemType;
    }
}