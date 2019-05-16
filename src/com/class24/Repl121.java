package com.class24;

public class Repl121 {
	
	/* Write program to overload main method. 
	 * For you to do create two more other main methods 
	 * with different parameters. Create one method with 
	 * one string parameter. Create the logic in it as "main
	 * (String arg1)". Create another method with two string 
	 * parameters. Create the logic in it as "main(String arg1, 
	 * String arg2)" call that two methods in main method.
	 * Output: main(String arg1), main (String arg1, String arg2)
	 */

	public static void main(String[] args) {
		
		Repl121 obj=new Repl121();
		obj.m1(null);
		obj.m1(null, null);
	}
	
	public void m1(String arg1)
	{
		System.out.println("main(String arg1)");
	}

	public void m1(String arg1, String arg2)
	{
		System.out.println("main(String arg1, String arg2)");
	}
}
