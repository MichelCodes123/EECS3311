package services.itemstrategy;

import database_access.QueryUtilities;
import database_access.StudentAccess;
import models.Items.PhysicalItems.PhysicalItem;
import models.Users.Student;
import models.Users.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class RentItem implements ItemStrategy{

    public void execute(String item_id, String user_id) throws Exception {
        QueryUtilities utils = new QueryUtilities();
        User user = utils.getUser(user_id);

        if (user.getRented_item_list().size() < 10) {

            PhysicalItem item = (PhysicalItem) utils.getPhysicalItem(item_id);
            item.setDueDate(new Date());
            user.add_item(item_id);
            StudentAccess db = StudentAccess.getInstance();
            Student desired_student = null;
            if (user instanceof Student) {
                int i = 0;
                for (Student student : db.users) {
                    if (Objects.equals(student.getId(), user.getId())) {
                        desired_student = student;
                        break;
                    }
                    i++;
                }
                db.users.set(i, desired_student);
            }
            db.update();


        }
        else {
            throw new Exception("Too many items!");
        }

    }
}
