package models.Items.PhysicalItems;

import models.Items.Item;

import java.util.Date;

public class PhysicalItem implements Item {

    private String location;
    private Boolean can_purchase;
    protected Date due_date;
    protected Double dollar_amount;


    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    public String getLocation() {
        return location;
    }

    public Boolean getPurchaseability() {
        return can_purchase;
    }

    public Date getDue_date() {
        return due_date;
    }

    public Double getDollar_amount() {
        return dollar_amount;
    }

}
