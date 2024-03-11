package models.Items.PhysicalItems;

import models.Items.*;

import java.util.Date;

public interface PhysicalItem extends Item {

     String location = null;
     Boolean can_purchase = null;
     Date due_date = null;
     Double dollar_amount = null;

    public String getLocation();
    public Boolean getPurchasability();
    public Date getDueDate();
    public Double getDollarAmount();

    public void setLocation(String location);
    public void setPurchasability(Boolean can_purchase);
    public void setDueDate(Date due_date);
    public void setDollarAmount(Double dollar_amount);

}
