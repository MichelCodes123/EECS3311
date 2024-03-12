package models.Items.PhysicalItems;

import java.util.Date;

public class Magazine extends PhysicalItem {

    public Magazine(String id, String name, String location, Boolean can_purchase, Long due_date, Double dollar_amount) {
        super(id, name, location, can_purchase, due_date, dollar_amount);
    }

}
