package com.class23;

public class Repl116 {

	/*
	 * Create four classes (Person, Employee, Student, Retiree). Properties are: For
	 * Person: String name, String lastName, int age. For Employee: int salary. For
	 * Student: int grade. For Retiree: String seniorActivity. Have a print method
	 * that print out the following: Joe Smith 35 35000, Adam Smith 15 10, Frank
	 * Smith 15 tour. Create ojects in Main method print properties.
	 */

	String name;
	static String lastName="Smith";
	int age;
}

class Employee1 extends Repl116 {

	int salary=35000;
	Employee1(){
		System.out.println("Joe "+lastName+" 35 "+salary);
	}
}

class Student extends Repl116{

	int grade=10;
	Student()
	{
		System.out.println("Adam "+lastName+" 15 "+grade);
	}
}

class Retiree extends Repl116{

	String seniorActivity="tour";
	Retiree()
	{
		System.out.println("Frank "+lastName+" 15 "+seniorActivity);
	}
}


