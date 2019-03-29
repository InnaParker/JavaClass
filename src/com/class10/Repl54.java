package com.class10;

public class Repl54 {

	public static void main(String[] args) {
		
		/*Write a program that creates an array with the following 
		 * values{s, a, y,  b, n, c, t,  d, a, e, x} and prints the 
		 * values starting at index 0 and multiple of 2 using a for loop.
		 */

		char[] letters= {'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};
		
		int size=letters.length;
		
		for (int i=0; i<=size; i+=2) {
			
			System.out.print(letters[i]);
		}
	}

}
