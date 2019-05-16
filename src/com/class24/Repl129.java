package com.class24;

public class Repl129 {
	
	/* Create 2 Constructors. Create one Constructor in parent class and
	 * write the logic as Parent class Constructor without parameter.
	 * Create another Constructor in the child class and write the logic as 
	 * Child class Constructor without parameter. 
	 * In main method create object with child class and call the child class 
	 * Method. Output: Parent class Constructor without parameter.
	 * Child class Constructor without parameter */

	public static void main(String[] args) {
		
		Child5 obj=new Child5();
		
	}

}
class Parent5 {
	
	Parent5 (){
		System.out.println("Parent class Constructor without parameter");
	}
}

class Child5 extends Parent5 {
	
	Child5 (){
		System.out.println("Child class Constructor without parameter");
	}
	
}
