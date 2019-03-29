package com.class4;

import java.util.Scanner;

public class Repl18 {

	public static void main(String[] args) {
		
		/*Write a program to take values of length 
		 * and width from user and check if it the shape 
		 * of the object is square or rectangle. */
		
		Scanner input=new Scanner(System.in);
		
		int length, width;
		
		System.out.println("Please enter the length");
		length=input.nextInt();
		
		System.out.println("Please enter the width");
		width=input.nextInt();
		
		if (length!=width) {
			System.out.println("The shape of your object is rectangle");
			
		}else {
			System.out.println("The shape of your object is square");
			
		}
		
		
		

	}

}
