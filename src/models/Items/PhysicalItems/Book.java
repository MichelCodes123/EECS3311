package models.Items.PhysicalItems;

import java.util.Date;

public class Book implements PhysicalItem {
    String id = null;
    String name = null;
    String location = null;
    Boolean can_purchase = null;
    Date due_date = null;
    Double dollar_amount = null;


    public Book(String id, String name, String location, Boolean can_purchase, Date due_date, Double dollar_amount) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.can_purchase = can_purchase;
        this.due_date = due_date;
        this.dollar_amount = dollar_amount;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public Boolean getPurchasability() {
        return can_purchase;
    }

    @Override
    public Date getDueDate() {
        return due_date;
    }

    @Override
    public Double getDollarAmount() {
        return dollar_amount;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void setPurchasability(Boolean can_purchase) {
        this.can_purchase = can_purchase;
    }

    @Override
    public void setDueDate(Date due_date) {
        this.due_date = due_date;
    }

    @Override
    public void setDollarAmount(Double dollar_amount) {
        this.dollar_amount = dollar_amount;
    }

}
