package com.class24;

public class Repl120 {
	
	// Write program to overload static method. 
	// Create two static methods with different parameters and 
	//try to call them in main method. Create one method without 
	// parameter, create another method with int parameter.
	// Output: M1 method without parameter . M1 method with int 
	// parameter.
	

	public static void main(String[] args) {
		Repl120 obj=new Repl120();
		obj.m1();
		obj.m1(1);

	}
	
	public static void m1()
	{
		System.out.println("M1 method without parameter");
	}

	public static void m1(int a)
	{
		System.out.println("M1 method with int parameter");
	}

}
