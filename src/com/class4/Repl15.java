package com.class4;

import java.util.Scanner;

public class Repl15 {

	public static void main(String[] args) {
		/*The variable "name" holds a String user input. Write a conditional statement 
		 * starting on line 9 that does the following: If name is equal to "Chen", print 
		 * "teacher". For any other input, print "student"
		 */
		
		Scanner inp = new Scanner(System.in);
		System.out.println("In:");
		
		String name = inp.nextLine();
		
				
		if (name.equals("Chen")) {
			System.out.println("teacher");
			
		}else {
			System.out.println("student");
			
		}
	}

}
