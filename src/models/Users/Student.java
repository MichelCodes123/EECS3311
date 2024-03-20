package models.Users;

import java.util.ArrayList;

import logic.DigitalTBUtilities;
import models.Course;
import models.Items.DigitalTB.DigitalTB;

public class Student extends User {

	private ArrayList<DigitalTB> digital_textbooks;
	private ArrayList<Course> courses;

	public Student(String id, String name, String email, String password, Boolean can_borrow, Double overdue_charge,
			Boolean is_registered, ArrayList<String> rented_item_list, ArrayList<String> subscribed_newsletters,
			ArrayList<Course> courses) {
		super(id, name, email, password, can_borrow, overdue_charge, is_registered, rented_item_list,
				subscribed_newsletters);
		this.courses = courses;
	}

	public ArrayList<DigitalTB> getDigital_textbooks() {
		return digital_textbooks;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setDigital_textbooks(ArrayList<DigitalTB> digital_textbooks) {
		this.digital_textbooks = digital_textbooks;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public Boolean removeCourse(Course C) {

		if (courses.remove(C)) {
			DigitalTBUtilities.removeDigitalTB(name, digital_textbooks);
			return true;
		} else {
			return false;
		}
	}

	public void addDigitalTB(DigitalTB b) {
		this.digital_textbooks.add(b);
	}

}
