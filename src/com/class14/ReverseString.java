package com.class14;

public class ReverseString {

	public static void main(String[] args) {
		
		// Interview Question: reverse a string without using a reverse function
		
		//1. Using toCharArray function
		
		String original="Today is Java class";
		String reverse="";
		
		char[] array=original.toCharArray();
		
		for (int i=array.length-1; i>=0; i--) {
			reverse=reverse+array[i]; //""+"s", 
			
		}
		System.out.println("Reversed string is: "+reverse);
		
		//2. charAt() function
		
		String reverse1="";
		
		for (int i=original.length()-1; i>=0; i--) {
			reverse1=reverse1+original.charAt(i);
				
		}
		System.out.print(reverse1);
		
		//3. Using substring()
		
		String reverse2="";
		
		System.out.println(original.length());
		for (int i=original.length(); i>0; i-- ) {
			reverse2=reverse2+original.substring(i-1,i);
			
		}
		System.out.print(reverse2);
		
	}
		
		

}
