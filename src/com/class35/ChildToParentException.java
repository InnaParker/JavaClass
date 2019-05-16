package com.class35;

public class ChildToParentException {

	public static void main(String[] args) {
		
		int[]array= {17, 99,8};
		
		try {
			Thread.sleep(2000);
			System.out.println(array[3]); //new ArrayIndexOutOfBoundsException
			
		} catch(InterruptedException e) {
			System.out.println(e.getMessage());
			
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Code after execution");

	}

}
