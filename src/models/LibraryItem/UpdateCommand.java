package models.LibraryItem;

import models.Items.PhysicalItems.PhysicalItem;

import java.util.List;
public class UpdateCommand implements Command{
    private PhysicalItem updatedItem;
    private LibraryManager libraryManager;

    public UpdateCommand(PhysicalItem updatedItem, LibraryManager libraryManager) {
        this.updatedItem = updatedItem;
        this.libraryManager = libraryManager;
    }

    @Override
    public void execute(List<PhysicalItem> items, String path, LibraryManager libraryManager) throws Exception {
        // Find the item to be updated and replace it with the updated item
        for (int i = 0; i < items.size(); i++) {
            PhysicalItem currentItem = items.get(i);
            if (currentItem.getId().equals(updatedItem.getId()) && currentItem.getName().equals(updatedItem.getName()) && currentItem.getLocation().equals(updatedItem.getLocation()) && currentItem.getPurchasability().equals(updatedItem.getPurchasability()) && currentItem.getDueDate().equals(updatedItem.getDueDate()) && currentItem.getDollarAmount().equals(updatedItem.getDollarAmount())) {
                items.set(i, updatedItem);
                break;
            }
        }

        // Update the item in the database
        libraryManager.updateItem(updatedItem);
    }

    public PhysicalItem getUpdatedItem() {
        return updatedItem;
    }
}
