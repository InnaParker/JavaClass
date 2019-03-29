package com.class4;

import java.util.Scanner;

public class Repl23 {

	public static void main(String[] args) {
		
		/*Write a program that asks the user's age and then
		 * display it by adding 10 i.e (age + 10)*/

		/*First Output: "Enter your age"
		*Final Output: "your age after 10 years is " remember to
		*put the value in your final output with 10 years added to it*/

		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age=input.nextInt();
		
		int expectedAge=(age+10);
		
		
		System.out.println("Your ager after 10 years is " +expectedAge);
		
	}

}
