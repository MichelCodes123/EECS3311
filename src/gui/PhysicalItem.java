package gui;

public class PhysicalItem {

private String id, name, location, can_purchase, dueDate, dollarAmount , canRent;

public PhysicalItem(String id, String name, String location, String can_purchase, String dueDate, String dollarAmount , String canRent){
    this.id = id;
    this.name = name;
    this.location = location;
    this.can_purchase = can_purchase;
    this.dueDate = dueDate;
    this.dollarAmount = dollarAmount;
    this.canRent = canRent;

}

    public String getId(){return id; }
    public void setId(String id){this.id = id;}

    public String getName(){return name; }
    public void setName(String name){this.name = name;}

public String getLocation(){return location; }
public void setLocation(String id){this.location = location;}


    public String getCan_Purchase(){return can_purchase; }
    public void setCan_purchase(String can_purchase){this.can_purchase = can_purchase;}

    public String getDueDate(){return dueDate; }
    public void setDueDate(String dueDate){this.dueDate= dueDate;}

    public String getDollarAmount(){return dollarAmount; }
    public void setDollarAmount(String dollarAmount){this.dollarAmount= dollarAmount;}

}
