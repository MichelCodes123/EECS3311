package logic;

import database_access.QueryUtilities;
import models.Users.User;

import javax.management.Query;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.regex.Pattern;

public class LoginUtilities {

	/**
	 * Verifies that the user has entered a strong password.
	 * 
	 * @param
	 * @return
	 */
	public static void verifyRegistration(String type, String name, String email, String password, Consumer<String> errorHandler) {

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
			//Further validation?? By Req 1, bit ambiguous
		}

		UserFactory f = new UserFactory();
		//Need to properly add ID's with Christinas Code
		User newUser = f.CreateUser(type, "5", name, email, password, true, 0.0, true, null);
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
				if (u.getEmail() == email){
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
