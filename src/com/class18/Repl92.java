package com.class18;

public class Repl92 {
	
	/*  Write a method header on line two with the following specs:
	 * Returns: a double. Name: negate. Parameters: a double called "num"
	 * Then, starting on line 4, write the code that will return the 
	 * opposite value of num (if it's positive, make it negative, 
	 * otherwise make it positive).
	 * Examples: 4 ==> -4   -10 ==> 10   1 ==> -1 */

	 static double negate(double num) {
		
		return num*(-1);
	
	}
	
	//test case below (don't change):
		
	public static void main(String[] args){
		System.out.println(negate(8)); //should be -8
		System.out.println(negate(-2)); //should be 2
	}
}

