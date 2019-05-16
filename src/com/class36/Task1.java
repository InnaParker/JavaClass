package com.class36;

public class Task1 {

	public static void main(String[] args) {
		/* Create an exception: when user it trying to withdraw larger amount that 
		 * the balance. Throw an exception saying “You do not have enough money”
		 */
		withdraw(30.00, 40.00);
		

	}

	public static void withdraw (double balance, double amount) {
		
		if(amount<=balance) {
			System.out.println("Please take your money");
		} else {
			throw new ArithmeticException("Your balance is too low");
			
		}
	}
}
