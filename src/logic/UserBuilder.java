package logic;

import java.util.ArrayList;

import models.Items.Item;

public class UserBuilder {

	private String id = null;
	private String name = null;
	private String email = null;
	private String password = null;
	private Boolean can_borrow = null;
	private Double overdue_charge = null;
	private Boolean is_registered = null;
	private ArrayList<Item> rented_item_list = null;

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setCan_borrow(Boolean can_borrow) {
		this.can_borrow = can_borrow;
	}

	public void setOverdue_charge(Double overdue_charge) {
		this.overdue_charge = overdue_charge;
	}

	public void setIs_registered(Boolean is_registered) {
		this.is_registered = is_registered;
	}

	void setRented_item_list(ArrayList<Item> rented_item_list) {
		this.rented_item_list = rented_item_list;
	}

	public void setId(String id) {
		this.id = id;
	}

}
