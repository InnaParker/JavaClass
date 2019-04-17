package com.class24;

public class Parent {

	public void love()
	{
		System.out.println("Parents love");
	}
	
	public void work ()
	{
		System.out.println("Parents work");
	}
}

class Child extends Parent {
	
	public void love ()
	{
		System.out.println("Child love");
	}
	
	public void cry()
	{
		System.out.println("Child cries");
	}
	
}
	
