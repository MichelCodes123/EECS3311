package models.Items.PhysicalItems;

import java.util.Date;

public class Book extends PhysicalItem {


    public Book(String id, String name, String location, Boolean can_purchase, Date due_date, Double dollar_amount) {
        super(id, name, location, can_purchase, due_date, dollar_amount);
    }
}
