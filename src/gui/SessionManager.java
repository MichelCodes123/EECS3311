package gui;

import models.Users.Student;
import models.Users.User;

public class SessionManager {
    private static Student currentUser;

    public static void login(Student user) {
        currentUser = user;
    }

    public static void logout() {
        currentUser = null;
    }

    public static Student getCurrentUser() {
        return currentUser;
    }

 
}
