package com.class5;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		
		/*/* as user to enter age and based on it we will print:
		 * if age more than 1 but less then 3 = baby
		 * if age more than 3 but less then 5 = toddler
		 * if age more than 5 but less then 13 = child
		 * if age more than 13 but less then 20 = teenager
		 * if age more than 20 but less then 64 = adult
		 * if age more or equal 64 = senior
		 */

		Scanner input=new Scanner(System.in);
		
		int age;
		
		System.out.println("Please enter your age");
		age=input.nextInt();
		
		if (age>1 && age<3) {
			System.out.println("You are a baby");
			
		}else if (age>=3 && age<5) {
			System.out.println("Your are a toddler");
			
		}else if (age>=5 && age<13) {
			System.out.println("Your are a child");
			
		}else if (age>=13 && age<20) {
			System.out.println("Your are a teenager");
			
		}else if (age>=20 && age<64) {
			System.out.println("Your are an adult");
			
		}else {
			System.out.println("Your are a senior");
			
		}
		
	}

	}


