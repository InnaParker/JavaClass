package com.class05;

public class HomeworkReview {

	public static void main(String[] args) {
		
		/*check if user has a credit card
		 * if has, check what is the balance more than 1000
		 * pay it off. Else if it's less you are good.
		 */
		 
		boolean creditCard=true;
		int balance = 900;
		
		if (creditCard) {
			System.out.println("Please check the balance");
			
			if (balance>=1000) {
				System.out.println("Pay it off right away");
				
			} else {
				System.out.println("You are good");
			}
			
		}else {
			System.out.println("Would you like to apply for credit card?");
		}

	}

}
