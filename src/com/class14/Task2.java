package com.class14;

public class Task2 {

	public static void main(String[] args) {
		
		/*Create a String that should be combination of letters, numbers and 
		 * special characters. Find out how many alpha characters are there 
		 * in the String.
		 */
		
		String str="123Today is Saturday! 5678%^&*";
		
		String newString=str.replaceAll("[^A-Za-z]", "");
		System.out.println(newString.length());
		
	}

}
