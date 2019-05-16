package com.class23;

public class Repl110 {
	/* Declare instance variables in Main class: int aa, String name,
	 * float salary, boolean value, double age. Print values for them
	 * in Main method as we are not assigning any values to them/default.
	 * Call them in Main method.
	 * Output: 0  null 0.0 false 0.0
	 */
	
	int aa;
	String name;
	float salary;
	boolean value;
	double age;
	
	public void m1()
	{
		System.out.println(aa);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(value);
		System.out.println(age);
	}

	public static void main(String[] args) {
		
		Repl110 obj=new Repl110();
		obj.m1();
		
		
		

	}

}
