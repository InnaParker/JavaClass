package com.class23;

public class Repl105 {
	
	/* Create method and create logic to increment the count value as count++.
	 * In Main method create 3 objects and call method with these objects.
	 * Output should be:
	 * 3
	 * 3
	 * 3
	 */

	static int count=0;
	
	public void m1()
	{
		count++;
		
	}
	
	public static void main(String[] args) {
		
		Repl105 obj1=new Repl105();
		Repl105 obj2=new Repl105();
		Repl105 obj3=new Repl105();
		
		obj1.m1();
		System.out.println(count+2);
		obj2.m1();
		System.out.println(count+1);
		obj3.m1();
		System.out.println(count);
		
	}

}
