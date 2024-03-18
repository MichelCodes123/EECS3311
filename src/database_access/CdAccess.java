package database_access;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import models.Items.PhysicalItems.Cd;
import models.Items.PhysicalItems.PhysicalItem;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class CdAccess {
    private List<PhysicalItem> items = new ArrayList<>();
    private String path = "src/database/Cd.csv";

    // Singleton instance
    private static CdAccess instance;

    private CdAccess() {
    }

    public static CdAccess getInstance() {
        if (instance == null) {
            instance = new CdAccess();
        }
        return instance;
    }

    public void addItem(Cd cd) {
        items.add(cd);
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
            if (Objects.equals(item.getId(), String.valueOf(itemId))) {
                items.remove(item);
                saveToCsv();
                return;
            }
        }
    }

    public void updateItem(Cd updatedCd) {
        for (PhysicalItem item : items) {
            if (Objects.equals(item.getId(), updatedCd.getId())) {
                item.setLocation(updatedCd.getLocation());
                item.setPurchasability(updatedCd.getPurchasability());
                long dueDateTimestamp = updatedCd.getDueDate();
                Date dueDate = new Date(dueDateTimestamp);
                item.setDueDate(dueDate);
                item.setDollarAmount(updatedCd.getDollarAmount());
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
                if (item instanceof Cd) {
                    Cd cd = (Cd) item;
                    csvWriter.write(String.valueOf(cd.getId()));
                    csvWriter.write(cd.getName());
                    csvWriter.write(cd.getLocation());
                    csvWriter.write(String.valueOf(cd.getPurchasability()));
                    Date dueDate = new Date(cd.getDueDate());
                    String formattedDueDate = dateFormat.format(dueDate);
                    csvWriter.write(formattedDueDate);
                    csvWriter.write(String.valueOf(cd.getDollarAmount()));
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
            PhysicalItem item = new Cd(
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

}

