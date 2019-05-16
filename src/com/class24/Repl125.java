package com.class24;

public class Repl125 {
	
	/* Create 2 static methods with same name. Create one method in 
	 * parent class and write the logic as "Parent m1()"
	 * Create another method with same name in the child class and
	 * write the logic "Child m1()". In main method create object with 
	 * child class and call the child class Method. Output:
	 * Child m1()  */

	public static void main(String[] args) {
		Child1 obj=new Child1();
		Child1.m1();

	}

}

class Parent1 {
	
	static void m1()
	{
		System.out.println("Parent m1()");
	}
}

class Child1 extends Parent1 {
	
	static void m1()
	{
		System.out.println("Child m1()");
	}
	
}
