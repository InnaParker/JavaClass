package com.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// How would you handle InputMismatchException? It is when user enters
		// different value from what is expected.

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a number?");
		
		try {
			int num=scan.nextInt();
			System.out.println(num);
			
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		}
		
	}

}
