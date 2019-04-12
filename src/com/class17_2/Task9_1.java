package com.class17_2;

public class Task9_1 {

	public static void main(String[] args) {

		// Print the following pattern: 
		//1 
		//12 
		//123 
		//1234 
		//12345
		
		Task9_1 demo=new Task9_1();
		demo.printNumbers();

	}

	void printNumbers() {
		for (int a = 1; a <= 5; a++) {

			for (int b = 1; b <= a; b++) {
				System.out.print(b);

			}
			System.out.println();

		}
	}

}
