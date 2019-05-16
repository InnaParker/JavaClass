package com.class27;

public class Task1 {
	
	/* Write program as a student class that has instance variables name 
	 * and address. Create a constructor that will initialize those 
	 * variables. Print name & address of given  student by the displayInfo 
	 * method.
	 */

	public static void main(String[] args) {
		Student obj=new Student("Inna Parker", "Fairfax, VA");
		obj.displayInfo();

	}
}

class Student {
	
	String name;
	String address;
	
	Student (String name, String address){	
		this.name=name;
		this.address=address;
	}
	public void displayInfo()
	{
		System.out.println("Student name is "+name+" and address is "+address);
	}
	
}
