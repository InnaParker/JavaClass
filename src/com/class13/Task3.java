package com.class13;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		/* Write a program that reads two people’s first names and if they 
		* expecting boy or girl? Based on the input suggests a name for a baby:
		* Example Output: Mom’s first name? Mary. Dad’s first name? Daniel.
		* Boy or Girl? boy - Suggested baby name: DANRY
		* Example Output: Mom’s first name? Mary. Dad’s first name? Daniel.
		* Boy or Girl? girl - Suggested baby name: MAIEL */
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Please enter Mom's first name");
		String mom=scan.nextLine();
		
		System.out.println("Please enter Dad's first name");
		String dad=scan.nextLine();
		
		System.out.println("Are you expecting boy or girl?");
		String gender=scan.nextLine();
		
		switch (gender)
		{
		case "Boy":
			System.out.println(dad.substring(0,dad.length()/2)+mom.substring(mom.length()/2));
			break;
			
		case "Girl":
			System.out.println(mom.substring(0,mom.length()/2)+dad.substring(dad.length()/2));
			break;
			
		}
		String babyName;
		
		if (gender.equalsIgnoreCase("boy")) {
			babyName=dad.substring(0,dad.length()/2)+mom.substring(mom.length()/2);
			
		}else if (gender.equalsIgnoreCase("girl")) {
			babyName=mom.substring(0,mom.length()/2)+dad.substring(dad.length()/2);
			
		}else {
			babyName="no suggestion";
		}
		System.out.println(babyName.toUpperCase());
	}

}
