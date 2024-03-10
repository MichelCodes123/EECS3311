package models.Users;

import models.Items.Item;

import java.util.ArrayList;

public class Visitor implements User {
    String id = null;
    String name = null;
    String email = null;
    String password = null;
    Boolean can_borrow = null;
    Double overdue_charge = null;
    Boolean is_registered = null;
    ArrayList<Item> rented_item_list = null;

    public Visitor(String id, String name, String email, String password, Boolean can_borrow, Double overdue_charge, Boolean is_registered, ArrayList<Item> rented_item_list) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.can_borrow = can_borrow;
        this.overdue_charge = overdue_charge;
        this.is_registered = is_registered;
        this.rented_item_list = rented_item_list;
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

    public ArrayList<Item> getRented_item_list() {
        return rented_item_list;
    }
}
