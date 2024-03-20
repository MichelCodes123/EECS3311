package services.Payments;

import models.Payments.Credit;
import models.Payments.Debit;
import models.Payments.MobileWallet;

public class PaymentService {

	public void verifyPayment(String name, Double amount, String paymentOption) {

		switch (paymentOption) {
		case "Credit":
			Credit.pay(name, amount);
			break;
		case "Debit":
			Debit.pay(name, amount);
			break;
		case "MobileWallet":
			MobileWallet.pay(name, amount);
			break;

		}
		System.out.print("Youve paid");

	}

}
