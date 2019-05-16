package com.class23;

public class Repl112 {
	/*
	 * In main class please declared the variables with different access modifiers:
	 * private int a=100, protected String name="SyntaxSolutions" float
	 * salary=565656.09f, public String city="Florida" In Main method call variables
	 * but make sure to do it in same order. Output: 100 SyntaxSolutions 565656.06
	 * Florida
	 */

	private int a = 100;
	protected String name = "SyntaxSolutions";
	float salary = 565656.09f;
	public String city = "Florida";

	public void m1()
	{
		System.out.println(a);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(city);
		
	}
	public static void main(String[] args) {
		
		Repl112 obj=new Repl112();
		obj.m1();

	}

}
