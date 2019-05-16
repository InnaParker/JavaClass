package com.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		
		// prompt user to put name 3 times and print "You are doing great..."
		
		Scanner scan=new Scanner(System.in);
		String name;
		int a=1;
		
		while (a<=3) {
			System.out.println("Please enter your name");
			name=scan.nextLine();
			
			System.out.println("You are doing great "+name);
			a++;
		}
		
		

	}

}
