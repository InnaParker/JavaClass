package com.class23;

public class Repl101 {
	
	/* Declare static variable in the Main class as static String ss="Welcome to
	 * Syntax Solutions" and call static variable in main method in 3 ways:
	 * 
	 * 
	 */

	static String ss="Welcome To Syntax Solutions";
	
	public static void main(String[] args) {
		
		System.out.println(ss);
		
		Repl101 obj1=new Repl101();
		obj1.ss="Welcome To Syntax Solutions";
		System.out.println(obj1.ss);
		
		Repl101.ss="Welcome To Syntax Solutions";
		System.out.println(ss);
		

	}

}
