package com.class14;

import java.util.Scanner;

public class GroupTask7 {

	public static void main(String[] args) {

		// Write a java program to check whether a given number is prime or not?
		//Rime number should meet2 conditions - divisible by 1 and itself only
		//2,3,5,7,11,13,17,19,23,29

		int num;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter any number");
		num=input.nextInt();
		
		boolean prime = false;

		for (int i = 2; i <= num / 2; ++i) {

			if (num % i == 0) {
				prime = true;
				break;
			}
		}
		if (!prime) {
			System.out.println(num + " is a prime number");

		} else {
			System.out.println(num + " is not a prime number");
		}

	}
}
