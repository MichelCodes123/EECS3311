package database_access;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

import logic.UserFactory;
import models.Items.PhysicalItems.Textbook;
import models.Users.*;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;


public class FacultyMemberAccess {

    public ArrayList<User> users = new ArrayList<>();
    public String path = "src/database/faculty.csv";

    private static FacultyMemberAccess db_instance;

    private FacultyMemberAccess() {

    }

    public static FacultyMemberAccess getInstance() {
        if (db_instance == null) {
            db_instance = new FacultyMemberAccess();
        }
        return db_instance;
    }

    public void load() throws Exception{
        users = new ArrayList<>();
        CsvReader reader = new CsvReader( path);
        reader.readHeaders();

        while(reader.readRecord()){
            UserFactory f = new UserFactory();
            User u = f.CreateUser("FacultyMember",
                    reader.get("id"),
                    reader.get("name"),
                    reader.get("email"),
                    reader.get("password"),
                    Boolean.valueOf(reader.get("can_borrow")),
                    Double.valueOf(reader.get("overdue_charge")),
                    Boolean.valueOf(reader.get("is_registered")),
                    new ArrayList<String>(Arrays.asList(reader.get("rented_item_list").split(" "))),
                    new ArrayList<String>(Arrays.asList(reader.get("newsletter_subscriptions").split(" ")))
            );
            ((FacultyMember) u).setPreviousTextbooksUsed(new ArrayList<String>(Arrays.asList(reader.get("textbooks_used").split(" "))));
            ((FacultyMember) u).setTeachingCourses(new ArrayList<String>(Arrays.asList(reader.get("courses").split(";"))));
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
            csvOutput.write("newsletter_subscriptions");
            csvOutput.write("textbooks_used");
            csvOutput.write("courses");
            csvOutput.endRecord();

            // else assume that the file already has the correct header line
            // write out a few records
            for (User u : users) {
                csvOutput.write(String.valueOf(u.getId()));
                csvOutput.write(u.getName());
                csvOutput.write(u.getEmail());
                csvOutput.write(u.getPassword());
                csvOutput.write(u.getCan_borrow().toString());
                csvOutput.write(u.getOverdue_charge().toString());
                csvOutput.write(u.getIs_registered().toString());

                StringBuilder builder = new StringBuilder();
                for (String item : u.getRented_item_list()) {
                    builder.append(item).append(" ");
                }
                String submit = builder.toString().trim();

                csvOutput.write(submit);

                builder = new StringBuilder();
                for (String item : u.getSubscribed_newsletters()) {
                    builder.append(item).append(" ");
                }
                submit = builder.toString().trim();

                csvOutput.write(submit);

                builder = new StringBuilder();
                for (String item : ((FacultyMember) u).getPreviousTextbooksUsed()) {
                    builder.append(item).append(" ");
                }
                submit = builder.toString().trim();

                csvOutput.write(submit);


                builder = new StringBuilder();
                for (String item : ((FacultyMember) u).getTeachingCourses()) {
                    builder.append(item).append(";");
                }

                csvOutput.write(builder.toString().trim());


                csvOutput.endRecord();
            }
            csvOutput.close();
            users = new ArrayList<>();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
