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
        return rented_item_list;
    }
}
