package com.class09;

import java.util.Scanner;

public class InClassTask2 {

	public static void main(String[] args) {
		
		/* Ask user to enter the item they want to buy and  the price for the item. 
		 * Then ask user to pay for it. Every time user enters money accumulate 
		 * the amount and tell user how much is left to pay off the amount. 
		 * Whenever user done with payments tell them "Thank you for shopping!"
		 */
		
		int price, payment, totalPayment=0, balance, change;
		String item;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter the item you would like to buy");
		item=scan.nextLine();
		
		System.out.println("Please enter the price for your item");
		price=scan.nextInt();
		
		
		do {
			System.out.println("Please pay for your item");
			payment=scan.nextInt();	
			totalPayment=totalPayment+payment;
			
			
			if (totalPayment>price) {
				
				change=totalPayment-price;
				System.out.println("Here is your change of $"+change);
				break;
			
			} else if (totalPayment<price) {
				balance=price-totalPayment;
				System.out.println("Please pay additional "+balance);
				
			}
			
		}while (totalPayment!=price);
		System.out.println("Thank you for shopping with us");
					
			
		}
				}
		
	
		
	


