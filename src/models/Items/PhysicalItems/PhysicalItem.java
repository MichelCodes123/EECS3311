package models.Items.PhysicalItems;

import models.Items.*;

import java.util.Date;

public abstract class PhysicalItem extends Item {

     String location = null;
     Boolean can_purchase = null;
     Long due_date = null;
     Double dollar_amount = null;

    public PhysicalItem(String id, String name, String location, Boolean can_purchase, Long due_date, Double dollar_amount) {
       super(id, name);
        this.location = location;
        this.can_purchase = can_purchase;
        this.due_date = due_date;
        this.dollar_amount = dollar_amount;
    }

    public String getLocation() {
        return location;
    }

    public Boolean getPurchasability() {
        return can_purchase;
    }

    public Long getDueDate() {
        return due_date;
    }

    public Double getDollarAmount() {
        return dollar_amount;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPurchasability(Boolean can_purchase) {
        this.can_purchase = can_purchase;
    }

    public void setDueDate(Date due_date) {
        this.due_date = due_date.getTime();
    }

    public void setDollarAmount(Double dollar_amount) {
        this.dollar_amount = dollar_amount;
    }


}
