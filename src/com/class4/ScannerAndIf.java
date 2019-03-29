package com.class4;

import java.util.Scanner;

public class ScannerAndIf {

	// take2 numbers from a user and compare them

	public static void main(String[] args) {

		int num1, num2;

		Scanner userInput = new Scanner(System.in);

		System.out.println("Please enter first number");

		num1 = userInput.nextInt();

		System.out.println("Please enter second number");

		num2 = userInput.nextInt();

		System.out.println(num1);
		System.out.println(num2);

		if (num1 > num2) {
			System.out.println(num1+ " is larger than " +num2);

		}else if (num2>num1 ){
			System.out.println(num1+ " is smaller than " +num2);
			
		}else {
			System.out.println(num1+ " is equal to " +num2);
		}
		System.out.println("I am done");
	}
}
