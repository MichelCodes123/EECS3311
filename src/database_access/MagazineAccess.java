package database_access;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import models.Items.PhysicalItems.Magazine;
import models.Items.PhysicalItems.PhysicalItem;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MagazineAccess {
    public ArrayList<PhysicalItem> items = new ArrayList<>();
    public String path = "src/database/magazines.csv";

    private static MagazineAccess instance;

    private MagazineAccess() {
    }

    public static MagazineAccess getInstance() {
        if (db_instance == null) {
            db_instance = new MagazineAccess();
        }
        return db_instance;
    }

    public void addItem(Magazine magazine) {
        items.add(magazine);
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
            if (item.getId() == itemId) {
                items.remove(item);
                saveToCsv();
                return;
            }
        }
    }

    public void updateItem(Magazine updatedMagazine) {
        for (PhysicalItem item : items) {
            if (item.getId() == updatedMagazine.getId()) {
                item.setLocation(updatedMagazine.getLocation());
                item.setPurchasability(updatedMagazine.getPurchasability());
                long dueDateTimestamp = updatedMagazine.getDueDate();
                Date dueDate = new Date(dueDateTimestamp);
                item.setDueDate(dueDate);
                item.setDollarAmount(updatedMagazine.getDollarAmount());
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
                if (item instanceof Magazine) {
                    Magazine magazine = (Magazine) item;
                    csvWriter.write(String.valueOf(magazine.getId()));
                    csvWriter.write(magazine.getName());
                    csvWriter.write(magazine.getLocation());
                    csvWriter.write(String.valueOf(magazine.getPurchasability()));
                    Date dueDate = new Date(magazine.getDueDate());
                    String formattedDueDate = dateFormat.format(dueDate);
                    csvWriter.write(formattedDueDate);
                    csvWriter.write(String.valueOf(magazine.getDollarAmount()));
                    csvWriter.endRecord();
                }
            }

            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void load() throws Exception{
        CsvReader reader = new CsvReader( path);
        reader.readHeaders();

        while(reader.readRecord()){
            PhysicalItem item = new Magazine(
                    Integer.parseInt(reader.get("id")),
                    reader.get("name"),
                    reader.get("location"),
                    Boolean.valueOf(reader.get("can_purchase")),
                    Long.valueOf(reader.get("due_date")),
                    Double.valueOf(reader.get("dollar_amount"))
            );
            items.add(item);
        }
    }

    public void update() throws Exception {
        try {
            CsvWriter csvOutput = new CsvWriter(new FileWriter( path, false), ',');
            //name,id,email,password
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
                csvOutput.write(i.getId());
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
