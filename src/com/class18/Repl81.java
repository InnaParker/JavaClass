package com.class18;

public class Repl81 {

	public static void main(String[] args) {
		
		/*create two methods without any parameters  after main method.
		* method name as newLine and write the logic for that method in 
		* println statement as "newLine method implementation"
		* method name as displayLine and write the logic for that method in 
		* println statement as "displayLine method implementation"
		* in main method try to call that method  */
		Repl81 obj=new Repl81();
		
		obj.newLine();
		obj.displayLine();
		

	}
	void newLine() {
		System.out.println("newLine method implementation");
	}
	void displayLine(){
		System.out.println("displayLine method implementation");
	    
	  }

}
