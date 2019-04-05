package com.class17;

public class Task3 {

	public static void main(String[] args) {
		
		// Create a method that will print whether given string is palindrome?
		
		Task3 str=new Task3();
		str.palindrome("Mom");

	}
	void palindrome(String str) {
		String rev="";
		
		for (int i=str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
			
		}
		if (rev.equalsIgnoreCase(str));
			System.out.println(str+" is palindrome");
	}

}
