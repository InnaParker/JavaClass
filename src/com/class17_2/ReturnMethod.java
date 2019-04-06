package com.class17_2;

import java.util.Scanner;

public class ReturnMethod {

	public static void main(String[] args) {
		
		ReturnMethod obj=new ReturnMethod();
		
		Scanner scan=new Scanner(System.in);
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		System.out.println(obj.sum(a,b));

	}
	int sum(int x, int y) {
		System.out.println();
		return x+y;
	}
	void sub() {
		int a=10, b=12;
		
		System.out.println(a-b);
	}

}
