package models.LibraryItem;

import models.Items.PhysicalItems.PhysicalItem;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<PhysicalItem> items = new ArrayList<>();
    private String path;

    public LibraryManager(String path) {
        this.path = path;
    }
    public void executeCommand(Command command) {
        command.execute(items, path, this);
    }

    public List<String> getLibraryState() {
        List<String> libraryState = new ArrayList<>();
        for (PhysicalItem item : items) {
            libraryState.add(item.toString());
        }
        return libraryState;
    }

    public void updateLibrary(List<PhysicalItem> items, String path) {
        try {
            FileWriter csvOutput = new FileWriter(path, false);
            csvOutput.write("id,name,location,purchasable,due_date,dollar_amount\n");

            for (PhysicalItem item : items) {
                csvOutput.write(String.valueOf(item.getId()));
                csvOutput.write(",");
                csvOutput.write(item.getName());
                csvOutput.write(",");
                csvOutput.write(item.getLocation());
                csvOutput.write(",");
                csvOutput.write(String.valueOf(item.getPurchasability()));
                csvOutput.write(",");
                csvOutput.write(String.valueOf(item.getDueDate()));
                csvOutput.write(",");
                csvOutput.write(String.valueOf(item.getDollarAmount()));
                csvOutput.write("\n");
            }

            csvOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
