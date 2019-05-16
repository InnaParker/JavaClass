package com.class36;

public class Recap {

	public static void main(String[] args) throws InterruptedException {
		
		//Thread.sleep(2000);

		int a=12;
		int b=0;
		
		try {
			System.out.println(a/b);
			
		} finally {
			System.out.println("Finally block");
			
		}
		System.out.println("End of code");  // will not execute
	}

}
