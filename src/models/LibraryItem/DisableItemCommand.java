package models.LibraryItem;

import models.Items.PhysicalItems.PhysicalItem;

public class DisableItemCommand implements Command {
    private LibraryManager manager;
    private PhysicalItem item;

    public DisableItemCommand(LibraryManager manager) {
        this.manager = manager;
    }
    @Override
    public void execute(PhysicalItem item) {
        manager.disableItem(item);
    }
}