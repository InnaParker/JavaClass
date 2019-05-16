package com.class25;

public class PaymentTest {

	public static void main(String[] args) {
		
		Payment payment=new Payment();
		payment.makePayment();
		
		MasterCard mc=new MasterCard();
		mc.makePayment();
		
		Visa visa=new Visa();
		visa.makePayment();
		visa.annualFee();
		
		//Achieving runtime polymorphism
		//pay is reference variable, Payment is type.
		//new MasterCard() - creates an object
		Payment pay=new MasterCard();
		pay.closePayment();
		pay.makePayment();
	}

}
