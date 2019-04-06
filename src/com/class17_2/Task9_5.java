package com.class17_2;

public class Task9_5 {

	public static void main(String[] args) {
		
		// Nested Loop
		
		Task9_5 demo=new Task9_5();
		demo.nestedLoop();

	}
	void nestedLoop() {
		for (int i=0; i<3; i++) {
			
			for (int y=0; y<3; y++) {
				
				System.out.println("I am inner loop");
			}
			System.out.println("-----I am outer loop-----");
		}

	}

}
