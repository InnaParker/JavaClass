package com.class15;

public class IQ1 {

	public static void main(String[] args) {
		
		/* Write a program to swap 2 numbers without a temporary variable.
	 	* Swap 2 strings without a temporary variable. */
		
		int a=10;
		int b=20;
		
		a=a+b; //getting the sum, now a is 30
		b=a-b; //30-20 -> 10
		a=a-b; //30-10=20
		
		System.out.println("The value of a="+a+" value of b="+b);
		
		String str1="Hello"; //5
		String str2="World"; //5
		
		str1=str1+str2; //HelloWorld ->10
		str2=str1.substring(0,str1.length()-str2.length()); //Hello
		str1=str1.substring(str2.length());

		System.out.println("The value of string 1="+str1+" value of string 2="+str2);
	}

}
