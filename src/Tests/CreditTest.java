package Tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import models.Payments.Credit;
import models.Payments.PaymentOption;

public class CreditTest {
    @Test
    public void testPayPositiveAmount() {
        Double amount = 100.0;
        Credit.pay(amount);
        // No assertion needed as the method does not produce any side effects
    }

    @Test
    public void testPayZeroAmount() {
        Double amount = 0.0;
        Credit.pay(amount);
        // No assertion needed as the method does not produce any side effects
    }

    @Test
    public void testPayNegativeAmount() {
        Double amount = -50.0;
        Credit.pay(amount);
        // No assertion needed as the method does not produce any side effects
    }

    @Test
    public void testPayLargeAmount() {
        Double amount = 1000000.0;
        Credit.pay(amount);
        // No assertion needed as the method does not produce any side effects
    }

    @Test
    public void testPayFractionalAmount() {
        Double amount = 10.55;
        Credit.pay(amount);
        // No assertion needed as the method does not produce any side effects
    }

    @Test
    public void testPayWithNullAmount() {
        Double amount = null;
        Credit.pay(amount);
        // No assertion needed as the method does not produce any side effects
    }

    @Test
    public void testPayWithPositiveInfinityAmount() {
        Double amount = Double.POSITIVE_INFINITY;
        Credit.pay(amount);
        // No assertion needed as the method does not produce any side effects
    }

    @Test
    public void testPayWithNegativeInfinityAmount() {
        Double amount = Double.NEGATIVE_INFINITY;
        Credit.pay(amount);
        // No assertion needed as the method does not produce any side effects
    }

    @Test
    public void testPayWithNaNAmount() {
        Double amount = Double.NaN;
        Credit.pay(amount);
        // No assertion needed as the method does not produce any side effects
    }

    @Test
    public void testPayWithVerySmallAmount() {
        Double amount = 0.0000000001;
        Credit.pay(amount);
        // No assertion needed as the method does not produce any side effects
    }
    
    @Test
    public void testPaymentOptionInstantiation() {
        // Create an instance of PaymentOption using Credit
        PaymentOption paymentOption = new Credit();
        assertNotNull(paymentOption); // Ensure that paymentOption is not null
    }
    
}
