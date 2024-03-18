package models.Users;

import models.Items.*;
import java.util.ArrayList;

public abstract class User {

    String id = null;
    String name = null;
    String email = null;
    String password = null;
    Boolean can_borrow = null;
    Double overdue_charge = null;
    Boolean is_registered = null;
    ArrayList<String> rented_item_list = null;
    ArrayList<String> subscribed_newsletters = new ArrayList<>();


    public User(String id, String name, String email, String password, Boolean can_borrow, Double overdue_charge, Boolean is_registered, ArrayList<String> rented_item_list, ArrayList<String> subscribed_newsletters) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.can_borrow = can_borrow;
        this.overdue_charge = overdue_charge;
        this.is_registered = is_registered;

        if (rented_item_list != null && !rented_item_list.isEmpty()) {
            this.rented_item_list = new ArrayList<>(rented_item_list);
        }
        else  {
            this.rented_item_list = new ArrayList<>();
        }
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getCan_borrow() {
        return can_borrow;
    }

    public Double getOverdue_charge() {
        return overdue_charge;
    }

    public Boolean getIs_registered() {
        return is_registered;
    }

    public ArrayList<String> getRented_item_list() {
        return new ArrayList<>(rented_item_list);
    }

    public void increaseOverdue_charge(Double price) {this.overdue_charge = overdue_charge + price;}

    public void setCan_borrow(Boolean bool) {this.can_borrow = bool;}

   public void add_item(String item_id) {this.rented_item_list.add(item_id);
    }

    public void add_subscription(String link) {this.subscribed_newsletters.add(link);}
    public void remove_subscription(String link) {this.subscribed_newsletters.remove(link);}
}
