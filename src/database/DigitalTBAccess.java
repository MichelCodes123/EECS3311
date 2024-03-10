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
import models.Items.DigitalTB.*;
import models.Items.PhysicalItems.PhysicalItem;


public class DigitalTBAccess {

    public ArrayList<Item> items = new ArrayList<>();
    public String path;

    public void load(String path) throws Exception{
        CsvReader reader = new CsvReader(path);
        reader.readHeaders();

        while(reader.readRecord()){
            Item item = new DigitalTB(
                    reader.get("id"),
                    reader.get("name")
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
            csvOutput.endRecord();

            // else assume that the file already has the correct header line
            // write out a few records
            for (Item i : items) {
                csvOutput.write(i.getId());
                csvOutput.write(i.getName());
                csvOutput.endRecord();
            }
            csvOutput.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
