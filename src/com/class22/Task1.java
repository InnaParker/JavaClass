package com.class22;

public class Task1 {
	
	/* Write a program that will have a constructor: one with parameters and second without any parameters. 
	 * Create a separate Test class where you will execute both of the constructors.
	 */
	
	public String myName;
	public String myLastName;
	
	public Task1(String name, String lastName) 
	{
		myName=name;
		myLastName=lastName;
	}

	
	public void getDetails()
	{
		System.out.println("My first name is "+myName+ " and my last name is "+myLastName);
	}
	
	{
		
}
}
