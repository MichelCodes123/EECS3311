package models.LibraryItem;

import models.Items.PhysicalItems.PhysicalItem;

import java.util.Iterator;
import java.util.List;

public class RemoveItemCommand implements Command {
    private int itemId;
    private LibraryManager libraryManager;

    public RemoveItemCommand(int itemId, LibraryManager libraryManager) {
        this.itemId = itemId;
        this.libraryManager = libraryManager;
    }

    @Override
    public void execute(List<PhysicalItem> items, String path, LibraryManager libraryManager) {
        Iterator<PhysicalItem> iterator = items.iterator();
        while (iterator.hasNext()) {
            PhysicalItem item = iterator.next();
            if (item.getId() == itemId) {
                iterator.remove();
                break;
            }
        }
        libraryManager.updateLibrary(items, path);
    }
}
