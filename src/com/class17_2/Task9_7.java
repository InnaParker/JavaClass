package com.class17_2;

public class Task9_7 {

	public static void main(String[] args) {
		
		/* 1111111 - 7 rows, 7 columns
		 * 2222222
		 * 3333333
		 * 4444444
		 * 5555555
		 * 6666666
		 * 7777777
		 */

		Task9_7 demo=new Task9_7();
		demo.pattern2();

	}
	void pattern2() {
		for (int a=1; a<=7; a++) {
			
			for (int y=1; y<=7; y++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}

}
