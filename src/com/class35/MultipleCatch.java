package com.class35;

public class MultipleCatch {

	public static void main(String[] args) {

		try {
			Thread.sleep(2000);			// new InterruptedException();
			System.out.println(10 / 0); // Arithmetic exception();

		} catch (ArithmeticException e) {
			// 3 ways to print name and details of exception
			
		//	e.printStackTrace();  //Name of E, detail of E, location
			System.out.println(e); // Name of E and details
			System.out.println(e.getMessage());  // Details of E
			
			System.out.println("Code of Arithmetic exception");

		} catch (InterruptedException e) {
			System.out.println("Code of Interrupted exception");
		}
		System.out.println("End of code");
	}

}
