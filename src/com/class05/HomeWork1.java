package com.class05;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		
		/*write a program to find largest of 3 double values
		 * using if-else..if provided by a user */

		double num1;
		double num2;
		double num3;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter 3 distinct double numbers");
		
		num1=input.nextDouble();
		num2=input.nextDouble();
		num3=input.nextDouble();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1+ " is the largest number");
			
		}else if (num2 > num1 && num2 > num3) {
			System.out.println(num2+ " is the largest number");
					
		}else if (num3>num1 && num3>num2){
			System.out.println(num3+ " is the largest number");
			
			//no need for else because there is no False statement.
			
		}
		
	}

}
