package com.class11;

import java.util.Scanner;

public class Repl59 {

	public static void main(String[] args) {

		/*
		 * Write an array with size of 5. Use a loop to input values to the array. Then
		 * print out all the elements you have created in the first loop in reverse
		 * order.
		 */

		Scanner scan = new Scanner(System.in);

		int[] numbers = new int[5];

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Please enter numbers from 1 to 5");

			numbers[i] = scan.nextInt();
		}
		
		for (int y = 4; y >=0; y--) {
			System.out.println(numbers[y]);

		}

	}
}
