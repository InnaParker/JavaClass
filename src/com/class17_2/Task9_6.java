package com.class17_2;

public class Task9_6 {

	public static void main(String[] args) {
		
	/* print following pattern
	/* 1234 - 4 rows and 5 columns
	 * 1234
	 * 1234
	 * 1234
	 */
		
		Task9_6 demo=new Task9_6();
		demo.pattern1();


	}
	
	void pattern1() {
		for (int i=1; i<5; i++) {
			
			for (int y=1; y<6; y++) {
				
				System.out.print(y);
			}
			System.out.println();
		}
	}

}
