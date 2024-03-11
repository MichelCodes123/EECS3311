package models.LibraryItem;

public class EnableItemCommand implements Command {
    private LibraryManager manager;

    public EnableItemCommand(LibraryManager manager) {
        this.manager = manager;
    }

    @Override
    public void execute(LibraryItem item) {
        manager.enableItem(item);
    }
}
