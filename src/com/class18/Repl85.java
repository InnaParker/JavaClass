package com.class18;

public class Repl85 {
	
	/* Multiple Parameters for method. Create method with Multiple Parameters 
	 * as int and write the logic in that method in println statement to print 
	 * hours : with minutes and call the method in main method with values 
	 * Output: MUST BE!!! 11"30 */

	

	  void printTime(int hour, int minute){
	    System.out.println(hour+":"+minute);
	  }
	  
	public static void main(String[] args) {
		
		Repl85 obj=new Repl85();
		obj.printTime(11, 30);

	}

}
