package models.LibraryItem;

public class RemoveItemCommand implements Command {
    private LibraryManager manager;

    public RemoveItemCommand(LibraryManager manager) {
        this.manager = manager;
    }
    @Override
    public void execute(LibraryItem item) {
        manager.removeItem(item);
    }
}
