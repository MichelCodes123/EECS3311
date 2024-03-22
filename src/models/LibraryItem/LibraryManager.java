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
import java.util.Objects;

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

    public void executeCommand(Command command) throws Exception {
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
            String itemId = enableItemCommand.getItemId();
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
            String itemId = disableItemCommand.getItemId();
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
            String itemId = removeItemCommand.getItemId();
            switch (itemType) {
                case "Book" -> bookAccess.removeItem(itemId);
                case "Magazine" -> magazineAccess.removeItem(itemId);
                case "Cd" -> cdAccess.removeItem(itemId);
                default -> throw new IllegalArgumentException("Invalid item type");
            }
        } else if (command instanceof UpdateCommand updateCommand) {
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
    public void addItem(PhysicalItem item) throws Exception {
        items.add(item);
        executeCommand(new AddItemCommand(item, this));
    }

    public void enableItem(String itemId, String itemType) throws Exception {
        executeCommand(new EnableItemCommand(itemId, itemType, this));
        for (PhysicalItem item : items) {
            if (Objects.equals(item.getId(), itemId) && item.getClass().getSimpleName().equals(itemType)) {
                item.setPurchasability(true);
                break;
            }
        }
    }

    public void disableItem(String itemId, String itemType) throws Exception {
        for (PhysicalItem item : items) {
            if (Objects.equals(item.getId(), itemId) && item.getClass().getSimpleName().equals(itemType)) {
                item.setPurchasability(false);
                break;
            }
        }
        executeCommand(new DisableItemCommand(itemId, itemType, this));
    }

    public void removeItem(String itemId, String itemType) throws Exception {
        items.removeIf(item -> Objects.equals(item.getId(), itemId) && item.getClass().getSimpleName().equals(itemType));
        executeCommand(new RemoveItemCommand(itemId, itemType, this));
    }

    public void updateItem(PhysicalItem updatedItem) throws Exception {
        for (int i = 0; i < items.size(); i++) {
            PhysicalItem currentItem = items.get(i);
            if (Objects.equals(currentItem.getId(), updatedItem.getId())) {
                items.set(i, updatedItem);
                break;
            }
        }
        executeCommand(new UpdateCommand(updatedItem, this));
    }
}

