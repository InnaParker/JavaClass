package com.class15;

import java.util.Scanner;

public class IQ6 {

	public static void main(String[] args) {
		
		// Write a Java Program to find whether a String is palindrome or not?
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a string");
		String word=scan.nextLine();
		
		String reverse="";
		
		for (int i=word.length()-1; i>=0; i--) {
			reverse=reverse+word.charAt(i);
			
		}
		System.out.println(reverse);
		
		if (word.equalsIgnoreCase(reverse)) {
			System.out.println("The word is palindrome");
		}else {
			System.out.println("The word is not palindrome");
		}
	}

}
