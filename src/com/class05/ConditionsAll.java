package com.class05;

import java.util.Scanner;

public class ConditionsAll {

	public static void main(String[] args) {
		
		/* ask user to enter price and boolean value (is sale going on?)
		 * based on the sale will check the price:
		 * if price < 20 = apply 20% discount and give final price
		 * if price >20 and less then 100 = apply 30%
		 * if price >100 and less then  apply 50%
		 */

		Scanner scan;
		boolean sale;
		int discount;
		int price;
		double finalPrice;
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter if there is a sale?");
		sale=scan.nextBoolean();
		
		
		if (sale) {
			System.out.println("Please enter price of the item");
			price=scan.nextInt();
			
			System.out.println("Let's check all discounts");
			
			if (price<20) {
				discount=20;
				finalPrice=price-(price*0.2);
				
				
			}else if (price>=20 && price<100) {
				discount=30;
				finalPrice=price-(price*0.3);
				
				
			}else if (price>=100 && price<500) {
				discount=50;
				finalPrice=price-(price*0.5);
				
				
			}else {
				discount=75;
				finalPrice=price-(price*0.75);
				
				
			}
				System.out.println("Final price is " +finalPrice);
		}else {
			System.out.println("Not interested");
		}
		
		
		
		
	}

}
