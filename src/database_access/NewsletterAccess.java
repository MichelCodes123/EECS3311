package database_access;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import models.Items.Newsletter;
import java.io.FileWriter;
import java.util.ArrayList;

public class NewsletterAccess {

    public ArrayList<Newsletter> items = new ArrayList<>();
    public String path = "src/database/newsletter.csv";

    private static NewsletterAccess db_instance;

    private NewsletterAccess() {

    }

    public static NewsletterAccess getInstance() {
        if (db_instance == null) {
            db_instance = new NewsletterAccess();
        }
        return db_instance;
    }

    public void load() throws Exception{
        CsvReader reader = new CsvReader( path);
        reader.readHeaders();

        while(reader.readRecord()){
            Newsletter item = new Newsletter(
                    reader.get("id"),
                    reader.get("name"),
                    reader.get("link")
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
            csvOutput.write("link");
            csvOutput.endRecord();

            // else assume that the file already has the correct header line
            // write out a few records
            for (Newsletter i : items) {
                csvOutput.write(i.getId());
                csvOutput.write(i.getName());
                csvOutput.write(i.getLink());
                csvOutput.endRecord();
            }
            csvOutput.close();
            items = new ArrayList<>();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
