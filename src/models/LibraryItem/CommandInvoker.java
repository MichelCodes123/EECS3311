package models.LibraryItem;

public class CommandInvoker {
    private Command command;
    
    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(LibraryItem item) {
        if (command != null) {
            command.execute(item);
        }
    }
}
