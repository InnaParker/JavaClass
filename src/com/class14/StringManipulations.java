package com.class14;

public class StringManipulations {

	public static void main(String[] args) {
		
		//1. Replace function
		
		String str="I am good tester!";
		String newStr=str.replace("a","e");		//Replace every 'a' character in string to 'e'
		
		System.out.println(newStr);
		
		String newStr1=str.replace("good", "great");
		System.out.println(newStr1);
		
		String newStr2=str.replace("tester", "programer");
		System.out.println(newStr2);
		
		str=str.replace("!", "?");
		System.out.println(str);
		
		//2. Replace All - will replace all that matches specified pattern(regex)
		
		String str1="123Hello 5678World%^&*";
		String replacedNoNumbers=str1.replaceAll("[0-9]", "");
		System.out.println(replacedNoNumbers);
		
		String newString=replacedNoNumbers.replaceAll("[^A-Za-z]", "");
		System.out.println(newString);
		
		String replacedNoCharacters=replacedNoNumbers.replaceAll("[a-z]", "");
		// [A-Za-z] if want to replace upper and lower case letters
		System.out.println(replacedNoCharacters);
		
		String str2="Hello123";
		System.out.println(str2.replaceAll("[^0-9]", ""));
	}

}
