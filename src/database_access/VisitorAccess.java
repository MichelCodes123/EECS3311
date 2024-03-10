package database_access;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import logic.VisitorBuilder;
import models.Users.*;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;


public class VisitorAccess {

    public ArrayList<Visitor> users = new ArrayList<>();
    public String path = "/database/visitor_access.csv";

    public void load() throws Exception{
        CsvReader reader = new CsvReader( path);
        reader.readHeaders();

        while(reader.readRecord()){

            VisitorBuilder b = new VisitorBuilder();
            b.setId(reader.get("id"));
            b.setName(reader.get("name"));
            b.setEmail(reader.get("email"));
            b.setPassword(reader.get("password"));
            b.setCan_borrow(Boolean.valueOf(reader.get("can_borrow")));
            b.setOverdue_charge(Double.valueOf(reader.get("overdue_charge")));
            b.setIs_registered(Boolean.valueOf(reader.get("is_registered")));
            b.setRented_item_list(new ArrayList<String>(Arrays.asList(reader.get("rented_item_list").split(", "))));
            users.add( b.getUser());
        }
    }

    public void update() throws Exception {
        try {
            CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
            //name,id,email,password
            csvOutput.write("name");
            csvOutput.write("id");
            csvOutput.write("email");
            csvOutput.write("can_borrow");
            csvOutput.write("overdue_charge");
            csvOutput.write("rented_item_list");
            csvOutput.endRecord();

            // else assume that the file already has the correct header line
            // write out a few records
            for (Visitor u : users) {
                csvOutput.write(u.getName());
                csvOutput.write(String.valueOf(u.getId()));
                csvOutput.write(u.getEmail());
                csvOutput.write(u.getPassword());
                csvOutput.write(u.getCan_borrow().toString());
                csvOutput.write(u.getOverdue_charge().toString());
                csvOutput.write(u.getIs_registered().toString());
                csvOutput.write(u.getRented_item_list().stream().map(Object::toString).collect(Collectors.joining(", ")));
                csvOutput.endRecord();
            }
            csvOutput.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
