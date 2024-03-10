package logic;

import java.util.ArrayList;

import models.Course;
import models.Items.Item;
import models.Items.PhysicalItems.Book;
import models.Users.FacultyMember;

public class FacultyMemberBuilder extends UserBuilder {
	private String name = null;
	private String email = null;
	private String password = null;
	private Boolean can_borrow = null;
	private Double overdue_charge = null;
	private Boolean is_registered = null;
	private ArrayList<String> rented_item_list = null;
	private ArrayList<Course> courses;
	private ArrayList<Book> previousTextbook;

	private String id = null;

	public void setId(String id) {
		this.id = id;
	}

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

	public void setRented_item_list(ArrayList<String> rented_item_list) {
		this.rented_item_list = rented_item_list;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public void previoustTextbooks(ArrayList<Book> previousTextbook) {
		this.previousTextbook = previousTextbook;
	}

	public FacultyMember getUser() {

		return new FacultyMember(id, name, email, password, can_borrow, overdue_charge, is_registered, rented_item_list);

	}

}
