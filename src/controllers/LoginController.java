package controllers;

import database_access.QueryUtilities;
import models.Users.User;

public class LoginController {

    public static Boolean logIn(String email_address, String password) {
        QueryUtilities utils = new QueryUtilities();
        User user;

        try {
            user = utils.getUserByEmail(email_address);

            if (user == null || !user.getPassword().equals(password)) {
                return false;
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

        return true;
    }
}
