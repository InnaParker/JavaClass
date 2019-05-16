package com.class09;

public class Task3 {

	public static void main(String[] args) {
		
		/* print the following pattern
		 * 		*		- 4 rows
		 * 		**
		 * 		***
		 * 		****
		 * 
		 */

		for (int a=1; a<5; a++) {
			
			for (int b=1; b<=a; b++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
	}

}
