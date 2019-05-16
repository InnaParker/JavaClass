package com.class26;

public class Repl130 {
	
	/* Create class Parent. Declare 2 variables: int a=10, int b=20.
	 * Creae another class Child extends Parent. Declare 2 variables
	 * int a=30, int b=40. Create method in child class with parameter
	 * and pass 2 parameters as int a, int b. Write logic to perform
	 * addition of parent variables, class variables and local
	 * variables in method. /use suoer and this keywords. 
	 * In main method call the method which you created in the child
	 * class and pass the parameters to values as 50, 60.
	 * Output: 110   70   30
	 */

	public static void main(String[] args) {
		Child6 obj=new Child6();
		obj.m1(50, 60);

	}

}
class Parent6 {
	int a=10;
	int b=20;
	
}

class Child6 extends Parent6 {
	int a=30;
	int b=40;
	
	void m1(int a, int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);
		System.out.println(super.a+super.b);
	}
}