package com.class17_2;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {
		
		ScannerMethod obj=new ScannerMethod();
		
		Scanner scan=new Scanner(System.in);
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		obj.sub(12, 13);
		
		obj.sum();  //cannot do it with this method because it does not take values
		//in order to use this method must add Scanner
		
	}
	void sum() { //if expecting from user (int x, int y)
		int a=10, b=12; //not expecting input from the user
		System.out.println(a+b);
	}
	void sub(int x, int y) {
		System.out.println(x+y); //no return statement
	}

}
