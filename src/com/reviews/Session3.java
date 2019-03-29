package com.reviews;

import java.util.Scanner;

public class Session3 {

	public static void main(String[] args) {
		
			// Write a program to find out what to do for the following temperatures
            // Temperatures is greater than 100 print out Stay inside it's too hot
            // temperatures is greater than 50 and less than 99 print out Wear winter clothes
            // temperatures is greater than 30 and less than 49 print out Wear winter clothes
            // temperatures is greater than 10 and less than 29 print out Stay inside it's too cold
            // lastly if the temperature  is lower than that print out Call for help it's too cold 
			// outside
		
		/* if do not use scanner
		 * int temp=15;
		 * String output;
		 * 
		 * output="Wear winter clothes" 
		 * System.out.println(output) */
		
		
		Scanner scan=new Scanner(System.in);
		/* int temp;
		System.out.println("What is the temperature outside?");
		temp=scan.nextInt();
		
		if (temp>=100) {
			System.out.println("Stay inside it's too hot");
			
				
		}else if (temp>=50 && temp<=99) {
				System.out.println("Wear winter clothes");
				
			
		}else if (temp>=30 && temp<=49) {
				System.out.println("Wear winter clothes");
			
				
		}else if (temp>=10 && temp<=29){
			System.out.println("Stay inside it's too cold");
			
		}else {
			System.out.println("Call for help it's too cold"); */
		
		//Write a program that allows a user to input age to find out if the user is either Too Young, 
		// Young Person, Middle Age Person, or  too Old
        // Age should NOT be greater than 18  print out  Too Young
        // Age should be between 18 and 35 inclusive  print out Young Person
        // Age should equal 36 or less than or equal to 99 inclusive print out  You are Middle Age 
		// Person. If the age is greater than 100 print print out  You are too Old
        // Create an int variable named age
		
		/* int age;
		
		System.out.println("Please enter your age");
		age=scan.nextInt();
		
		if (!(age>18)) {
			System.out.println("You are too young");
			
		}else if (age>=18 && age<=35) {
			System.out.println("Your are a young person");
			
		}else if (age>=36 && age<=99) { //(age <=36 || age <=99)
			System.out.println("Your are middle aged");
			
		}else {
			System.out.println("Your are too old"); */
		
		
		// Write a program to found out the user level of experience
        // Must use a switch statement with  a String variable named levelString and 
		// a int variable named level
        // Beginner level should be 1
        // Intermediate level should be 2
        // Expert level should be 3
		
		
		int level=3;
		String levelString;
		
		switch (level) {
		
		case 1: 
			levelString="Beginner";
			break;
			
		case 2:
			levelString="Intermediate";
			break;
			
		case 3:
			levelString="Expert";
			break;
			
		default:
			levelString="Not available";
		}
		System.out.println("Your level of experience is " +levelString);
	}
}
		
		
	



	



