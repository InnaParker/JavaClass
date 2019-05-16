package com.class28;

public interface TakesScreenshot {

	String filExtension=".png";// by default - public static final and defined
	
	void takesScreenshot();
	

// From Java version 8 we are allowed to have defined methods in Interface (only 
// static or default) along with Abstract method.

	static void m1() 
	{
		System.out.println("Static m1 method");
	}
	
	default void m2()
	{
		System.out.println("Default m2 method");
	}

}