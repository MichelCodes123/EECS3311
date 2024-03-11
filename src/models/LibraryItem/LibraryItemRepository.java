package models.LibraryItem;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LibraryItemRepository {
    private String csvFilePath;

    public LibraryItemRepository(String csvFilePath) {
        this.csvFilePath = csvFilePath;
    }
    public void addItem(LibraryItem item) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(csvFilePath, true))) {
            writer.println(item.getId() + "," + item.getName() + "," + item.getLocation()  + "," + item.isCanBePurchased());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
