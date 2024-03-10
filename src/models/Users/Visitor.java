package models.Users;


import java.util.ArrayList;

import models.Items.Item;

public class Visitor extends User {
	public Visitor(String id, String name, String email, String password, Boolean can_borrow, Double overdue_charge,
			Boolean is_registered, ArrayList<String> rented_item_list) {
		super(id, name, email, password, is_registered, overdue_charge, is_registered, rented_item_list);
	}

}
