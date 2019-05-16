package com.class26;

public class SuperWithConstructor {
	
	public SuperWithConstructor() {
		System.out.println("I am a parent class constructor");
	}
	
}

class ChildOfSuperWithConstructor extends SuperWithConstructor {
	
	public ChildOfSuperWithConstructor() {
		//super(); -> compiler adds by default
		//System.out.println("I am a child class constructor");
		
		super(); //always must be 1st line on the body of constructor
		
	}
}
