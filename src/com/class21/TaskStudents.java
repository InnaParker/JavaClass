package com.class21;

public class TaskStudents {
	
	static int studentID=5;
	String studentName;
	int numberOfStudents;
	
	void change()
	{
		System.out.println(studentID);
	}

	public static void main(String[] args) {
		
		/* Create a Class called Students. Create three  variables  studentName , studentID  
		 * and  numberOfStudents. Create three objects of the Students Class.
		 * Set the value for  studentName , studentID and increment  the numberOfStudents for 
		 * each object. Print out  total number of students.
		 */

		TaskStudents s1=new TaskStudents();
		TaskStudents s2=new TaskStudents();
		s1.change();
		
		
		
	}

}
