package com.class11;

import java.util.Scanner;

public class Repl58 {

	public static void main(String[] args) {
		
		/* Create an int array with the size of 5 and input values with Scanner.  
		 * Print out each element of the array multiplied by ten, one element per line. 
		 * Create a loop and enter values into one loop, the second loop print the 
		 * values and it must be multiplied by 10.
		 */

		Scanner scan=new Scanner(System.in);
		
		int[] numbers=new int[5];
		
		for (int i=0; i<numbers.length; i++) {
			
			numbers[i]=scan.nextInt();
			
		}
		for (int y=0; y<numbers.length; y++) {
			System.out.println(numbers[y]*10);
			
		}
		
		
	}

}
