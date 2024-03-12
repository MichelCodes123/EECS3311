package logic;

import java.util.function.Consumer;
import java.util.regex.Pattern;

public class LoginUtilities {

	/**
	 * Verifies that the user has entered a strong password.
	 * 
	 * @param s
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

		if (name.length() < 4) {
			errorHandler.accept("Password length must be greater than 4");
			return;
		}

		Pattern p = Pattern.compile("?=.*[A-Z]");
		if (!p.matcher(password).matches()) {
			errorHandler.accept("Password must contain at least one uppercase letter");
			return;
		}

		if (!verifyUniqueEmail(email)) {
			errorHandler.accept("This email already exists");
		}

	}

	public Boolean verifyUniqueEmail(String email) {

		return false;
	}

}
