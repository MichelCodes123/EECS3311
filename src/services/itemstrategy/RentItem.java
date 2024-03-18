package services.itemstrategy;

import database_access.*;
import models.Items.PhysicalItems.PhysicalItem;
import models.Users.*;

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

            if (user instanceof Student) {
                StudentAccess db = StudentAccess.getInstance();
                User desired_user = null;
                int i = 0;
                for (User student : db.users) {
                    if (Objects.equals(student.getId(), user.getId())) {
                        desired_user = student;
                        break;
                    }
                    i++;
                }
                db.users.set(i, desired_user);
                db.update();
            }

            else if (user instanceof FacultyMember) {
                FacultyMemberAccess db = FacultyMemberAccess.getInstance();
                User desired_user = null;
                int i = 0;
                for (User prof : db.users) {
                    if (Objects.equals(prof.getId(), user.getId())) {
                        desired_user = prof;
                        break;
                    }
                    i++;
                }
                db.users.set(i, desired_user);
                db.update();
            }

            else if (user instanceof Visitor) {
                VisitorAccess db = VisitorAccess.getInstance();
                User desired_user = null;
                int i = 0;
                for (User visit : db.users) {
                    if (Objects.equals(visit.getId(), user.getId())) {
                        desired_user = visit;
                        break;
                    }
                    i++;
                }
                db.users.set(i, desired_user);
                db.update();
            }

            else {
                NonFacultyStaffAccess db = NonFacultyStaffAccess.getInstance();
                User desired_user = null;
                int i = 0;
                for (User staff : db.users) {
                    if (Objects.equals(staff.getId(), user.getId())) {
                        desired_user = staff;
                        break;
                    }
                    i++;
                }
                db.users.set(i, desired_user);
                db.update();
            }


        }
        else {
            throw new Exception("Too many items!");
        }

    }
}
