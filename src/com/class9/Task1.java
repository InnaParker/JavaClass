package com.class9;

public class Task1 {

	public static void main(String[] args) {
		
		/* print following pattern
		 * 54321 - 4 rows 5 columns
		 * 54321
		 * 54321
		 * 54321
		 */

		for (int i=5; i>0; i--) {
			
			for (int y=5; y>=1; y--) {
				
				System.out.print(y);
			}
			System.out.println();
	}

}
}
