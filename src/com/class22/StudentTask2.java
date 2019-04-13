package com.class22;

public class StudentTask2 {
	
	/* Write a java program of Class Students that takes students name and 3 subject grades. 
	 * Inside your class also have a method to Calculate Average Grade. Test Student class 
	 * for 5 different students with different marks. Your program should print an average 
	 * mark of each students name.
	 * NOTE: please make different names for instance and local variables. */

	
	String studentName;
	int grade1, grade2, grade3;
	
	
	public StudentTask2 (String name, int a, int b, int c) 
	{
		studentName=name;
		grade1=a;
		grade2=b;
		grade3=c;	
	}
	
	
	public void getAverage()
	{
		int average=(grade1+grade2+grade3)/3;
		System.out.println("My name is "+studentName+" and my average grade is "+average);
	}
	
	public static void main(String[] args) {
		
		StudentTask2 student1=new StudentTask2("Amina", 90, 85, 47);
		student1.getAverage();
		
		
		//StudentTask2 obj=new StudentTask2("Inna Parker");
		//System.out.println(obj.averageGrade(90, 95, 93));
		
	}
	
	//int averageGrade (int a, int b, int c)
		//{
		//	return (a+b+c)/3;
			
		//}

}
