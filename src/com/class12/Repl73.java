package com.class12;

import java.util.Scanner;

public class Repl73 {

	public static void main(String[] args) {
		
		/*Given a String banana do the following:
		* Print out the following: "The first 3 letters of ___ is ___"
		* For example, if the input is "banana", your output should be 
		* "The first 3 letters of banana is ban" */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter  a word");
		String word =(" ");
		word=scan.nextLine();
		
		
		System.out.println("The first 3 letters of "+word+" is "+word.substring(0,3));
		

	}

}
