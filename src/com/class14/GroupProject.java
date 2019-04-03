package com.class14;

public class GroupProject {

	public static void main(String[] args) {
		
		
		//3. Find out how many alpha characters present in the string?
		
		String str="Today is Saturday";
		
		String newString=str.replaceAll(" ", "");
		System.out.println(newString.length());
		
		
		//4. How to find out the part of the string from s string? What is 
		//substring? Find number of words in string?
		
		String str1="It's a great day outside";

		String[] array=str1.split(" ");
		
		System.out.println(array.length);
		
		
		//5. Write a Java program to reverse string. Reverse string word by word.
		
		String original="Today is Java class";
		String reverse="";
		
		for (int i=original.length()-1; i>=0; i--) {
			reverse+=original.charAt(i);
				
		}
		System.out.print(reverse);

	}

}
