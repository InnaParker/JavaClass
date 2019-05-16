package com.class04;

import java.util.Scanner;

public class Repl25 {

	public static void main(String[] args) {
		
		/* Create a program that will take a  boolean value 
		 * from a user make the variable isTrue. if the input is 
		 * TRUE or FALSE then output should read.
		 * First Output: "Input the boolean value"
		 * Final Output: "The value is "*/
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Input the boolean value");
		boolean isTrue=input.nextBoolean();
		
		System.out.println("This value is "+isTrue);
		
		
	}
}
