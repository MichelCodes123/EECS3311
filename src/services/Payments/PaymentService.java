package services.Payments;

import models.Payments.Credit;
import models.Payments.Debit;
import models.Payments.MobileWallet;
import models.Users.User;

public class PaymentService {

	public void discountPay(String name, Double amount, String paymentOption) {

		pOption(paymentOption, amount);

		System.out.print("Youve paid");

	}

	public void overduePay(Double amount, String paymentOption, User u) {

		pOption(paymentOption, amount);
		u.setOverdue_charge(0.0);
	}

	public void pOption(String paymentOption, Double amount) {

		switch (paymentOption) {
		case "Credit":
			Credit.pay(amount);
			break;
		case "Debit":
			Debit.pay(amount);
			break;
		case "MobileWallet":
			MobileWallet.pay(amount);
			break;

		}

	}

}
