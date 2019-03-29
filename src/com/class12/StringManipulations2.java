package com.class12;

public class StringManipulations2 {

	public static void main(String[] args) {
		
		// Does the string contain specific value (match)? If value present - true, else- f
		
		String str="Good morning";
		boolean contains=str.contains("morning");
		System.out.println(contains);
		
		//if name is changing but "Welcome," part remains constant.
		
		String present="Welcome, Inna";
		String neededValue="Welcome,";
		
		boolean flag=present.contains("Welcome,"); 
		//or boolean flag=present.contains(neededValue); 
		
		System.out.println(flag);
		
		boolean flag1=present.toLowerCase().contains(neededValue);	
		System.out.println(flag1);
		
		// String starts and ends with method
		
		String str1="syntax";
		
		boolean starts=str1.startsWith("s");
		System.out.println(starts);
		
		boolean ends=str1.endsWith("x");
		System.out.println(str1.endsWith("y"));
				
		// Checks if string is empty, less than 0 means empty.
		
		String str2=" ";
		boolean empty=str2.isEmpty();
		System.out.println(empty);
		
		// Concatenation method for 2 strings = concat()
		
		String str3="Hello ";
		String str4="Ali";
		
		System.out.println(str3+str4); //or
		System.out.println(str3.concat(str4));
		//concat 3 or more strings = str.concat("").concat("").concat("");
		
		
		String expected="You may qualify for multi-policy discount!";
		String actual="You may qualify for multi-policy discount! ";
		
		//System.out.println(expected.contentEquals(actual));
		
		//Trim will remove empty space in the beginning and end. 1st trim, then - compare
		
		actual=actual.trim();
		System.out.println(expected.contentEquals(actual));
		
		}

}
