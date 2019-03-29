package com.class4;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		/* You are DMV representative and you need to ask customer their age.
		 * If they are18 and older you will issue a drivers license to them,
		 * otherwise you will offer them to get learners permit.
		 * 
		 */
		
		int age;
		
		Scanner input=new Scanner(System.in);
		System.out.println("What is your age");
		
		age=input.nextInt();
		
		if (age>=18) {
			System.out.println("You are eligible to get your  Driver's Licence");
			
		}else if (age>=15){
			System.out.println("You can only apply for Learners Permit");
			
		}else {
			System.out.println("You ara too young to drive");
			
		}
		
	}
}
