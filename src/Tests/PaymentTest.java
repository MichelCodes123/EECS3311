package Tests;

import database_access.FacultyMemberAccess;
import models.Payments.PaymentOption;
import models.Users.FacultyMember;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import services.Payments.PaymentService;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

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
