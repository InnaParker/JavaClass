package com.class25;

public class Student {
	
	public void study()
	{
		System.out.println("Students must study");
	}
	
	protected void doHomeWork()
	{
		System.out.println("Students must do homework");
	}
	
	void attendClasses()
	{
		System.out.println("Students must attend classes");
	}
	
	//Private methods cannot be overriden and cannon be .
	//Must create child specific method.
	
	private void doResearch()
	{
		System.out.println("Students must do research");
	}

}
