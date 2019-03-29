package com.class9;

public class Task4 {

	public static void main(String[] args) {
		
		/* print the following pattern - 4 rows and 6 columns
		 * only printing rows 1 and 4, only columns 1 and 6
		 * 		******
		 * 		*    *
		 * 		*    *
		 * 		******
		 */

		for (int a=1; a<=4; a++) {
			
			for (int b=1; b<=6; b++) {
				
				if (a==1 || a==4 || b==1 || b==6) {
					System.out.print("*");
					
				} else {
					System.out.print(" ");
				}
				
				
			}
			System.out.println();
		
	}

}
}

