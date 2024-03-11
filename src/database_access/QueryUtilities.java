package database_access;
import models.Users.*;

import java.util.ArrayList;

public class QueryUtilities {

    //REFACTOR UTILS
    FacultyMemberAccess faculty_members = new FacultyMemberAccess();
    NonFacultyStaffAccess non_faculty_staff = new NonFacultyStaffAccess();
    StudentAccess students = new StudentAccess();
    VisitorAccess visitors = new VisitorAccess();


    public ArrayList<User> allUsers() throws Exception {
        ArrayList<User> userlist = new ArrayList<>();
        loadUsers();

        userlist.addAll(visitors.users);
        userlist.addAll(students.users);
        userlist.addAll(non_faculty_staff.users);
        userlist.addAll(faculty_members.users);

        return userlist;
    }


    private void loadUsers () throws Exception{
        visitors.load();
        students.load();
        non_faculty_staff.load();
        faculty_members.load();
    }
}
