package com.class24;

public class Repl126 {
	
	/* Create 2 methods with same name. Create one method in parent class 
	 * with two int parameters and write the logic in the method to print 
	 * the values (a+b). Create another method in child with same name and 
	 * extends the parent class with two int parameters and write the logic 
	 * in the method to print the values (a+b).
	 * In main method create object with child class and call the child class 
	 * Method. Pass the parameter values as 100, 200 */

	public static void main(String[] args) {
	
		Child2 obj=new Child2();
		obj.m1(100, 200);

	}

}
class Parent2 {
	
	public void m1(int a, int b)
	{
		System.out.println(a+b);
	}
}

class Child2 extends Parent2 {
	
	public void m1(int a, int b)
	{
		System.out.println(a+b);
	}
	
}
