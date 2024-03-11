package models.LibraryItem;

import models.Items.PhysicalItems.PhysicalItem;

public interface Command {
    void execute(PhysicalItem item);
}
