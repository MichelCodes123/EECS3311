package models.LibraryItem;

import database_access.BookAccess;
import database_access.CdAccess;
import database_access.MagazineAccess;
import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.Cd;
import models.Items.PhysicalItems.Magazine;
import models.Items.PhysicalItems.PhysicalItem;
import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<PhysicalItem> items = new ArrayList<>();
    private String path;
    private BookAccess bookAccess;
    private MagazineAccess magazineAccess;
    private CdAccess cdAccess;


    public LibraryManager(String path) {
        this.path = path;
        this.bookAccess = BookAccess.getInstance();
        this.magazineAccess = MagazineAccess.getInstance();
        this.cdAccess = CdAccess.getInstance();
    }

    public List<PhysicalItem> getItems() {
        return items;
    }

    public void executeCommand(Command command) {
        command.execute(items, path, this);
        if (command instanceof AddItemCommand) {
            AddItemCommand addItemCommand = (AddItemCommand) command;
            PhysicalItem item = addItemCommand.getItem();
            if (item instanceof Book) {
                bookAccess.addItem((Book) item);
            } else if (item instanceof Magazine) {
                magazineAccess.addItem((Magazine) item);
            } else if (item instanceof Cd) {
                cdAccess.addItem((Cd) item);
            } else {
                throw new IllegalArgumentException("Invalid item type");
            }
        } else if (command instanceof EnableItemCommand) {
            EnableItemCommand enableItemCommand = (EnableItemCommand) command;
            String itemType = enableItemCommand.getItemType();
            int itemId = enableItemCommand.getItemId();
            switch (itemType) {
                case "Book":
                    bookAccess.enableItem(itemId);
                    break;
                case "Magazine":
                    magazineAccess.enableItem(itemId);
                    break;
                case "Cd":
                    cdAccess.enableItem(itemId);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid item type");
            }
        } else if (command instanceof DisableItemCommand) {
            DisableItemCommand disableItemCommand = (DisableItemCommand) command;
            String itemType = disableItemCommand.getItemType();
            int itemId = disableItemCommand.getItemId();
            switch (itemType) {
                case "Book":
                    bookAccess.disableItem(itemId);
                    break;
                case "Magazine":
                    magazineAccess.disableItem(itemId);
                    break;
                case "Cd":
                    cdAccess.disableItem(itemId);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid item type");
            }
        } else if (command instanceof RemoveItemCommand) {
            RemoveItemCommand removeItemCommand = (RemoveItemCommand) command;
            String itemType = removeItemCommand.getItemType();
            int itemId = removeItemCommand.getItemId();
            switch (itemType) {
                case "Book":
                    bookAccess.removeItem(itemId);
                    break;
                case "Magazine":
                    magazineAccess.removeItem(itemId);
                    break;
                case "Cd":
                    cdAccess.removeItem(itemId);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid item type");
            }
        } else if (command instanceof UpdateCommand) {
            UpdateCommand updateCommand = (UpdateCommand) command;
            PhysicalItem updatedItem = updateCommand.getUpdatedItem();
            // Update the item in the appropriate database access class
            if (updatedItem instanceof Book) {
                bookAccess.updateItem((Book) updatedItem);
            } else if (updatedItem instanceof Magazine) {
                magazineAccess.updateItem((Magazine) updatedItem);
            } else if (updatedItem instanceof Cd) {
                cdAccess.updateItem((Cd) updatedItem);
            } else {
                throw new IllegalArgumentException("Invalid item type");
            }
        }
    }
    public void addItem(PhysicalItem item) {
        executeCommand(new AddItemCommand(item, this));
    }

    public void enableItem(int itemId, String itemType) {
        executeCommand(new EnableItemCommand(itemId, itemType, this));
    }

    public void disableItem(int itemId, String itemType) {
        executeCommand(new DisableItemCommand(itemId, itemType, this));
    }

    public void removeItem(int itemId, String itemType) {
        executeCommand(new RemoveItemCommand(itemId, itemType, this));
    }

    public void updateItem(PhysicalItem updatedItem) {
        executeCommand(new UpdateCommand(updatedItem, this));
    }
}

