package logic;

import database_access.FacultyMemberAccess;
import database_access.NonFacultyStaffAccess;
import database_access.StudentAccess;
import database_access.VisitorAccess;
import models.Users.*;

import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;

public class UserFactory {


    public User CreateUser(String type, String id, String name, String email, String password, Boolean can_borrow, Double overdue_charge,
                           Boolean is_registered, ArrayList<String> rented_item_list) {

        switch (type) {
            case "Visitor":
                VisitorAccess.getInstance().users.add(new Visitor(id, name, email, password, can_borrow, overdue_charge, is_registered, rented_item_list));
                break;
                //return new Visitor(id, name, email, password, can_borrow, overdue_charge, is_registered, rented_item_list);
            case "Student":
                StudentAccess.getInstance().users.add(new Student(id, name, email, password, can_borrow, overdue_charge, is_registered, rented_item_list));
                break;
            case "FacultyMember":
                FacultyMemberAccess.getInstance().users.add(new FacultyMember(id, name, email, password, can_borrow, overdue_charge, is_registered, rented_item_list));
                break;
            case "NonFacultyStaff":
                NonFacultyStaffAccess.getInstance().users.add(new NonFacultyStaff(id, name, email, password, can_borrow, overdue_charge, is_registered, rented_item_list));
                break;
        }
        return null;
    }
}
