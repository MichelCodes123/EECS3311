package models.Users;

import java.util.ArrayList;
import java.util.List;

import Prompts.SystemPrompts;
import models.Course;
import models.Items.PhysicalItems.Textbook;
import models.TextbookObserver.TextbookObserver;

public class FacultyMember extends User implements TextbookObserver {
	private List<String> teachingCourses;
	private List<String> previousTextbooksUsed;
	private String lastNotification;

	public FacultyMember(String id, String name, String email, String password, Boolean can_borrow,
			Double overdue_charge, Boolean is_registered, ArrayList<String> rented_item_list,
			ArrayList<String> subscribed_newsletters) {
		super(id, name, email, password, can_borrow, overdue_charge, is_registered, rented_item_list,
				subscribed_newsletters);
		this.teachingCourses = new ArrayList<>();
		this.previousTextbooksUsed = new ArrayList<>();

	}

	public void setTeachingCourses(List<String> teachingCourses) {
		this.teachingCourses = teachingCourses;
	}

	public void setPreviousTextbooksUsed(List<String> previousTextbooksUsed) {
		this.previousTextbooksUsed = previousTextbooksUsed;
	}

	public List<String> getTeachingCourses() {
		return teachingCourses;
	}

	public void addCourse(String course) {
		teachingCourses.add(course);
	}

	public List<String> getPreviousTextbooksUsed() {
		return previousTextbooksUsed;
	}

	public void addTextbookUsed(String textbook) {
		previousTextbooksUsed.add(textbook);
	}

	public String update(SystemPrompts prompt) {
		lastNotification = "Faculty Member Notification: " + prompt.getMessage();
		return lastNotification;
	}

	public String getLastNotification() {
		return lastNotification;
	}
}
