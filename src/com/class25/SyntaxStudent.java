package com.class25;

public class SyntaxStudent extends Student{
	
	public void study()
	{
		System.out.println("Syntax students should study hard");
	}
	
	protected void doHomeWork()
	{
		System.out.println("Syntax stusents must do REPL");
	}
	
	void attendClasses()
	{
		System.out.println("Syntax students must attend classes");
	}

	private void doResearch()
	{
		System.out.println("Syntax students should watch videos");
	}
}
