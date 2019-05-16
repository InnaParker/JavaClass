package com.class26;

public class Repl132 {
	
	/* Super method calling. Create parent class and declare static instance
	 * method, write logic in println as: m1 static method in parent class.
	 * Create Child class extends Parent and declare 2 static methods in it.
	 * One method with same name as in parent class an write logic such as:
	 * m1 static method in child class. Create another method m2 in Child
	 * class and call child class and parent class methods in this one.
	 * In Main method call method m2.
	 * Output: m1 static method in child class.
	 * m1 static method in parent class.
	 */

	public static void main(String[] args) {
		Child8 obj=new Child8();
		obj.m2();

	}

}
class Parent8 {
	static void m1()
	{
		System.out.println("m1 static method in parent class");
	}
	
}

class Child8 extends Parent8 {
	
	public static void m1()
	{
		System.out.println("m1 static method in child class");
	}
	
	static void m2()
	{
		Child8.m1();
		Parent8.m1();
		
	}
	
}
