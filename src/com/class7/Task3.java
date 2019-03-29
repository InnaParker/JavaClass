package com.class7;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		/* ask user to pay for soda. If price is not equal 1.99 keep asking user to write amount.
		 * in the end print "Please enjoy your soda" */

		Scanner scan=new Scanner(System.in);
		
		double price;
		
		do {
			System.out.println("Please enter price you will pay for soda");
			price=scan.nextDouble();
			
			
		} while (price!=1.99);
			
			System.out.println("Please enjoy your soda");
			
			
			
		//2nd way 
			
		/* double price;
		 * 
		 * while (price!=1.99) {
		 * System.out.println("Pay for soda");
		 * price=scan.nextDouble();
		 * 
		 * }
		 * System.out.println("Enjoy your soda"); */
		
			
		}
	}


