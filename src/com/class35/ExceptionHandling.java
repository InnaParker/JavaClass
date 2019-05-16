package com.class35;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("Begining of the code");

		try {
			Thread.sleep(2000); //Obj on exception might be thrown (new InterruptedException
		
		} catch (InterruptedException e) {
			System.out.println("I am a catch block code");
			e.getMessage();
		}
		
		//ArithmeticException e=new InterruptedException(); - will not work, has to match
		
		//InterruptedException e=new InterruptedException();
		// Exception e=new InterruptedException();
		
	}

}
