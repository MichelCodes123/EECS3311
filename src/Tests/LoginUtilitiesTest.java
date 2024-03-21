package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import logic.LoginUtilities;

class LoginUtilitiesTest {

	@Test
	void tooShort() {
		LoginUtilities.verifyRegistration("Visitor", "Jeff", "Cheese@gmail.com", "sho",
				(error) -> assertEquals(error, "Password length must be greater than 4"), () -> {
				});
	}

	@Test
	void noUpperCasePass() {
		LoginUtilities.verifyRegistration("Visitor", "Jeff", "Cheese@gmail.com", "pencilandpaper",
				(error) -> assertEquals("Password must contain at least one uppercase letter", error), () -> {
				});

	}

	@Test
	void nodigitPass() {
		LoginUtilities.verifyRegistration("Visitor", "Jeff", "Cheese@gmail.com", "Pencilandpaper",
				(error) -> assertEquals("Password must contain at least one digit", error), () -> {

				});

	}

	@Test
	void emptyFields() {
		LoginUtilities.verifyRegistration("Visitor", "", "Cheese@gmail.com", "Pencilandpaper",
				(error) -> assertEquals("Cannot have empty fields!", error), () -> {
				});
	}

}