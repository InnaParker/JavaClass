package com.class17_2;

public class Task9_2 {

	public static void main(String[] args) {

		/* Print following pattern
		 *
		 **
		 ***
		 ****
		 *****
		 ****
		 ***
		 **
		 *
		 */
		
		Task9_2 demo=new Task9_2();
		demo.starPattern();

	}

	void starPattern() {
		for (int a = 1; a <= 5; a++) {

			for (int b = 1; b <= a; b++) {

				System.out.print("*");

			}
			System.out.println();

		}
		for (int c = 1; c <= 4; c++) {

			for (int d = 4; d >= c; d--) {

				System.out.print("*");
			}
			System.out.println();
		}
	}

}
