package models.Users;

import models.Items.Item;

import java.util.ArrayList;

public class NonFacultyStaff extends User {


    public NonFacultyStaff(String id, String name, String email, String password, Boolean can_borrow, Double overdue_charge, Boolean is_registered, ArrayList<String> rented_item_list) {
        super(id, name, email, password, can_borrow, overdue_charge, is_registered, rented_item_list);
    }
}
