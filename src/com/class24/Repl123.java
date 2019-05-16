package com.class24;

public class Repl123 {
	
	/* Create the two Constructor with different parameters and try 
	 * to call them in main method. Create one method without parameters
	 * and another method with String parameter.
	 * Output: Welcome to the syntax solutions. 
	 * I am the student in syntax solutions
	 */

	public static void main(String[] args) {
		
		Repl123 obj=new Repl123();
		Repl123 obj1=new Repl123(null);

	}
	
	Repl123 (){
		System.out.println("Welcome to the syntax solutions");
	}
	
	Repl123 (String str){
		System.out.println("I am the student in syntax solutions");
	}

}
