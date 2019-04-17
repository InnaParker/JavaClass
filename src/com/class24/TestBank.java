package com.class24;

public class TestBank {

	public static void main(String[] args) {
		
		Bank bank=new Bank();
		BOA boa=new BOA();
		PNC pnc=new PNC();
		
		int interestRate;
		
		interestRate=bank.chargeInterest();
		System.out.println("Bank charges interest " +interestRate);
		
		interestRate=boa.chargeInterest();
		System.out.println("BOA charges interest " +interestRate);
		
		interestRate=pnc.chargeInterest();
		System.out.println("PNC charges interest " +interestRate);

	}

}
