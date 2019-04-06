package com.class17_2;

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
