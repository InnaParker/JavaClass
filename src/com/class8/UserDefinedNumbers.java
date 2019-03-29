package com.class8;

import java.util.Scanner;

public class UserDefinedNumbers {

	public static void main(String[] args) {
		// let user define a range of numbers and print
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter starting number");
		int startNumber=scan.nextInt();
		
		System.out.println("Please enter ending number");
		int endNumber=scan.nextInt();
		
		if (startNumber<endNumber) {
			
		
			for (int i=startNumber; i<=endNumber; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("I won't run your code");
		}

	}

}
