package com.class05;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		/* write program to find largest number among 3 numbers using
		 * nested if condition, with numbers provided by a user. */

		int num1; int num2; int num3;
		
	
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter 3 distinct numbers");
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
		
		if (num1>num2) {
			
			if (num1>num3) {	
				System.out.println(num1+ " is the largest number");
			} else {
				
				System.out.println(num3+ " is the largest number");
			}
		
						
		}else { //assuming num2>num1
				
			if (num2>num3) {
					System.out.println(num2+ " is the largest number");
							
			}else {
					System.out.println(num3+ " is the largest number");
					
				}
		}	
	}
}
