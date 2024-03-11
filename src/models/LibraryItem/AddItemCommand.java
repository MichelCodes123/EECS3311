package models.LibraryItem;

import java.util.List;

public class AddItemCommand implements Command {
    private LibraryManager manager;

    public AddItemCommand(LibraryManager manager) {
        this.manager = manager;
    }

    @Override
    public void execute(LibraryItem item) {
        manager.addItem(item);
    }
}
