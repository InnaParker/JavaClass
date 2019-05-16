package com.class32;

public abstract class CreditCard {
	
	public String ccName;
	
	public CreditCard(String ccName)
	{
		this.ccName=ccName;
		
	}
	
	public void openAccount() {
		System.out.println("Open "+ccName+" credit card");
	}
	public abstract void intRate();
	public abstract void annualFee(); 
	
}

class Visa extends CreditCard {
	
	public Visa(String ccName) {
		super(ccName);
	}
	
	@Override
	public void intRate() 
	{
		System.out.println(ccName+" card has interest rate of 25%");
	}

	@Override
	public void annualFee() 
	{
		System.out.println(ccName+" card has annual fee of $250");
		
	}
}	

class AX extends CreditCard {
	public AX(String creditCardName) {
		super(creditCardName);
	}
	@Override
	public void intRate() {
		System.out.println(ccName+" card has interest rate of 22%");
	}
	@Override
	public void annualFee() {
		System.out.println(ccName+" card has annual fee of $200");
	}
}

class MasterCard extends CreditCard {
	public MasterCard(String creditCardName) {
		super(creditCardName);
	}
	@Override
	public void intRate() {
		System.out.println(ccName+" card has interest rate of 20%");
	}
	@Override
	public void annualFee() {
		System.out.println(ccName+" card has NO annual fee");
	}
}