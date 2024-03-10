package logic;

import java.util.ArrayList;

import models.Course;
import models.Items.Item;
import models.Items.DigitalTB.DigitalTB;
import models.Users.Student;

public class StudentBuilder extends UserBuilder {

	private String id = null;
	private String name = null;
	private String email = null;
	private String password = null;
	private Boolean can_borrow = null;
	private Double overdue_charge = null;
	private Boolean is_registered = null;
	private ArrayList<String> rented_item_list = null;
	private ArrayList<Course> courses = null;
	private ArrayList<DigitalTB> course_textbooks = null;

	@Override
	public void setId(String id) {
		this.id = id;

	}

	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public void setEmail(String email) {
		this.email = email;

	}

	@Override
	public void setPassword(String password) {
		this.password = password;

	}

	@Override
	public void setCan_borrow(Boolean can_borrow) {
		this.can_borrow = can_borrow;

	}

	@Override
	public void setOverdue_charge(Double overdue_charge) {
		this.overdue_charge = overdue_charge;

	}

	@Override
	public void setIs_registered(Boolean is_registered) {
		this.is_registered = is_registered;

	}

	@Override
	public void setRented_item_list(ArrayList<String> rented_item_list) {
		this.rented_item_list = rented_item_list;

	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public void setCourse_textbooks(ArrayList<DigitalTB> course_textbooks) {
		this.course_textbooks = course_textbooks;
	}

	public Student getUser() {

		return new Student(id, name, email, password, can_borrow, overdue_charge, is_registered, rented_item_list);

	}

}
