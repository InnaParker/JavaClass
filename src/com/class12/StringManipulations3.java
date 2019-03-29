package com.class12;

public class StringManipulations3 {

	public static void main(String[] args) {
		
		//Function charAt() - returns 2 char at specified index starting from 0
		String str="Students";
		
		char character=str.charAt(4);  //takes character from index and prints it 
		System.out.println(character);
		
		for (int i=0; i<str.length(); i++) { //to access and print each char use for loop
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		// charAt() will return index of specified character
			
		String str1="Sunday";
		
		int index=str1.indexOf("n");
		System.out.println(index);
		
		
		String str2="Syntax Technologies";
		
		System.out.println(str2.indexOf("Syntax"));       //0
		System.out.println(str2.indexOf("Technologies")); //7
		System.out.println(str2.indexOf("lW")); 
		//if it does not find char will give error -1
		
		
		// Substring is a string inside another string.
		
		String str3="Today is Sunday Java class";
		
		String newString=str3.substring(9);
		System.out.println(newString);
		
		System.out.println(str3.substring(0,5));   //Today
		System.out.println(str3.substring(9,20));  //Sunday Java
		System.out.println(str3.substring(16,20));   //Java
		//specify index at which you want to stop counting
		
	}

}


