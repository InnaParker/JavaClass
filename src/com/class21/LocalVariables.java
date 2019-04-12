package com.class21;

public class LocalVariables {

	public static void main(String[] args) {
		
		String name="John";   //local variable is only visible to main method
		System.out.println(name);

		LocalVariables obj=new LocalVariables();
		obj.hello(name);
		System.out.println(name);
	}
	
	public void  hello(String name)  //add parameter to the method in order to use name
	{
		name="Jack";
		System.out.println("Hello "+name);
	}

}
