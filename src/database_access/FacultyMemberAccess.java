package database_access;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import models.Users.*;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;


public class FacultyMemberAccess {

    public ArrayList<FacultyMember> users = new ArrayList<>();
    public String path = "src/database/faculty.csv";

    public void load() throws Exception{
        CsvReader reader = new CsvReader( path);
        reader.readHeaders();

        while(reader.readRecord()){
            FacultyMember user = new FacultyMember(
                    reader.get("id"),
                    reader.get("name"),
                    reader.get("email"),
                    reader.get("password"),
                    Boolean.valueOf(reader.get("can_borrow")),
                    Double.valueOf(reader.get("overdue_charge")),
                    Boolean.valueOf(reader.get("is_registered")),
                    new ArrayList<String>(Arrays.asList(reader.get("rented_item_list").split(", ")))
                    );
            users.add(user);
        }
    }

    public void update() throws Exception {
        try {
            CsvWriter csvOutput = new CsvWriter(new FileWriter( path, false), ',');
            //name,id,email,password
            csvOutput.write("id");
            csvOutput.write("name");
            csvOutput.write("email");
            csvOutput.write("password");
            csvOutput.write("can_borrow");
            csvOutput.write("overdue_charge");
            csvOutput.write("is_registered");
            csvOutput.write("rented_item_list");
            csvOutput.endRecord();

            // else assume that the file already has the correct header line
            // write out a few records
            for (FacultyMember u : users) {
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