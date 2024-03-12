package logic;

import java.util.function.Consumer;
import java.util.regex.Pattern;

public class LoginUtilities {

	/**
	 * Verifies that the user has entered a strong password.
	 * 
	 * @param
	 * @return
	 */
	public void verifyRegistration(String name, String email, String password, Consumer<String> errorHandler) {

		name.trim();
		email.trim();
		password.trim();
		if (name.length() == 0 || email.length() == 0 || password.length() == 0) {
			errorHandler.accept("Cannot have empty fields!");
			return;
		}

		if (name.length() < 5) {
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
		//Add new user to database.
	}

	/**
	 * Verifies that email entered is unique
	 * @param email
	 * @return
	 */
	public Boolean verifyUniqueEmail(String email) {
		//Update this when database logic is finished
		return false;
	}

	public String verifyStrongPass(String password){
		Pattern p;
		p = Pattern.compile("(?=.*[A-Z])");
		if (!p.matcher(password).matches()) {
			return "Password must contain at least one uppercase letter";
		}
		p = Pattern.compile("(?=.*[a-z])");
		if (!p.matcher(password).matches()) {
			return "Password must contain at least one lowercase letter";
		}
		p = Pattern.compile("(?=.*\\d)");
		if (!p.matcher(password).matches()) {
			return "Password must contain at least one digit";
		}

		return null;


	}

}
