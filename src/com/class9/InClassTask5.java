package com.class9;

import java.util.Scanner;

public class InClassTask5 {

	public static void main(String[] args) {
		
		/* Write a guessing game where the user has to guess a secret number 
		 * between 1 and 20. After every guess input, the program tells the 
		 * user whether their number was too large or too small. The program 
		 * will keep asking the user to enter the number until he finds the 
		 * correct number. When the correct answer is found the system should 
		 * display "Congratulations!!. You got it!".
		 */

		int num; 
		int secretNum=5;
		Scanner scan=new Scanner(System.in);
		
		
		for (int i=1; i<=20; i++) {
			System.out.println("Please guess a secret number between 1 and 20");
			num=scan.nextInt();
			
			if (num==secretNum) {
				System.out.println("Congratultaions!! You got it!");
				break;
			}
			
		}
	}

}
