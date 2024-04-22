package logic;

import java.util.ArrayList;

import database_access.FacultyMemberAccess;
import database_access.NonFacultyStaffAccess;
import database_access.StudentAccess;
import database_access.VisitorAccess;
import models.Course;
import models.Users.FacultyMember;
import models.Users.NonFacultyStaff;
import models.Users.Student;
import models.Users.User;
import models.Users.Visitor;

public class UserFactory {

	public User CreateUser(String type, String id, String name, String email, String password, Boolean can_borrow,
			Double overdue_charge, Boolean is_registered, ArrayList<String> rented_item_list,
			ArrayList<String> newsletters) {

		switch (type) {
		case "Visitor":
			VisitorAccess.getInstance().users.add(new Visitor(id, name, email, password, can_borrow, overdue_charge,
					is_registered, rented_item_list, newsletters));
			break;
		// return new Visitor(id, name, email, password, can_borrow, overdue_charge,
		// is_registered, rented_item_list);
		case "Student":
			Student student = new Student(id, name, email, password, can_borrow, overdue_charge,
					is_registered, rented_item_list, newsletters, new ArrayList<Course>(), new ArrayList<String>());
			StudentAccess.getInstance().users.add(student);
			return student;
		case "FacultyMember":
			FacultyMember prof = new FacultyMember(id, name, email, password, can_borrow,
					overdue_charge, is_registered, rented_item_list, newsletters);
			FacultyMemberAccess.getInstance().users.add(prof);
			return prof;
		case "NonFacultyStaff":
			NonFacultyStaffAccess.getInstance().users.add(new NonFacultyStaff(id, name, email, password, can_borrow,
					overdue_charge, is_registered, rented_item_list, newsletters));
			break;
		}
		return null;
	}
}
