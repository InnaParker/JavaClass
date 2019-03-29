package com.class4;

import java.util.Scanner;

public class Repl16 {

	public static void main(String[] args) {
		
		/*The variable "num" holds an integer user input
 		* Write a conditional statement starting on line 9 that does the following:
		* If num is positive, print "__ is positive"
		* If num is negative, print "__ is negative" */
		
		Scanner inp = new Scanner(System.in);
		System.out.println("In:");
		
		int num = inp.nextInt();
		
		if (num>0) {
			System.out.println(num+ " is positive");
			
		}else if (num==0) {
			System.out.println(num);
			
		}else {
			System.out.println(num+ " is negative");
			
		}
		
	}

}

