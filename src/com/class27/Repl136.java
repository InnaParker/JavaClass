package com.class27;

public class Repl136 {
	
	/* Create abstract class as parent. Create default constructor in the 
	 * abstract class. Extends the abstract class with main class. Declare default 
	 * constructor in the main class. In main method create the object for the main 
	 * class.    Output:
	 * abstract class Constructor
	 * Main class Constructor
	 */

	public static void main(String[] args) {
		
		Parent2 obj=new Main2();
		

	}

}

abstract class Parent2 {
	
	Parent2 (){
		System.out.println("abstract class Constructor");
	}
	
}

class Main2 extends Parent2 {
	
	Main2 () {
		System.out.println("Main class Constructor");
	}
	
}
