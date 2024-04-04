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
    public ArrayList<PhysicalItem> items = new ArrayList<>();
    private String path = "src/database/Cd.csv";

    private CdAccess() {
    }

    private static CdAccess db_instance;
    public static CdAccess getInstance() {
        if (db_instance == null) {
            db_instance = new CdAccess();
        }
        return db_instance;
    }

    public void addItem(Cd cd) throws Exception {
        if(cd == null) throw new Exception("Cd is null");
        items.add(cd);
        update();
        load();
    }

    public void enableItem(String itemId) throws Exception {
        for (PhysicalItem item : items) {
            if (Objects.equals(item.getId(), itemId)) {
                item.setPurchasability(true);
                update();
                load();
                return;
            }
        }
    }

    public void disableItem(String itemId) throws Exception {
        for (PhysicalItem item : items) {
            if (Objects.equals(item.getId(), itemId)) {
                item.setPurchasability(false);
                update();
                load();
                return;
            }
        }
    }

    public void removeItem(String itemId) throws Exception {
        if(itemId == null) throw new Exception("Item id is null");
        for (PhysicalItem item : items) {
            if (Objects.equals(item.getId(), String.valueOf(itemId))) {
                items.remove(item);
                update();
                load();
                return;
            }
        }
    }

    public void updateItem(Cd updatedCd) throws Exception {
        for (int i = 0; i < items.size(); i++) {
            PhysicalItem currentItem = items.get(i);
            if (Objects.equals(currentItem.getId(), updatedCd.getId())) {
                items.set(i, updatedCd);
                break;
            }
        }
        update();
        load();
    }


    public void load() throws Exception{
        CsvReader reader = new CsvReader( path);
        reader.readHeaders();

        while(reader.readRecord()){
            PhysicalItem item = new Cd(
                    reader.get("id"),
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

