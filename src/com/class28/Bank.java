package com.class28;

public interface Bank {

	static String name="Bank";
	String hello="HI";
	
	void hasChecking();
	void hasSavings();
	void hasCreditCard();
	
}

class BOA implements Bank {

	@Override
	public void hasChecking() 
	{
		System.out.println("BOA has 2 types of checking accounts");
	}

	@Override
	public void hasSavings() 
	{
		System.out.println("BOA has 2 types as savings accounts");
	}

	@Override
	public void hasCreditCard() 
	{
		System.out.println("BOA has 10 types of credit cards");
	}	
}

class PNC implements Bank {

	@Override
	public void hasChecking() 
	{
		System.out.println("PNC has 3 types of checking accounts");
	}

	@Override
	public void hasSavings() 
	{
		System.out.println("PNC has 3 types as savings accounts");
	}

	@Override
	public void hasCreditCard() 
	{
		System.out.println("PNC has 7 types of credit cards");
	}
	public void hasLoan()
	{
		System.out.println("PNC ofers personal loans");
	}
	
}