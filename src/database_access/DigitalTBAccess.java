package database_access;
import java.io.FileWriter;
import java.util.ArrayList;

import models.Items.*;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import models.Items.DigitalTB.*;
import models.Items.PhysicalItems.Cd;


public class DigitalTBAccess {

    public ArrayList<Item> items = new ArrayList<>();
    public String path = "src/database/digital_tb.csv";

    private static DigitalTBAccess db_instance;
    public static DigitalTBAccess getInstance() {
        if (db_instance == null) {
            db_instance = new DigitalTBAccess();
        }
        return db_instance;
    }

    public void load() throws Exception{
        CsvReader reader = new CsvReader( path);
        reader.readHeaders();

        while(reader.readRecord()){
            Item item = new DigitalTB(
                    reader.get("id"),
                    reader.get("name")
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
