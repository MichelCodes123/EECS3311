package Tests;

import database_access.FacultyMemberAccess;
import models.Users.FacultyMember;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import services.Payments.PaymentService;

import java.util.ArrayList;

public class PaymentTest {

    @Test
    void testPayment() throws Exception {
        PaymentService service = new PaymentService();


        FacultyMember prof = new FacultyMember("id","Name", "location", "password",  true, 1.0, true, new ArrayList<>(), new ArrayList<>() );
        FacultyMemberAccess profdb = FacultyMemberAccess.getInstance();
        profdb.users.add(prof);
        profdb.update();

        service.overduePay(1.0, "Credit", prof);
        assertEquals(0.0, prof.getOverdue_charge());

        profdb.load();
        profdb.users.set(0, prof);
        profdb.update();
        profdb.load();
        assertEquals(0.0, profdb.users.get(0).getOverdue_charge());
    }
}
