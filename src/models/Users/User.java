package models.Users;
import java.util.ArrayList;

import models.Items.Item;

public abstract class User {

	String id = null;
	String name = null;
	String email = null;
	String password = null;
	Boolean can_borrow = null;
	Double overdue_charge = null;
	Boolean is_registered = null;
	ArrayList<String> rented_item_list = null;

	public User(String id, String name, String email, String password, Boolean can_borrow, Double overdue_charge,
			Boolean is_registered, ArrayList<String> rented_item_list) {

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
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPassword() {
		return this.password;
	}

	public Boolean getCan_borrow() {
		return this.can_borrow;
	}

	public Double getOverdue_charge() {
		return this.overdue_charge;
	}

	public Boolean getIs_registered() {
		return this.is_registered;
	}

	public ArrayList<String> getRented_item_list() {
		return this.rented_item_list;
	}


}
