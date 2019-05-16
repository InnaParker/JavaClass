package com.class27;

public class Repl137 {
	
	/* Method overloading is possible in abstract class. Create abstract class as  
	 * parent, create two abstract methods with same name one with int parameter 
	 * and one without parameter but method name should be same. Extend the abstract 
	 * class with main class. Provide the implementation for two methods in main 
	 * method by creating the object of main class with parent class instance and 
	 * call those 2 methods in the main method.   Output:
	 * abstract method1 implementation without argument in main class
	 * abstract method2 implementation with argument in main class 
	 */

	public static void main(String[] args) {
		Parent3 obj=new Main3();
		obj.m1();
		obj.m1(1);

	}

}
abstract class Parent3 {
	
	abstract void m1();
	abstract void m1(int a);
}

class Main3 extends Parent3 {

	void m1() 
	{
		System.out.println("abstract method1 implementation without argument in main class");	
	}

	void m1(int a) 
	{
		System.out.println("abstract method2 implementation with argument in main class");	
	}
	
}