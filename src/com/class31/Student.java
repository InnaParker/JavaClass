package com.class31;

public class Student {

	public String name;
	public int studentId;
	
	public Student(String name, int studentId) {
		this.name=name;
		this.studentId=studentId;
	}
	public void printStudentDetails ()
	{
		System.out.println(name+" "+studentId);
	}
}
