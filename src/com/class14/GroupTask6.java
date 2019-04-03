package com.class14;

import java.util.Scanner;

public class GroupTask6 {

	public static void main(String[] args) {
		
		// Write a Java Program to find whether a String is palindrome or not?
		
		String original, reverse="";
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a string");
		original=scan.nextLine();
		
		int length=original.length();
		
		for (int i=length-1; i>=0; i--) {
			reverse=reverse+original.charAt(i);
			
			if (original.equals(reverse)) {
				
				System.out.println("The string is palindrome");
				
			}else {
				
			}
			
		}
		System.out.println("The string is not palindrome");
	}
	

}
