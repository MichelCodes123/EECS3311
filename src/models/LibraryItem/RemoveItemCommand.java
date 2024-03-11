package models.LibraryItem;

import models.Items.PhysicalItems.PhysicalItem;

public class RemoveItemCommand implements Command {
    private LibraryManager manager;

    public RemoveItemCommand(LibraryManager manager) {
        this.manager = manager;
    }
    @Override
    public void execute(PhysicalItem item) {
        manager.removeItem(item);
    }
}
