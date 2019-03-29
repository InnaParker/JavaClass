package com.class6;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		/* Using scanner class create calculator.
		 * Allow user to enter 2 numbers and operator (+, -, *, /). 
		 * Based on operator provide the result to user.
		 */

		Scanner scan;
		int num1, num2, res=0;
		char operator;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter two numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		
		System.out.println("Please enter math operation sign you wish to use");
		operator=scan.next().charAt(0);
		
		switch (operator) {
		
		case '+':  
			res=num1+num2;
			break;	
		case '-':
			res=num1-num2;
			break;
		case '*':
			res=num1*num2;
			break;
		case '/':
			res=num1/num2;
			break;
		default:
			System.out.println("Not valid");
	}
		System.out.println("Your result is " +res);
	}

}
