package models.Users;

import models.Items.Item;

import java.util.ArrayList;
import java.util.List;


import Prompts.SystemPrompts;
import models.Course;
import models.Items.PhysicalItems.Textbook;
import models.TextbookObserver.TextbookObserver;

public class FacultyMember extends User implements TextbookObserver {
	private List<Course> teachingCourses;
    private List<Textbook> previousTextbooksUsed;
	private String lastNotification;


	public FacultyMember(String id, String name, String email, String password, Boolean can_borrow, Double overdue_charge, Boolean is_registered, ArrayList<String> rented_item_list) {
		super(id, name, email, password, can_borrow, overdue_charge, is_registered, rented_item_list);
		this.teachingCourses = new ArrayList<>();
        this.previousTextbooksUsed = new ArrayList<>();

	}
	public List<Course> getTeachingCourses() {
        return teachingCourses;
    }
    public void addCourse(Course course) {
        teachingCourses.add(course);
    }

    public List<Textbook> getPreviousTextbooksUsed() {
        return previousTextbooksUsed;
    }
    public void addTextbookUsed(Textbook textbook) {
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
