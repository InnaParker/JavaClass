package com.class09;

public class NestedLoops {

	public static void main(String[] args) {
		
		for (int i=0; i<=5; i++) {
			System.out.print(i);
		}
		System.out.println();
		
	// i want to print following pattern
	/* 1234 - 4 rows and 5 columns
	 * 1234
	 * 1234
	 * 1234
	 */

		for (int i=1; i<5; i++) {
			
			for (int y=1; y<6; y++) {
				
				System.out.print(y);
			}
			System.out.println();
		}
		
		/* 1111111 - 7 rows, 7 columns
		 * 2222222
		 * 3333333
		 * 4444444
		 * 5555555
		 * 6666666
		 * 7777777
		 */
		
		for (int a=1; a<=7; a++) {
			
			for (int y=1; y<=7; y++) {
				System.out.print(a);
			}
			System.out.println();
		}
		
		/*print following pattern
		 * 		*****
		 * 		*****
		 * 		*****
		 * 		*****
		 */
		
		for (int b=0; b<4; b++) {
			for (int c=0; c<5; c++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
