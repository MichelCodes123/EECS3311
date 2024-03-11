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

        for (User user : all_users) {
            {
                int user_overdue_count = 0;
                ArrayList<PhysicalItem> user_items = utils.getUserAssociatedItems(user);

                for (PhysicalItem item : user_items) {

                    if (item.getDueDate().getTime() < current_date.getTime()) {
                        applyOverdueFee(user, 0.5);
                        user_overdue_count++;
                    }
                    if (user_overdue_count > 3) {
                        toggleBorrowBlocker(user, false);
                    }

                    if (current_date.getTime() > item.getDueDate().getTime() + (15*24*3600*1000) ) {
                        //TODO: remove item
                    }

                }
            }
        }
    }

    private void applyOverdueFee(User user, Double price) {
        user.increaseOverdue_charge(price);
    }

    private void toggleBorrowBlocker (User user, Boolean blocker) {
        user.setCan_borrow(blocker);
    }
}