package com.class9;

import java.util.Scanner;

public class InclassTask6 {

	public static void main(String[] args) {
		
		/* Ask a user to input a leap year. Give the user 10 chances 
		 * to enter a correct leap year. As soon as the user enters the 
		 * correct leap year exit the loop.
		 */
		
		Scanner scan=new Scanner(System.in);
		
		for (int year=2015; year<=2024; year++) {
			
			System.out.println("Please enter a leap year from 2015 to 2024");
			year=scan.nextInt();
			
			if (year%4!=0) {
				System.out.println("This is not a leap year");
				
			}else if(year%4==0) {
				System.out.println(year+ " is a leap year");
				break;
			}
		}
		
		
		
	}

}
