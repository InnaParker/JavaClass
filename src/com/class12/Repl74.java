package com.class12;

import java.util.Scanner;

public class Repl74 {

	public static void main(String[] args) {
		
		/* If language is Java it should print "Java is a programming language"
		 * If language is C it should print "C is a procedural programming language"
		 * If language is C++ should print "C++ is a middle-level progr language"
		 * If any other should print "Doesn't match any programming language"
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any programming language");
		
		String language=sc.nextLine();
		
		switch (language) {
		
		case "Java": 
			System.out.println("Java is a programming language");
			break;
			
		case "C":
			System.out.println("C is a procedural programming language");
			break;
			
		case "C++":
			System.out.println("C++ is a middle-level progr language");
			break;
			
		default:
			System.out.println("Doesn't match any programming language");
		}
		
		
		
	}

}
