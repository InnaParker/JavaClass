package com.class9;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		/* Ask a user to input a leap year. Give the user 10 chances 
		 * to enter a correct leap year. As soon as the user enters the 
		 * correct leap year exit the loop.
		 * if year is divisible by 400 leap year
		 * if year is divisible by 100 not leap year
		 * if year is divisible by 4 leap year
		 * ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		 */
		
		Scanner scan=new Scanner(System.in);
		int year;
		
		
		for (year=1; year<10; year++) {
			
			System.out.println("Please guess a leap year");
			year=scan.nextInt();
			
			if (year%400==0) {
				System.out.println("This is a leap year");
				
			}else if(year%4==0 && year%100!=0) {
				
				System.out.println(year+ " is a leap year");
				break;
			}
		}

	}

}
