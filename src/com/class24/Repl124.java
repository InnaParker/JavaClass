package com.class24;

public class Repl124 {
	
	/* Create 2 final methods with same name but different parameters 
	 * and try to call them in main method. Create one method with 
	 * boolean parameter. Create another method with String parameter
	 * Output: Final method with boolean parameter.
	 * Final method with String parameter.
	 */

	public static void main(String[] args) {
	
		Repl124 obj=new Repl124();
		obj.m1();
		obj.m1(null);

	}
	
	final boolean m1()
	{
		System.out.println("Final method with boolean parameter");
		return true;
	}
	

	final void m1(String str)
	{
		System.out.println("Final method with String parameter");
	}

}
