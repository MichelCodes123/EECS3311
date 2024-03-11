package models.Users;

import models.Items.Item;

import java.util.ArrayList;

public class Student extends User {
    public Student(String id, String name, String email, String password, Boolean can_borrow, Double overdue_charge, Boolean is_registered, ArrayList<String> rented_item_list) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.can_borrow = can_borrow;
        this.overdue_charge = overdue_charge;
        this.is_registered = is_registered;
        this.rented_item_list = rented_item_list;
    }
}
