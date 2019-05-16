package com.class23;

public class Repl114 {
	
	/* Create 3 classes (A, B, C). Write 2 constructors. Default constructor
	 * that prints the following: For A: "I", For B: "am", For C: "a tester".
	 * Make C extend B and B extend A.
	 * From the Main class create an object of the C class.
	 * Output:
	 * I
	 * am
	 * a tester
	 */

	
	public static void main(String[] args) {
		C obj=new C();
	}
}

class A {
	
	A ()
	{
		System.out.println("I");
	}
}

class B extends A{
	
	B ()
	{
		System.out.println("am");
	}
	
}

class C extends B{
	
	C ()
	{
		System.out.println("a tester");
	}
		
}


