package com.class24;

public class Repl117 {
	
		/* Create class A write the logic in it by creating constructor:
		 * System.out.println(10);
		 * Create class B write the logic in it by creating constructor
		 * that extends the class A.   System.out.println(20);
		 * Create class C write the logic in it by creating constructor
	 	 * that extends the class B.   System.out.println(30);
		 * In main method create object for C class. 
		 * Output: 10  20	30 on separate lines.
		 */

	public static void main(String[] args) {
		
		A obj=new C();
		
		
	}

}

class A {
	
	A ()
	{
		int i=10;
		System.out.println(10);
	}
}

class B extends A {
	B ()
	{
		int i=20;
		System.out.println(20);
	}
	
}

class C extends B {
	C ()
	{
		int i=30;
		System.out.println(30);
	}
}
