package com.class23;

public class Repl97 {
	
	/* 1. Complete Dog.java class: include following variables:
	 * name=Tarzan, breed=Mutt, weight=50.0. All class variables should be declared
	 * lowercase, mutt must be static.
	 * Write 2 constructors: main constructor (with all parameters), 2nd constructor
	 * that takes in only name and weight (breed defaults to "Mutt".
	 * 2. Test your code with Main class. Create a Dog object using both
	 * Constructors and print their fields/states to make sure it's correct.
	 * 
	 * Output:
	 * 1. The main constructor (with parameters)=Tarzan Mutt 50.0
	 * 2. 2nd constructor that takes only name and weight=Tarzan Mutt 50.00.
	 */

	String name;
	static String breed="Mutt";
	double weight;

	public void m1(String name, String breed, double weight) 
	{
	System.out.println(name+" "+breed+" "+weight);
	}
	
	public void m2(String name, double weight) 
	{
	System.out.println(name+" "+breed+" "+weight);
	
	}
	
	
	public static void main(String[] args) {
	
		Repl97 obj1=new Repl97();
		obj1.m1("Tarzan", "Mutt", 50.0);
		
		Repl97 obj2=new Repl97();
		obj2.m2("Tarzan", 50.00);
	}

}
