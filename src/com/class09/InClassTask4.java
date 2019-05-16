package com.class09;

public class InClassTask4 {

	public static void main(String[] args) {
		
		/* print following pattern
		 * 		*
		 * 		**
		 * 		***
		 * 		****
		 * 		*****
		 * 		****
		 * 		***
		 * 		**
		 * 		*
		 */

		for (int a=1; a<=5; a++) {
			
			for (int b=1; b<=a; b++) {
				
				System.out.print("*");
				
			}	
			System.out.println();
			
	}
		for (int c=1; c<=4; c++) {
			
			for (int d=4; d>=c; d--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		

}
}
