package com.class26;

public class SuperKeyword {
	
	String name="John";
	
	public void sayName()
	{
		System.out.println("Parent name is "+name);
	}
	
	

}
class ChildOfSuper extends SuperKeyword{
	
	String name="Sam";
	
	public void sayName()
	{
		System.out.println("Parent name is "+super.name);
		System.out.println("Child name is "+name);
	}
	
	public void callingMethods() {
		sayName();   //this.sayName
		super.sayName();
	}
}
