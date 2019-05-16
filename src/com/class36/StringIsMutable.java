package com.class36;

public class StringIsMutable {

	public static void main(String[] args) {
		// 2 ways to create a string:
		// 1. Using string literal

		String str="Hello";
		
		// 2. Using key word
		String str2=new String("Bye");
		
		str.toUpperCase();
		String s=str.replaceAll("o", "a");
		System.out.println(s);
		
	}

}
