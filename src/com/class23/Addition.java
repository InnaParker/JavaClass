package com.class23;

public class Addition {
	
	// 1. Method overloading by changing number of parameters (using same name method)
	public void add(int a, int b)
	{
		System.out.println("Method to add 2 integers");
		System.out.println(a+b);
	}
	
	public void add(int a)
	{
		System.out.println("Method to add 1 integer to 100");
		System.out.println(a+100);
	}
	
	public void add(int a, int b, int c)
	{
		System.out.println("Method to add 3 integers");
		System.out.println(a+b+c);
	}
	
	// 2. Method overloading by changing data type of the parameters
	
	public void add(double a, double b)
	{
		System.out.println("Method to add 2 doubles");
		System.out.println(a+b);
	}
	
	public void add(double a, double b, double c)
	{
		System.out.println("Method to add 3 doubles");
		System.out.println(a+b+c);
	}
	
	public void add(int a, double b)
	{
		System.out.println("Method to add 1 integer and 1 double");
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		
		//Test Addition
		Addition obj=new Addition();
		obj.add(5, 7);
		obj.add(3.5, 6.7, 12.3);
		obj.add(100);
	}

}
