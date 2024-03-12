package services.itemstrategy;

import database_access.QueryUtilities;
import models.Items.Item;
import models.Items.PhysicalItems.PhysicalItem;
import models.Users.User;

import java.util.Date;

public class RentItem implements ItemStrategy{

    public void execute(String item_id, String user_id) throws Exception {
        QueryUtilities utils = new QueryUtilities();
        User user = utils.getUser(user_id);
        if (user.getRented_item_list().size() < 10) {
            PhysicalItem item = (PhysicalItem) utils.getItem(item_id);
            item.setDueDate(new Date());
            user.getRented_item_list().add(item_id);
        }
        else {
            throw new Exception("Too many items!");
        }

    }
}
