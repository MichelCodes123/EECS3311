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

    public User(String id, String name, String email, String password, Boolean can_borrow, Double overdue_charge, Boolean is_registered, ArrayList<String> rented_item_list) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.can_borrow = can_borrow;
        this.overdue_charge = overdue_charge;
        this.is_registered = is_registered;
        this.rented_item_list = new ArrayList<>();
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
        if (rented_item_list != null) {
            return new ArrayList<>(rented_item_list);
        }
        else {
            return new ArrayList<>();
        }

    }

    public void increaseOverdue_charge(Double price) {this.overdue_charge = overdue_charge + price;}

    public void setCan_borrow(Boolean bool) {this.can_borrow = bool;}

   public void setRented_item_list(ArrayList<String> list) {this.rented_item_list = new ArrayList<>(list);}
}
