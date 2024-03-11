package models.LibraryItem;

import java.util.List;

public class AddItemCommand implements Command {
    private LibraryItem item;
    private LibraryItemRepository repository;
    public AddItemCommand(LibraryItem item, LibraryItemRepository repository) {
        this.item = item;
        this.repository = repository;
    }
    @Override
    public void execute(LibraryItem item) {
        repository.addItem(item);
    }
}
