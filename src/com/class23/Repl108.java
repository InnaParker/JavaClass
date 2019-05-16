package com.class23;

public class Repl108 {
	/* Write Java program to print an int, a double and char on screen.
	 * Declare them as instance variables and call them in main method.
	 * int x=10, double y=10.23 char z=z
	 */

	
	static int x=10;
    double y = 10.23;
    char z = 'z';
    
    public void m1()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
    
	public static void main(String[] args) {
		
		Repl108 obj1=new Repl108();
		System.out.println(obj1.x);
		
		Repl108 obj2=new Repl108();
		System.out.println(obj2.y);
		
		Repl108 obj3=new Repl108();
		System.out.println(obj3.z);
		
		

		
	}

}
