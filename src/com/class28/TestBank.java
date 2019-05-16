package com.class28;

public class TestBank {
	
	public static void main(String[] args) {
	
		Bank bank=new PNC();
		
		bank.hasChecking();
		bank.hasCreditCard();
		bank.hasSavings();
		

		System.out.println(Bank.hello);
	}

}
