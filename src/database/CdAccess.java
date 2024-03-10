package database;
import java.io.File;
import java.io.FileWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import models.Items.*;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import models.Items.PhysicalItems.*;
import models.Items.PhysicalItems.PhysicalItem;


public class CdAccess {

    public ArrayList<PhysicalItem> items = new ArrayList<>();
    public String path;

    public void load(String path) throws Exception{
        CsvReader reader = new CsvReader(path);
        reader.readHeaders();

        while(reader.readRecord()){
            PhysicalItem item = new Cd(
                    reader.get("id"),
                    reader.get("name"),
                    reader.get("location"),
                    Boolean.valueOf(reader.get("can_purchase")),
                    Date.valueOf(reader.get("due_date")),
                    Double.valueOf(reader.get("dollar_amount"))
            );
            items.add(item);
        }
    }

    public void update(String path) throws Exception {
        try {
            CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
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

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
