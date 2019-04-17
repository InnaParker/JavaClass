package com.class24;

public class Degree {
	
	/* Create a class ‘Degree’ having a method ‘getDegree’ that prints 
	 * “I got a degree”. Class ‘Degree’ has two subclasses namely ‘Undergraduate’ 
	 * and ‘Postgraduate’ each having a method with the same name that prints 
	 * “I am an Undergraduate” and “I am a Postgraduate” respectively. Call the 
	 * method by creating an object of each of the three classes.
	 */

	public void getDegree()
	{
		System.out.println("I got a degree");
	}
}

class Undergraduate extends Degree {
	
	public void getDegree()
	{
		System.out.println("I am a undergraduate");
	}
}

class Postgraduate extends Degree {
	
	public void getDegree()
	{
		System.out.println("I am a postgraduate");	
	}
	
}
	

