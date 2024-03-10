package logic;

import java.util.ArrayList;

import models.Items.Item;

public abstract class UserBuilder {

	public abstract void setId(String id);

	public abstract void setName(String name);

	public abstract void setEmail(String email);

	public abstract void setPassword(String password);

	public abstract void setCan_borrow(Boolean can_borrow);

	public abstract void setOverdue_charge(Double overdue_charge);

	public abstract void setIs_registered(Boolean is_registered);

	public abstract void setRented_item_list(ArrayList<String> rented_item_list);

}
