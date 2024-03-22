package models.Users;

import java.util.ArrayList;

import logic.DigitalTBUtilities;
import models.Course;

public class Student extends User {

	private ArrayList<String> digital_textbooks;
	private ArrayList<Course> courses;

	public Student(String id, String name, String email, String password, Boolean can_borrow, Double overdue_charge,
			Boolean is_registered, ArrayList<String> rented_item_list, ArrayList<String> subscribed_newsletters,
			ArrayList<Course> courses, ArrayList<String> digital_textbooks) {
		super(id, name, email, password, can_borrow, overdue_charge, is_registered, rented_item_list,
				subscribed_newsletters);
		this.courses = courses;
		this.digital_textbooks = digital_textbooks;
	}


	public ArrayList<String> getDigital_textbooks() {
		return digital_textbooks;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setDigital_textbooks(ArrayList<String> digital_textbooks) {
		this.digital_textbooks = digital_textbooks;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
		DigitalTBUtilities.addAllDigitalTB(this);
	}

	public Boolean removeCourse(Course c) {
		if (courses.remove(c)) {
			DigitalTBUtilities.removeDigitalTB(c, digital_textbooks);
			return true;
		} else {
			return false;
		}
	}

	public void addDigitalTB(String b) {
		this.digital_textbooks.add(b);
	}

}
