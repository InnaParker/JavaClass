package com.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		/*write a program that will read 3 inputs of scores
		 * (quiz, mid term, final score) and determine the grade 
		 * based on the following rules:
		 * if average score  >=90=> grade A
		 * if average score  >=70 and <90 grade B
		 * if average score >=50 and <70 grade C
		 * if average score <50 => grade F
		 * avgScore=(quiz+midTerm+final)/3
		 */
		
		Scanner input=new Scanner(System.in);
		
		//int quiz;
		//int mid;
		//int fin;
		//int avgScore=(quiz+mid+fin)/3;
		
		
		System.out.println("Please enter your quiz score");
		int quiz=input.nextInt();
		
		System.out.println("Please enter your midterm score");		
		int mid=input.nextInt();
		
		System.out.println("Please enter your final score");	
		int fin=input.nextInt();
		
		int avgScore=(quiz+mid+fin)/3;
		System.out.println("Your average score is " +avgScore);
		
		if (avgScore>=90) {
			System.out.println("Your grade is A");
			
		}else if (avgScore>=70 && avgScore<90) {
			System.out.println("Your grade is B");
			
		}else if (avgScore>=50 && avgScore<70) {
			System.out.println("Your grade is C");
			
		}else{
			
			System.out.println("Your grade is F");
		}

	}

}
