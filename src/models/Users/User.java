package models.Users;

import models.Items.*;
import java.util.ArrayList;

public interface User {

    String id = null;
    String name = null;
    String email = null;
    String password = null;
    Boolean can_borrow = null;
    Double overdue_charge = null;
    Boolean is_registered = null;
    ArrayList<Item> rented_item_list = null;
}
