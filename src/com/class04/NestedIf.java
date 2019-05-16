package com.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		/* write a program to check work eligibility
		 * if user is younger than <16 not allowed to work
		 * otherwise - allowed to work. If user is younger
		 * than 64 - enjoy life*/
		
		
		 int age=18;
		 int eligibleAge=16;
		 int retiredAge=64;
		 
		 
		 if (age<eligibleAge) {
			System.out.println("You are too young to work");
			
		 }else {
			 System.out.println("You are eligible to work");
			 
			 if (age<retiredAge) {
				System.out.println("Go and work");
				
			 }else {
				 System.out.println("Enjoy your life! You do not need to work");
				 
			 }
		 }
	}
}
