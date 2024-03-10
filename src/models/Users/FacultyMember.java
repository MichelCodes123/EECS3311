package models.Users;


import java.util.ArrayList;

import models.Course;
import models.Items.Item;
import models.Items.PhysicalItems.Book;

public class FacultyMember extends User {

	private ArrayList<Course> courses;
	private ArrayList<Book> previousTextbook;

	public FacultyMember(String id, String name, String email, String password, Boolean can_borrow,
			Double overdue_charge, Boolean is_registered, ArrayList<String> rented_item_list, ArrayList<Course> courses,
			ArrayList<Book> previousTextbook) {
		super(id, name, email, password, can_borrow, overdue_charge, is_registered, rented_item_list);

		this.courses = courses;
		this.previousTextbook = previousTextbook;

	}

}
