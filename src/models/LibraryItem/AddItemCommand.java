package models.LibraryItem;

import models.Items.PhysicalItems.PhysicalItem;

import java.util.List;

public class AddItemCommand implements Command {
    private PhysicalItem item;
    private LibraryItemRepository repository;
    public AddItemCommand(PhysicalItem item, LibraryItemRepository repository) {
        this.item = item;
        this.repository = repository;
    }
    @Override
    public void execute(PhysicalItem item) {
        repository.addItem(item);
    }
}
