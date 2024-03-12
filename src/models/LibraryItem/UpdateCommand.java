package models.LibraryItem;

import models.Items.PhysicalItems.PhysicalItem;

import java.util.ArrayList;
import java.util.List;
public class UpdateCommand implements Command{
    @Override
    public void execute(List<PhysicalItem> items, String path, LibraryManager libraryManager) {
       libraryManager.updateLibrary(items, path);
    }
}
