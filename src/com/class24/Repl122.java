package com.class24;

public class Repl122 {
	
	/* Create 2 private methods with different parameters and try to 
	 * call them in main method. Create one method without parameters
	 * and another method with int parameter
	 * Output: private m1 method,  private m1 method with int parameter
	 */

	public static void main(String[] args) {
		Repl122 obj=new Repl122();
		obj.m1();
		obj.m1(0);
		

	}
	private void m1()
	{
		System.out.println("private m1 method");
	}

	private void m1(int a)
	{
		System.out.println("private m1 method with int parameter");
	}

}
