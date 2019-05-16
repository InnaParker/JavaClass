package com.class23;

public class Repl107 {
	/* Declare 1 local variable and 1 instance variable in Main class and
	 * access them in main method. Instance variable String Student1="John'
	 * Declare 1 local variable as int batch=3 and access in main method.
	 * Output: 
	 * John
	 * 3
	 */

	String Student1="John";
	
	public void m1()
	{
		System.out.println(Student1);
	}
	
	public static void main(String[] args) {
		
		int batch=3;
		
		Repl107 obj=new Repl107();
		System.out.println(obj.Student1);
		
		System.out.println(batch);
		

	}

}
