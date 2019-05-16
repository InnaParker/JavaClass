package com.class23;

public class Repl113 {
	/* Declare two private variables in Main class as: private int batch=3
	 * private String name="SyntaxSolutions". Declare one private method 
	 * in Main class as display. Create a method to return print those two 
	 * values and print them in your main method by calling that method 
	 * please print in order as shown above:
	 * Output:
	 * 3
	 * SyntaxSolutions
	 */

	private int batch=3;
	private String name="SyntaxSolutons";
	
	private void m1()
	{
		System.out.println(batch);
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		Repl113 obj=new Repl113();
		obj.m1();

	}

}
