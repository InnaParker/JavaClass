package com.class26;

public class Repl131 {
	
	/* Super method calling. Create class Parent. Declare 1 instance method
	 * and write logic in println statement as: m1 method in parent class.
	 * Create another class as Child extends Parent and declare 2 instance
	 * methods in child class - one with same name as parent class method
	 * and write logic as: m1 method in child class. Create another method
	 * in child class and call child class method and parent class method in
	 * this method. In Main method call method which you created in child
	 * class, called m2 method.
	 * Output: m1 method in child class.
	 * m1 method in parent class.
	 */

	public static void main(String[] args) {
		Child7 obj=new Child7();
		obj.m2();

	}

}

class Parent7 {
	void m1()
	{
		System.out.println("m1 method in parent class");
	}
	
}

class Child7 extends Parent7 {
	
	void m1()
	{
		System.out.println("m1 method in child class");
	}
	
	void m2()
	{
		Child7.this.m1();
		Child7.super.m1();
		
	}
	
}
