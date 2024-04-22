package logic;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.regex.Pattern;

import database_access.FacultyMemberAccess;
import database_access.NonFacultyStaffAccess;
import database_access.QueryUtilities;
import database_access.StudentAccess;
import database_access.VisitorAccess;
import models.LibraryManagementTeam.LibraryManagementTeam;
import models.Users.User;

public class LoginUtilities {

	static int id = 0;
	/**
	 * Verifies that the user has entered a strong password.
	 *
	 * @param
	 * @return
	 */
	public static void verifyRegistration(String type, String name, String email, String password, Consumer<String> errorHandler, Runnable success) {

		name.trim();
		email.trim();
		password.trim();
		if (name.length() == 0 || email.length() == 0 || password.length() == 0) {
			errorHandler.accept("Cannot have empty fields!");
			return;
		}
		if (password.length() < 5) {
			errorHandler.accept("Password length must be greater than 4");
			return;
		}
		String s = verifyStrongPass(password);
		if (s != null){
			errorHandler.accept(s);
			return;
		}

		if (!verifyUniqueEmail(email)) {
			errorHandler.accept("This email already exists");
			return;
		}

		if (type.equals("Student") || type.equals("FacultyMember") || type.equals("NonFacultyStaff")){
			LibraryManagementTeam.validate();
		}

		UserFactory f = new UserFactory();
		//Need to properly add ID's with Christinas Code
		f.CreateUser(type, Integer.toString(id++) , name, email, password, true, 0.0, true, null, null);


		if (type.equals("Student")){
			StudentAccess db = StudentAccess.getInstance();
			try {
				System.out.println(db.users);
				db.update();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

		else if (type.equals("FacultyMember")) {
			FacultyMemberAccess db = FacultyMemberAccess.getInstance();
			try {
				db.update();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

		else if (type.equals("NonFacultyStaff")) {
			NonFacultyStaffAccess db = NonFacultyStaffAccess.getInstance();
			try {
				db.update();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

		else {
			VisitorAccess db = VisitorAccess.getInstance();
			try {
				db.update();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}



		success.run();
	}

	/**
	 * Verifies that email entered is unique
	 * @param email
	 * @return True if email is unique, false otherwise
	 */
	public static Boolean verifyUniqueEmail(String email) {
		QueryUtilities q = new QueryUtilities();

		try{
			ArrayList<User> arr = q.allUsers();
			for (User u : arr){
				if (u.getEmail().equals(email)){
					return false;
				}
			}
			return true;
		}
		catch (Exception e){

		}
		return false;
	}

	public static String verifyStrongPass(String password){
		Pattern p;

		Boolean caps = false;
		boolean lower = false;
		boolean digit = false;

		for (int i = 0; i < password.length(); i++){
			char c = password.charAt(i);
			if (caps == false && Character.isUpperCase(c)){
				caps = true;
			}
			if (lower == false && Character.isLowerCase(c)){
				lower = true;
			}
			if (digit == false && Character.isDigit(c)){
				digit = true;
			}
		}
		if (!caps) {
			return "Password must contain at least one uppercase letter";
		}
		if (!lower) {
			return "Password must contain at least one lowercase letter";
		}
		if (!digit) {
			return "Password must contain at least one digit";
		}
		return null;


	}

}
