package com.class35;

public class FinallyBlock {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
	//	try {
	//		System.out.println("Try block code");
	//		System.out.println(a/b);
			
	//	} catch (ArithmeticException e) {
	//		System.out.println("Catch block code");
		
	//	} finally {
	//		System.out.println("Finally block");
	//	}
		try {
			System.out.println(a/b);
			
		} finally {
			System.out.println("Finally block code");
		}
		System.out.println("Continues code");
		
		String str="Saturday";
		
	}

}
