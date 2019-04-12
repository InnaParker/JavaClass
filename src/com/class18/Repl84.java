package com.class18;

public class Repl84 {

	/* Create one method and  pass a String  as single parameter in method 
	* and write the logic for that method in println statement two print twice 
	* and call the method in main method pass the the String as 
	* "Don't make me say this twice!" */
	
	void PrintTwice(String s){
	
	    System.out.println(s);
	    System.out.println(s);
	    
	  }
	
	public static void main(String[] args) {
		
		Repl84 obj=new Repl84();
		obj.PrintTwice("Don't make me say this twice!");
		

	}

}
