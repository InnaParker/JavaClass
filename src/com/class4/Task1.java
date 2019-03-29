package com.class4;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		/* You are a loan specialist and you need to ask user what amount of loan needed.
		 * if loan is less then 20000 you would lend the money. otherwise you would reject it.
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("What is the amount you want to borrow");
		
		int amount=input.nextInt();
		
		if(amount<20000) {
			System.out.println("We will lend you money");
			
		}else {
			System.out.println("We will not lend you money");
			
		}
		
	}
}
