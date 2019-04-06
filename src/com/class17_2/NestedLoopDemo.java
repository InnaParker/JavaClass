package com.class17_2;

public class NestedLoopDemo {

	
	public static void main(String[] args) {
		NestedLoopDemo demo=new NestedLoopDemo();
		demo.printNumbers();
		
	}

	void printNumbers() {
		for (int i = 0; i <= 2; i++) {

			for (int y = 1; y <= 3; y++) {

				System.out.println(i + " " + y);
			}

		}
	}

}
