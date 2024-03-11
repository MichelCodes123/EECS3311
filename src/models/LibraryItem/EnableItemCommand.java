package models.LibraryItem;

import models.Items.PhysicalItems.PhysicalItem;

public class EnableItemCommand implements Command {
    private LibraryManager manager;

    public EnableItemCommand(LibraryManager manager) {
        this.manager = manager;
    }

    @Override
    public void execute(PhysicalItem item) {
        manager.enableItem(item);
    }
}
