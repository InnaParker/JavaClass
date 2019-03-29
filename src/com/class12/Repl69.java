package com.class12;

public class Repl69 {

	public static void main(String[] args) {
		
		/*Validate if the string ends with "u" prints the Boolean value 
		 * accordingly
		* Validate if the string ends with "world" prints the Boolean 
		* value accordingly
		* Validate if the string ends with "are" prints the Boolean value 
		* accordingly
		* Validate if the string ends with "you" prints the Boolean value 
		* accordingly */
		
		String s1="hello how are you";
		
		boolean ends=s1.endsWith("u");
		System.out.println(s1.endsWith("u"));
		
		boolean ends1=s1.endsWith("world");
		System.out.println(s1.endsWith("world"));
		
		boolean ends2=s1.endsWith("are");
		System.out.println(s1.endsWith("are"));
		
		boolean ends3=s1.endsWith("you");
		System.out.println(s1.endsWith("you"));

	}

}
