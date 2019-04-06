package com.class17_2;

public class Task9_8 {

	public static void main(String[] args) {
		
		/*print following pattern
		 * 		*****
		 * 		*****
		 * 		*****
		 * 		*****
		 */
		
		Task9_8 demo=new Task9_8();
		demo.pattern3();

	}
	void pattern3() {
		for (int b=0; b<4; b++) {
			for (int c=0; c<5; c++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
