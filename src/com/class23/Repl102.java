package com.class23;

public class Repl102 {
	
	/* Declare static method and write logic to print static variables.
	 * In main method pass values for static variables as age=40, name=John
	 * and call static method in static way only. Do not create an object.
	 * Output: 40   John
	 */

	static int age;
	static String name;
	
	static void m1 (int age, String name)
	{
		System.out.println(age+" "+name);
	}
	  
	public static void main(String[] args) {
		
		age=40;
		name="John";
		System.out.println();

	}
	
	
}
