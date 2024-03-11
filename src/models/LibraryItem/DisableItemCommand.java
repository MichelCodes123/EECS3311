package models.LibraryItem;

public class DisableItemCommand implements Command {
    private LibraryManager manager;

    public DisableItemCommand(LibraryManager manager) {
        this.manager = manager;
    }

    @Override
    public void execute(LibraryItem item) {
        manager.disableItem(item);
    }
}