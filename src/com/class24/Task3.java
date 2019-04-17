package com.class24;

public class Task3 {
	
	/* Create 1 class with a private method that has 3 overloaded forms. 
	 * Then call each overloaded method with specific arguments and observe result.
	 */

	private static void m1(String str)
	{
		System.out.println(str);
		
	}
	
	private static void m1(int a)
	{
		System.out.println(a);
		
	}
	
	private static void m1(int a, int b)
	{
		System.out.println(a*b);
		
	}
	public static void main(String[] args) {
		
		m1("Tuesday");
		m1(23);
		m1(5,69);

	}

}
