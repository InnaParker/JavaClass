package com.class27;

public class Repl135 {
	
	/* Create abstract class as  parent. Create one abstract method and another 
	 * normal instance method in the abstract class with implementation. 
 	 * Extend the abstract class with main class. Provide the implementation for 
 	 * one abstract method which is declared in the parent class. In main method 
 	 * by creating the object on main class with parent class instance and call 
 	 * those two methods in the main method. 
	 * Output: 
	 * abstract method1 implementation in main class
	 * abstract method2 implementation in parent class
	 */

	public static void main(String[] args) {
	
		Parent1 obj=new Main1();
		obj.m1();
		obj.m2();

	}
}

abstract class Parent1 {
	
	abstract void m1();
	public void  m2()
	{
		System.out.println("abstract method2 implementation in parent class");
	}
	
}

class Main1 extends Parent1 {

	@Override
	void m1() {
		System.out.println("abstract method1 implementation in main class");
		
	}
	
}
