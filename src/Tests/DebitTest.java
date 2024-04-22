package Tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import models.Payments.Debit;
import models.Payments.PaymentOption;

public class DebitTest {
    @Test
    public void testPay_NullAmount() {
        // Test paying with null amount
        Debit.pay(null);
        // No assertions since the method does not perform any action
    }

    @Test
    public void testPay_ZeroAmount() {
        // Test paying with zero amount
        Debit.pay(0.0);
        // No assertions since the method does not perform any action
    }

    @Test
    public void testPay_PositiveAmount() {
        // Test paying with positive amount
        Debit.pay(100.0);
        // No assertions since the method does not perform any action
    }

    @Test
    public void testPay_NegativeAmount() {
        // Test paying with negative amount
        Debit.pay(-50.0);
        // No assertions since the method does not perform any action
    }

    @Test
    public void testPay_InfinityAmount() {
        // Test paying with positive infinity amount
        Debit.pay(Double.POSITIVE_INFINITY);
        // No assertions since the method does not perform any action
    }

    @Test
    public void testPay_NegativeInfinityAmount() {
        // Test paying with negative infinity amount
        Debit.pay(Double.NEGATIVE_INFINITY);
        // No assertions since the method does not perform any action
    }

    @Test
    public void testPay_NaNAmount() {
        // Test paying with NaN amount
        Debit.pay(Double.NaN);
        // No assertions since the method does not perform any action
    }

    @Test
    public void testPay_MaxDoubleAmount() {
        // Test paying with the maximum Double value
        Debit.pay(Double.MAX_VALUE);
        // No assertions since the method does not perform any action
    }

    @Test
    public void testPay_MinDoubleAmount() {
        // Test paying with the minimum Double value
        Debit.pay(Double.MIN_VALUE);
        // No assertions since the method does not perform any action
    }

    @Test
    public void testPay_LargeAmount() {
        // Test paying with a large amount
        Debit.pay(1_000_000.0);
        // No assertions since the method does not perform any action
    }
    
    @Test
    public void testPaymentOptionInstantiation() {
        // Create an instance of PaymentOption using Debit
        PaymentOption paymentOption = new Debit();
        assertNotNull(paymentOption); // Ensure that paymentOption is not null
    }
    
}
