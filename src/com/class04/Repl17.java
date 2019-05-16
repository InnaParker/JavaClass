package com.class04;

import java.util.Scanner;

public class Repl17 {

	public static void main(String[] args) {
		
		/*Write Java program to ask user "Please enter your age". 
		 *Then the program will show if the person is eligible to vote. 
		 *A person who is eligible to vote must be older than or equal 
		 *to 18 years old and the program will show "You are eligible 
		 *to vote".
		 *Otherwise the program will show "You are not eligible to vote".*/
		
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Please enter your age");
		
		int age=inp.nextInt();
		
		if (age>=18) {
			System.out.println("You are eligible to vote");
			
		}else {
			System.out.println("You are not eligible to vote");
		}
		

	}

}
