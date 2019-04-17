package com.class24;

public class Bank {  //Parent Class
	
	public int chargeInterest()
	{
		return 0;
	}

}

class BOA extends Bank {  //Child Class
	
	public int chargeInterest()
	{	
		return 2;
	}
	
}

class PNC extends Bank {  //Child Class
	
	public int chargeInterest()
	{
		return 3;
	}
	
}
