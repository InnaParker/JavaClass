package com.class23;

public class Repl103 {
	
	/* Create 2 methods. 1st instance method and write logic to say = Programming is
	 * amazing. In 2nd static method write logic to say = Java is awesome. 
	 */

	String str;
	
	public void m1()
	{
		System.out.println("Programming is amazing");
	}
	
	public static void m2() {
		System.out.println("Java is awesome");
	}
	
	public static void main(String[] args) {
		
		Repl103 obj=new Repl103();
		obj.m1();
		
		m2();
		

	}

}
