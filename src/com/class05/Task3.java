package com.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		/* write program to ask user enter daily sales amount, based on
		 * sales range commission will be different.
		 * Example: sales is <100 = com 2%, sales more than 100 less then 200 =5% */
		
		Scanner scan;
		int sales;
		int comm;
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter sales amount");
		sales=scan.nextInt();
		
		if(sales>0 && sales<100) {
			comm=2;
			
			
		}else if (sales>=100 && sales<200) {
			comm=5;
			
		}else if (sales>=200 && sales<500) {
			comm=10;
			
		}else if (sales>=500) {
			comm=20;
			
		}else {
			comm=0;
			
		}
		System.out.println("Your commission is " +comm);
				
	}

}
