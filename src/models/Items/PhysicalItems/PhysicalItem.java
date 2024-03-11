package models.Items.PhysicalItems;

import models.Items.Item;

import java.util.Date;

public class PhysicalItem implements Item {

    private String location;
    private Boolean can_purchase;
    protected Date due_date;
    protected Double dollar_amount;
    private int id;


    @Override
    public String getId() {
        return "";
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

    public void setCan_purchase(boolean can_purchase){
        this.can_purchase = can_purchase;
    }

}
