package models.LibraryItem;

import models.Items.PhysicalItems.PhysicalItem;

import java.util.List;

public class AddItemCommand implements Command {
    private PhysicalItem item;
    private LibraryManager libraryManager;


    public AddItemCommand(PhysicalItem item, LibraryManager libraryManager) {
        this.item = item;
        this.libraryManager = libraryManager;
    }

    @Override
    public void execute(List<PhysicalItem> items, String path, LibraryManager libraryManager) throws Exception {
        items.add(item);
    }
    public PhysicalItem getItem() {
        return item;
    }
}
