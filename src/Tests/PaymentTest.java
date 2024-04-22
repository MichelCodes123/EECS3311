package Tests;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import database_access.FacultyMemberAccess;
import database_access.NonFacultyStaffAccess;
import database_access.StudentAccess;
import database_access.VisitorAccess;
import models.Users.FacultyMember;
import models.Users.NonFacultyStaff;
import models.Users.Student;
import models.Users.Visitor;
import services.Payments.PaymentService;

public class PaymentTest {

    @Test
    void testPayment() throws Exception {
        PaymentService service = new PaymentService();


        FacultyMember prof = new FacultyMember("id","Name", "location", "password",  true, 1.0, true, new ArrayList<>(), new ArrayList<>() );
        FacultyMemberAccess userdb = FacultyMemberAccess.getInstance();
        userdb.users.add(prof);
        userdb.update();

        service.overduePay(1.0, "Credit", prof);
        assertEquals(0.0, prof.getOverdue_charge());

        userdb.load();
        userdb.users.set(0, prof);
        userdb.update();
        userdb.load();
        assertEquals(0.0, userdb.users.get(0).getOverdue_charge());

        userdb.users = new ArrayList<>();
        userdb.update();
    }

    @Test
    void testPaymentVisitor() throws Exception {
        PaymentService service = new PaymentService();


        Visitor visitor = new Visitor("id","Name", "location", "password",  true, 1.0, true, new ArrayList<>(), new ArrayList<>() );
        VisitorAccess userdb = VisitorAccess.getInstance();
        userdb.users.add(visitor);
        userdb.update();

        service.overduePay(1.0, "Credit", visitor);
        assertEquals(0.0, visitor.getOverdue_charge());

        userdb.load();
        userdb.users.set(0, visitor);
        userdb.update();
        userdb.load();
        assertEquals(0.0, userdb.users.get(0).getOverdue_charge());

        userdb.users = new ArrayList<>();
        userdb.update();
    }

    @Test
    void testPaymentStaff() throws Exception {
        PaymentService service = new PaymentService();


        NonFacultyStaff staff = new NonFacultyStaff("id","Name", "location", "password",  true, 1.0, true, new ArrayList<>(), new ArrayList<>() );
        NonFacultyStaffAccess userdb = NonFacultyStaffAccess.getInstance();
        userdb.users.add(staff);
        userdb.update();

        service.overduePay(1.0, "Credit", staff);
        assertEquals(0.0, staff.getOverdue_charge());

        userdb.load();
        userdb.users.set(0, staff);
        userdb.update();
        userdb.load();
        assertEquals(0.0, userdb.users.get(0).getOverdue_charge());

        userdb.users = new ArrayList<>();
        userdb.update();
    }

    @Test
    void testPaymentStudent() throws Exception {
        PaymentService service = new PaymentService();


        Student student = new Student("id","Name", "location", "password",  true, 1.0, true, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>() );
        StudentAccess userdb = StudentAccess.getInstance();
        userdb.users.add(student);
        userdb.update();

        service.overduePay(1.0, "Credit", student);
        assertEquals(0.0, student.getOverdue_charge());

        userdb.load();
        userdb.users.set(0, student);
        userdb.update();
        userdb.load();
        assertEquals(0.0, userdb.users.get(0).getOverdue_charge());

        userdb.users = new ArrayList<>();
        userdb.update();
    }

    @Test
    void discountPay() throws Exception {
        PaymentService service = new PaymentService();
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream old_output = System.out;
        System.setOut(new PrintStream(output));

        FacultyMember prof = new FacultyMember("id","Name", "location", "password",  true, 1.0, true, new ArrayList<>(), new ArrayList<>() );
        FacultyMemberAccess userdb = FacultyMemberAccess.getInstance();
        userdb.users.add(prof);
        userdb.update();

        service.discountPay(prof.getName(), 1.0, "Credit");
        assertEquals("Youve paid", output.toString());

        userdb.users = new ArrayList<>();
        userdb.update();
        System.setOut(old_output);
    }

    @Test
    void discountPayVisitor() throws Exception {
        PaymentService service = new PaymentService();
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream old_output = System.out;
        System.setOut(new PrintStream(output));

        Visitor visitor = new Visitor("id","Name", "location", "password",  true, 1.0, true, new ArrayList<>(), new ArrayList<>() );
        VisitorAccess userdb = VisitorAccess.getInstance();
        userdb.users.add(visitor);
        userdb.update();

        service.discountPay(visitor.getName(), 1.0, "Credit");
        assertEquals("Youve paid", output.toString());
        userdb.users = new ArrayList<>();
        userdb.update();
        System.setOut(old_output);
        
    }


    @Test
    void discountPayStaff() throws Exception {
        PaymentService service = new PaymentService();
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream old_output = System.out;
        System.setOut(new PrintStream(output));

        NonFacultyStaff staff = new NonFacultyStaff("id","Name", "location", "password",  true, 1.0, true, new ArrayList<>(), new ArrayList<>() );
        NonFacultyStaffAccess userdb = NonFacultyStaffAccess.getInstance();
        userdb.users.add(staff);
        userdb.update();

        service.discountPay(staff.getName(), 1.0, "Credit");
        assertEquals("Youve paid", output.toString());
        userdb.users = new ArrayList<>();
        userdb.update();
        System.setOut(old_output);
    }

    @Test
    void pOptionCredit() {
        PaymentService service = new PaymentService();

        assertDoesNotThrow(() ->  service.pOption("Credit", 2.0));
    }

    @Test
    void pOptionDebit() {
        PaymentService service = new PaymentService();

        assertDoesNotThrow(() ->  service.pOption("Debit", 2.0));
    }

    @Test
    void pOptionMobileWallet() {
        PaymentService service = new PaymentService();

        assertDoesNotThrow(() ->  service.pOption("Mobile Wallet", 2.0));
    }
}