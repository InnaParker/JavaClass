package com.class22;

public class StaticVsNotStatic {

	public String name="John";				//instance variable
	public static String lastName="Snow";	//static variable
	
	public static void main(String[] args) {
		
		StaticVsNotStatic obj=new StaticVsNotStatic();
		obj.getInfo();
		getInfo1();				//can call static method or variable within same 
								//class by it's name only
		
		System.out.println(lastName);

	}
	public void getInfo()			//non-static method can access both instance and 
									//static variables
	{
		System.out.println("My name is "+name+ " and my last name is "+lastName);
		//getInfo1();     //we can access static method within non-static
	}
	
	public static void getInfo1()	//static method can only access static variables, 
									//cannot access name
	{
		//System.out.println("My name is "+name+ " and my last name is "+lastName);
		System.out.println("I am static method");
		//getInfo1();     //we cannot access non-static method within static
	}

}
