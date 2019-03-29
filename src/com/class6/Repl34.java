package com.class6;

import java.util.Scanner;

public class Repl34 {

	public static void main(String[] args) {
		
		/*Write a program to input number "Input a number between 1-12" and when you input a number
		 * it should display the month using Scanner and Switch statement.
		 * case: 1 will display January, case: 12 will display December.
		 * Anything outside of 12 will display "Invalid" */

		Scanner scan=new Scanner(System.in);
		int month;
		String monthName;
		
		System.out.println("Input a number between 1-12");
		month=scan.nextInt();
		
		switch (month) {
		
		case 1: 
			monthName="January";
			break;
			
		case 2:
			monthName="February";
			break;
			
		case 3:
			monthName="March";
			break;
			
		case 4:
			monthName="April";
			break;
			
		case 5:
			monthName="May";
			break;
			
		case 6:
			monthName="June";
			break;
			
		case 7:
			monthName="July";
			break;
			
		case 8: 
			monthName="August";
			break;
			
		case 9:
			monthName="September";
			break;
			
		case 10:
			monthName="October";
			break;
			
		case 11:
			monthName="November";
			break;
			
		case 12:
			monthName="December";
			break;
			
		default:
			monthName="Invalid";
		}
		System.out.println(monthName);
		
	}

}
