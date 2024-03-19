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
import java.util.Objects;


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

    public void addItem(Book book) throws Exception {
        items.add(book);
        update();
        load();
    }

    public void enableItem(String itemId) throws Exception {
        for (PhysicalItem item : items) {
            if (item.getId() == itemId) {
                item.setPurchasability(true);
                update();
                load();
                return;
            }
        }
    }

    public void disableItem(String itemId) throws Exception {
        for (PhysicalItem item : items) {
            if (item.getId() == itemId) {
                item.setPurchasability(false);
                update();
                load();
                return;
            }
        }
    }

    public void removeItem(String itemId) throws Exception {
        for (PhysicalItem item : items) {
            if (item.getId() == itemId){
                items.remove(item);
                update();
                load();
                return;
            }
        }
    }

    public void updateItem(Book updatedBook) throws Exception {
        for (int i = 0; i < items.size(); i++) {
            PhysicalItem currentItem = items.get(i);
            if (currentItem.getId() == updatedBook.getId()) {
                items.set(i, updatedBook);
                break;
            }
        }
        update();
        load();
    }


    public void load() throws Exception{
        CsvReader reader = new CsvReader(path);
        reader.readHeaders();

        while(reader.readRecord()){
            PhysicalItem item;

            if (reader.get("type").equals("Textbook")) {
                item = new Textbook(
                        reader.get("id"),
                        reader.get("name"),
                        reader.get("location"),
                        Boolean.valueOf(reader.get("can_purchase")),
                        Long.valueOf(reader.get("due_date")),
                        Double.valueOf(reader.get("dollar_amount"))
                );
            }

            else {
                item = new Book(
                        reader.get("id"),
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