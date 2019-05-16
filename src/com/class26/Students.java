package com.class26;

public class Students {
	
	String fullName;
	int age;
	
	// this keyword - used to differentiate between local and instance variables
	public Students(String name, int ageNum) {
		
		this.fullName=fullName;
		this.age=age;
		}
	
	public void displayDetails()
	{
		System.out.println("Student's full name is "+fullName+" and age is "+age);
	}
	
	public static void main(String[] args) {
		
		Students obj=new Students("John", 31);
		obj.displayDetails();
	}

}
