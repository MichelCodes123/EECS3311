package Tests;

import database_access.FacultyMemberAccess;
import logic.LoginUtilities;
import models.Users.FacultyMember;
import org.junit.jupiter.api.Test;

import java.io.Console;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LoginUtilitiesTest {


    @Test
    void tooShort() {
        LoginUtilities.verifyRegistration("Visitor", "Jeff", "Cheese@gmail.com", "sho",
                (error) -> assertEquals(error, "Password length must be greater than 4"), () -> {});
    }

    @Test
    void noUpperCasePass(){
        LoginUtilities.verifyRegistration("Visitor", "Jeff", "Cheese@gmail.com", "pencilandpaper",
                (error) -> assertEquals("Password must contain at least one uppercase letter", error), () -> {});

    }
    @Test
    void nodigitPass(){
        LoginUtilities.verifyRegistration("Visitor", "Jeff", "Cheese@gmail.com", "Pencilandpaper",
                (error) -> assertEquals("Password must contain at least one digit", error), () -> {});

    }

    @Test
    void emptyFields(){
        LoginUtilities.verifyRegistration("Visitor", "", "Cheese@gmail.com", "Pencilandpaper",
                (error) -> assertEquals("Cannot have empty fields!", error), () -> {});
    }

    @Test
    void validateUser() throws Exception {
        FacultyMember prof = new FacultyMember("id0","Name", "location", "password",  true, 0.0, false, new ArrayList<>(), new ArrayList<>() );
        FacultyMember another_prof = new FacultyMember("id1","Name", "location", "password",  true, 0.0, true, new ArrayList<>(), new ArrayList<>() );

        FacultyMemberAccess profdb = FacultyMemberAccess.getInstance();
        profdb.users.add(prof);
        profdb.users.add(another_prof);
        profdb.update();
        profdb.load();
        assertEquals(2, profdb.users.size());


        LoginUtilities.validateUsers();

        assertEquals(2, profdb.users.size());
        assertEquals(true, profdb.users.get(0).getIs_registered());
        assertEquals(true, profdb.users.get(1).getIs_registered());

    }


}