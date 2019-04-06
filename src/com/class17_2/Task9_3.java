package com.class17_2;

public class Task9_3 {

	public static void main(String[] args) {

		// Car mileage
		Task9_3 demo=new Task9_3();
		demo.carMileage();
	}

	void carMileage() {
		for (int a = 0; a <= 9; a++) {

			for (int b = 0; b <= 9; b++) {

				for (int c = 0; c <= 9; c++) {

					for (int d = 0; d <= 9; d++) {

						System.out.println(a + "" + b + "" + c + "" + d);
					}

				}

			}
		}
	}

}
