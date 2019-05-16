package com.class26;

public class A {
	
	/* Write program in class A has final display method and try overload and 
	 * override this method and observe result.  */

	public final void m1()
	{
		System.out.println("Final method");
	}
	public final void m1(String a)
	{
		System.out.println("Example of overloading final method");
	}
}

class B extends A {
	
	//Cannot override final method 
}

