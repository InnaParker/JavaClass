package com.class28;

public class Repl138 {
	
	/* Create Interface with name as MyInterface. Create two methods in the interface 
	 * without implementation.  Implements MyInterface with main class. In main 
	 * method create the object of main class with MyInterface instance and call 
	 * those two methods in the main method and for those methods have them print the 
	 * statements.   Output:
	 * implementation of method1
	 * implementation of method2
	 */

	public static void main(String[] args) {
		MyInterface obj=new Main();
		obj.method1();
		obj.method2();

	}

}

interface MyInterface {
	
	void method1();
	void method2();
}

class Main implements MyInterface {

	public void method1() 
	{
	System.out.println("implementation of method1");	
	}

	public void method2() 
	{
		System.out.println("implementation of method2");
	}
	
}