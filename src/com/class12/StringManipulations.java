package com.class12;

public class StringManipulations {

	public static void main(String[] args) {
		
		String str="Syntax";
		
		//calculate how many characters in the string
		
		int length=str.length(); //will return number of characters in the string
		System.out.println(length);
		
		String str1="Syntax Technologies";
		
		int length2=str1.length(); //1. Counts all in string including empty spaces!
		System.out.println(length2);
		
		String str2="Welcome!";
				System.out.println(str2.length());

		String str3="Hello";  //2. Convert every character to upper/lower case
		
		String newString=str3.toUpperCase();
		System.out.println(newString);
		
		String lowerCase=newString.toLowerCase();
		System.out.println(lowerCase);
		
		/*3. Strings comparison. Do not use == sign. Always use.equals. If strings 
		 * are equal - true, else - false. */
		
		String str4="Hello";  
		String str5="hello";
		
		boolean equality=str4.contentEquals(str5);
		System.out.println(equality);
		
		//equalsIgnoreCase() method - compares 2 strings and ignores case.
		
		String expextedBrowser="Chrome";
		String actualBrowser="chrome";
		
		boolean equals1=expextedBrowser.equalsIgnoreCase(actualBrowser);
		System.out.println(equals1);
		
		
		
	}

}
