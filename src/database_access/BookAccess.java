package database_access;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.PhysicalItem;
import models.Items.PhysicalItems.Textbook;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;



    public class BookAccess{

    private List<PhysicalItem> items = new ArrayList<>();
    private String path = "src/database/books.csv";

    // Singleton instance
    private static BookAccess instance;

    private BookAccess() {
    }

    public static BookAccess getInstance() {
        if (instance == null) {
            instance = new BookAccess();
        }
        return instance;
    }

    public void addItem(Book book) {
        items.add(book);
        saveToCsv();
    }

    public void enableItem(int itemId) {
        for (PhysicalItem item : items) {
            if (item.getId() == itemId) {
                item.setPurchasability(true);
                saveToCsv();
                return;
            }
        }
    }

    public void disableItem(int itemId) {
        for (PhysicalItem item : items) {
            if (item.getId() == itemId) {
                item.setPurchasability(false);
                saveToCsv();
                return;
            }
        }
    }

    public void removeItem(int itemId) {
        for (PhysicalItem item : items) {
            if (item.getId() == itemId){
                items.remove(item);
                saveToCsv();
                return;
            }
        }
    }

    public void updateItem(Book updatedBook) {
        for (PhysicalItem item : items) {
            if (item.getId() == updatedBook.getId()) {
                item.setLocation(updatedBook.getLocation());
                item.setPurchasability(updatedBook.getPurchasability());
                Date dueDate = new Date(updatedBook.getDueDate());
                item.setDueDate(dueDate);
                item.setDollarAmount(updatedBook.getDollarAmount());
                saveToCsv();
                return;
            }
        }
    }

    private void saveToCsv() {
        try {
            CsvWriter csvWriter = new CsvWriter(new FileWriter(path), ',');
            // Write header
            csvWriter.write("id");
            csvWriter.write("name");
            csvWriter.write("location");
            csvWriter.write("can_purchase");
            csvWriter.write("due_date");
            csvWriter.write("dollar_amount");
            csvWriter.endRecord();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            // Write items
            for (PhysicalItem item : items) {
                if (item instanceof Book) {
                    Book book = (Book) item;
                    csvWriter.write(String.valueOf(book.getId()));
                    csvWriter.write(book.getName());
                    csvWriter.write(book.getLocation());
                    csvWriter.write(String.valueOf(book.getPurchasability()));
                    String formattedDueDate = dateFormat.format(new Date(book.getDueDate()));
                    csvWriter.write(formattedDueDate);
                    csvWriter.write(String.valueOf(book.getDollarAmount()));
                    csvWriter.endRecord();
                }
            }

            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() throws Exception{
        CsvReader reader = new CsvReader(path);
        reader.readHeaders();

        while(reader.readRecord()){
            PhysicalItem item;

            if (reader.get("type").equals("Textbook")) {
                item = new Textbook(
                        Integer.parseInt(reader.get("id")),
                        reader.get("name"),
                        reader.get("location"),
                        Boolean.valueOf(reader.get("can_purchase")),
                        Long.valueOf(reader.get("due_date")),
                        Double.valueOf(reader.get("dollar_amount"))
                );
            }

            else {
                item = new Book(
                        Integer.parseInt(reader.get("id")),
                        reader.get("name"),
                        reader.get("location"),
                        Boolean.valueOf(reader.get("can_purchase")),
                        Long.valueOf(reader.get("due_date")),
                        Double.valueOf(reader.get("dollar_amount"))
                );
            }

            items.add(item);
        }
    }
}