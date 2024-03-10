package database_access;
import java.io.FileWriter;
import java.util.ArrayList;

import models.Items.*;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import models.Items.DigitalTB.*;


public class DigitalTBAccess {

    public ArrayList<Item> items = new ArrayList<>();
    public String path;
    public String path_prefix = "/database/";

    public void load(String path) throws Exception{
        CsvReader reader = new CsvReader(path_prefix + path);
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
            CsvWriter csvOutput = new CsvWriter(new FileWriter(path_prefix + path, false), ',');
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
