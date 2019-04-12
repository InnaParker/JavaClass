package com.class18;

public class Repl90 {
	
	/* Write a method header on line two with the following specs:
	 * Returns: a String. Method Name: makeCapital. Parameters: a String 
	 * named "name" */
	
	String makeCapital(String name)
	{
		return name.toUpperCase();
	}

	
	
	public static void main(String[] args) {
		
		Repl90 m=new Repl90();
		System.out.println(m.makeCapital("test"));
	}

}
