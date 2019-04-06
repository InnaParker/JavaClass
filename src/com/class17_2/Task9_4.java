package com.class17_2;

public class Task9_4 {

	public static void main(String[] args) {

		// Clock

		Task9_4 demo=new Task9_4();
		demo.clock();
	}

	void clock() {
		for (int h = 0; h < 24; h++) {

			for (int m = 0; m < 60; m++) {

				if (m < 10) {
					System.out.println("0" + h + ":0" + m);

				} else {
					System.out.println("0" + h + ":" + m);
				}

				System.out.println(h + ":" + m);
			}
		}
	}

}
