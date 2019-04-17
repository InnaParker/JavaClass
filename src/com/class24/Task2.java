package com.class24;

public class Task2 {
	
	/* Create 1 class with a static method that has 3 overloaded forms. 
	 * Then call each overloaded method with specific arguments and observe result.
	 */

	public static void m1(String str)
	{
		System.out.println(str);
		
	}
	
	public static void m1(int a)
	{
		System.out.println(a);
		
	}
	
	public static void m1(int a, int b)
	{
		System.out.println(a*b);
		
	}
	
	public static void main(String[] args) {
		
		m1("Hello");
		m1(13);
		m1(7,7);
		
		
	}

}
