package models.LibraryItem;

import models.Items.PhysicalItems.PhysicalItem;

import java.util.List;

public class DisableItemCommand implements Command {
    private int itemId;
    private LibraryManager libraryManager;


    public DisableItemCommand(int itemId, LibraryManager libraryManager) {
        this.itemId = itemId;
        this.libraryManager = libraryManager;
    }
    @Override
    public void execute(List<PhysicalItem> items, String path, LibraryManager libraryManager) {
        for (PhysicalItem item : items) {
            if (item.getId() == itemId) {
                item.setEnabled(false);
                break;
            }
        }
       libraryManager.updateLibrary(items, path);
    }
}