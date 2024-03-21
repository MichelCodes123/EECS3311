package services;
import database_access.*;
import models.Items.PhysicalItems.PhysicalItem;
import models.Users.*;
import models.Items.*;

import java.util.ArrayList;
import java.util.Date;

public class OverdueService {



    public void reviewOverdueItems() throws Exception {
        QueryUtilities utils = new QueryUtilities();
        ArrayList<User> all_users = utils.allUsers();
        Date current_date = new Date();
        long miliPerDay = 24 * 60 * 60 * 1000;

        for (User user : all_users) {
            {
                int user_overdue_count = 0;
                ArrayList<PhysicalItem> user_items = utils.getUserAssociatedItems(user);
                for (PhysicalItem item : user_items) {
                    
                    if (item.getDueDate() < current_date.getTime()) {
                        int daysoverDue = (int) (current_date.getTime() - item.getDueDate())/ (int) miliPerDay;
                        applyOverdueFee(user, 0.5*daysoverDue);
                        user_overdue_count++;
                    }
                    if (user_overdue_count > 3) {
                        toggleBorrowBlocker(user, false);
                    }

                    if (current_date.getTime() > item.getDueDate() + (15*24*3600*1000) ) {
                        //TODO: remove item
                    }

                }
            }
        }
    }

    private void applyOverdueFee(User user, Double price) throws Exception {

        user.increaseOverdue_charge(price);
        if (user instanceof FacultyMember) {
            FacultyMemberAccess db = FacultyMemberAccess.getInstance();
            db.users.add((FacultyMember) user);
            db.update();
        }
        else if (user instanceof  Student) {
            StudentAccess db = StudentAccess.getInstance();
            db.users.add((Student) user);
            db.update();
        }
        else if (user instanceof NonFacultyStaff) {
            NonFacultyStaffAccess db = NonFacultyStaffAccess.getInstance();
            db.users.add((NonFacultyStaff) user);
            db.update();
        }

        else if (user instanceof  Visitor) {
            VisitorAccess db = VisitorAccess.getInstance();
            db.users.add((Visitor) user);
            db.update();
        }

    }

    private void toggleBorrowBlocker (User user, Boolean blocker) throws Exception {
        user.setCan_borrow(blocker);

        if (user instanceof FacultyMember) {
            FacultyMemberAccess db = FacultyMemberAccess.getInstance();
            db.users.add((FacultyMember) user);
            db.update();
        }
        else if (user instanceof  Student) {
            StudentAccess db = StudentAccess.getInstance();
            db.users.add((Student) user);
            db.update();
        }
        else if (user instanceof NonFacultyStaff) {
            NonFacultyStaffAccess db = NonFacultyStaffAccess.getInstance();
            db.users.add((NonFacultyStaff) user);
            db.update();
        }

        else if (user instanceof  Visitor) {
            VisitorAccess db = VisitorAccess.getInstance();
            db.users.add((Visitor) user);
            db.update();
        }
    }
}