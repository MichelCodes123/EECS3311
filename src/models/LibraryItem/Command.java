package models.LibraryItem;

import models.Items.PhysicalItems.PhysicalItem;

import java.util.List;
public interface Command {
    void execute(List<PhysicalItem> items, String path, LibraryManager libraryManager);
}
