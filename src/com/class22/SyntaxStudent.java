package com.class22;

public class SyntaxStudent {
	
	//schoolName, batchNumber, studentName, studentLastName
	//method getStudentsDetails
	
	public static String schoolName="Syntax";
	public static int batchNumber=4;
	
	public String studentName;
	public String studentLastName;
	
	public SyntaxStudent(String name, String lastName) //building constructor. 
	// main role of constructor is to initialize instance variables
	{
		studentName=name;
		studentLastName=lastName;
	}
	

	public void getStudentDetails()
	{
		String details="I am student at "+schoolName+" from batch "+batchNumber+" and my name is "+studentName+" "+studentLastName;
		System.out.println(details);
	}
}
