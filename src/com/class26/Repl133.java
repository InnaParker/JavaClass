package com.class26;

public class Repl133 {
	
	/* Create Parent class and declare 1 constructor with 1 argument.
	 * Create Child class and declare 1 constructor without any args and
	 * call the parent constructor by using super keyword. 
	 * Create another constructor in Child class and declare any arguments. 
	 * Call the Parent class constructor by using super keyword.
	 * In the Main method create obj for the Child class without any parameters
	 * and create another obj with one argument.
	 * Output should be:
	 * Parent Constructor in parent class with one argument.
	 * Child Constructor in child class with zero argument.
	 * Parent Constructor in parent class with one argument.
	 * Child Constructor in child class with one argument.
	 */

	public static void main(String[] args) {
		
		Child9 obj=new Child9();
		Child9 obj1=new Child9(0);
	}
}
class Parent9 {
	
	Parent9(int a) {
		
		System.out.println("Parent Constructor in parent class with one argument");
	}
}

class Child9 extends Parent9 {
	Child9 (){
		super(0);
		
		System.out.println("Child Constructor in child class with zero argument");
	}
	Child9 (int a){
		super(0);
		System.out.println("Child Constructor in child class with one argument");
	}	
}
