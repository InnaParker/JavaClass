package com.class24;

public class Repl128 {
	
	/* Create 2 methods with same name. Create one protected method in 
	 * parent class and write the logic as "Protected method in parent class"
	 * Create same public method within  the child class and extends the parent 
	 * class and write the logic as "public method in parent class"
	 * In main method create object with Parent class and call the parent class 
	 * Method */

	public static void main(String[] args) {
		
		Parent4 obj=new Parent4();
		obj.m1();

	}

}
class Parent4 {
	
	protected void m1()
	{
		System.out.println("Protected method in parent class");
	}
}

class Child4 extends Parent4 {
	
	public void m1()
	{
		System.out.println("public method in parent class");
	}
	
}
