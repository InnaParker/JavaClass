package com.class24;

public class Repl127 {
	
	/* Create a default method in parent class saying "method in Parent class" 
	 * that will be overridden from the child class saying "method in Child 
	 * class".  In main class achieve run time polymorphism.  */

	public static void main(String[] args) {
		
		Child3 obj=new Child3();
		obj.m1();

	}

}
class Parent3 {
	
	void m1()
	{
		System.out.println("method in Parent class");
	}
}

class Child3 extends Parent3 {
	
	void m1()
	{
		System.out.println("method in Child class");
	}
	
}