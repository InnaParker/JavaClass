package com.class20;

public class Student {

	public static void main(String[] args) {
		
		/*Create a class Student that will have a method getGrade
		 * your method should accept the score of a student and 
		 * return a grade. 
		 */

		Student obj=new Student();
		char myGrade=obj.getGrade(93);
		System.out.println("My grade is: " +myGrade);
	}
	char getGrade(int score) {
		char grade='A';
		
		if (score>90) {
			grade='A';
			
		}else if (score>80) {
			grade='B';
			
		}else if (score>70) {
			grade='C';
			
		}else if (score>50) {
			grade='D';
			
		}else {
			grade='F';
		}
		return grade;
	}

}
