package models.Items.PhysicalItems;

import java.util.Date;

public class Textbook extends Book {

    String id = null;
    String name = null;
    String location = null;
    Boolean can_purchase = null;
    Date due_date = null;
    Double dollar_amount = null;


    public Textbook(String id, String name, String location, Boolean can_purchase, Date due_date, Double dollar_amount) {
        super(id, name, location, can_purchase, due_date, dollar_amount);
    }

}
