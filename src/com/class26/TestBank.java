package com.class26;

public class TestBank {

	public static void main(String[] args) {
		
		BankA bank1=new BankA();
		System.out.println("Your balance is $"+bank1.getBalance());
		
		BankB bank2=new BankB();
		System.out.println("Your balance is $"+bank2.getBalance());
		
		BankC bank3=new BankC();
		System.out.println("Your balance is $"+bank3.getBalance());
	}

}
