package com.reviews;

public class Session4 {

	public static void main(String[] args) {
		
		// write a program that prints number 18 decreasing in multiples of 3
		
	//	for (int a=18; a>=0; a-=3) {
			
		//		System.out.println(a);
			
		
		//do while loop
		
		int c=18;
		
		do {
			System.out.println(c);
			c-=3;
		}while (c>=0);
			
		
		//write a program that prints "I am feeling happy today" 10 times with for and while loop
		
		for (int happy=0; happy<10; happy++) {
			System.out.println("I am feeling happy today");
		}
		
		int happy1=1;  //boolean happy=true;
		
		while (happy1<=10) {   //
			System.out.println("I am feeling happy today");
			happy1++;
			
		}
		
		//write a program that prints the string "the time is 07:00 an then all the min till 7:30
		
		for (int time=0; time<=30; time++) {
			if (time<10) {
				System.out.println("the time is 07:0"+time);
			}
			System.out.println("the time is 07:"+time);
		}
		
		int min=0;
		while (min<=30) {
			if(min<10) {
				System.out.println("The tmie is 07:0"+min);
				min++;
			}else {
				System.out.println("The time is 07:"+min);
			}
			
			
			
		}
		}

	}


