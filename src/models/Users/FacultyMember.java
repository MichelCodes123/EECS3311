package models.Users;


import java.util.ArrayList;
import java.util.List;

import models.Course;
import models.FacultyObserver.FacultyObserver;
import models.Items.Item;
import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.Textbook;

public class FacultyMember extends User implements FacultyObserver {
	private List<Course> teachingCourses;
    private List<Textbook> previousTextbooksUsed;
    private String lastNotification;

	public FacultyMember(String id, String name, String email, String password, Boolean can_borrow,
			Double overdue_charge, Boolean is_registered, ArrayList<String> rented_item_list) {
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
    public String getLastNotification() {
        return lastNotification;
    }

    public String update(Textbook textbook) {
    	 lastNotification = "Faculty Member Notification: New edition of textbook '" + textbook.getName() + "' is available.";
         return lastNotification;
    }
}
