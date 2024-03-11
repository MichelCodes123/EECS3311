package models.LibraryItem;

import models.Items.PhysicalItems.PhysicalItem;

public class CommandInvoker {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand(PhysicalItem item) {
        if (command != null) {
            command.execute(item);
        }
    }
}
