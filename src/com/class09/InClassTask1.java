package com.class09;

import java.util.Scanner;

public class InClassTask1 {

	public static void main(String[] args) {
		
		/* Write a program that reads a range of integers (start and end point), 
		 * provided by a user and then prints the sum of the even and odd integers.
		 */

		Scanner scan=new Scanner(System.in);
		
		int num1, num2;
		int sumOdd=0, sumEven=0;
		
		System.out.println("Please enter 2 numbers for the range");
		
		num1=scan.nextInt();
		num2=scan.nextInt();
		
		if (num1 < num2) {
			
			for (int a=num1; a<=num2; a++) {
				
				if (a%2==0) {
					sumEven+=a;
					
				}else {
					sumOdd+=a;
					
				}
			}
		}
		
		
		System.out.println("The sum of even numbers in range from "+num1+" to "+num2+ " is "+sumEven);
		System.out.println("The sum of odd numbers in range from "+num1+" to "+num2+ " is "+sumOdd);
		
		
	}

}
