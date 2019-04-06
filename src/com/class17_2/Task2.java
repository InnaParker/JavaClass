package com.class17_2;

public class Task2 {

	public static void main(String[] args) {
		
		/*print following pattern
		 * 55555 - 5 rows 5 columns
		 * 44444
		 * 33333
		 * 22222
		 * 11111
		 */

		for (int i=5; i>0; i--) {
			
			for (int y=5; y>=1; y--) {
				System.out.print(i);
			}
			System.out.println();
	}

}
}
