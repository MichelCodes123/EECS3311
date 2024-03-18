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

    public ArrayList<PhysicalItem> items = new ArrayList<>();
    public String path = "src/database/books.csv";
    private static BookAccess db_instance;

    private BookAccess() {

    }

    public static BookAccess getInstance() {
        if (db_instance == null) {
            db_instance = new BookAccess();
        }
        return db_instance;
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
        public void update() throws Exception {
            try {
                CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
                //name,id,email,password
                csvOutput.write("type");
                csvOutput.write("id");
                csvOutput.write("name");
                csvOutput.write("location");
                csvOutput.write("can_purchase");
                csvOutput.write("due_date");
                csvOutput.write("dollar_amount");
                csvOutput.endRecord();
            }
            csvOutput.close();
            items = new ArrayList<>();

                // else assume that the file already has the correct header line
                // write out a few records
                for (PhysicalItem i : items) {
                    csvOutput.write(i.getClass().toString());
                    csvOutput.write(String.valueOf(i.getId()));
                    csvOutput.write(i.getName());
                    csvOutput.write(i.getLocation());
                    csvOutput.write(i.getPurchasability().toString());
                    csvOutput.write(i.getDueDate().toString());
                    csvOutput.write(i.getDollarAmount().toString());
                    csvOutput.endRecord();
                }
                csvOutput.close();
                items = new ArrayList<>();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}