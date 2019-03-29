package com.reviews;

public class Session5 {
	
	/* Task 1
	 * write program that prints following pattern
	 * 1 2 3 4 5 6 7 8 9 10
	 * 2 4 6 8 10 12 14 16 18 20
	 * 3 6 9 12 15 18 21 24 27 30
	 * 4 8 12 16 20 24 28 32 36 40
	 * 5 10 15 20 25 30 35 40 45 50
	 */

	public static void main(String[] args) {
		
		//for (int i=1; i<=5; i++) {
			
		//	for (int y=1; y<=10; y++)
		//		System.out.print(i*y+" ");
		//	}
		//	System.out.println();

		/* Task 2
		 * write a program that prints following pattern
		 * ....1
		 * ...22
		 * ..333
		 * .4444
		 * 55555
		 */
		
		//1 to 5
		//1 to 5-i
		//1 to i
		
		
		//for (int a=1; a<=5; a++) {
			
		//	for (int b=1; b<=(5-a); b++) {
		//		System.out.print(".");
				
		//	}
		//	for (int c=1; c<=a; c++) {
		//		System.out.print(a);
		//		
		//	}
		//	System.out.println();
		//	}
		
		/* Task 3
		 * write a program that prints following pattern
		 * ....1
		 * ...2
		 * ..3
		 * .4
		 * 5
		 */

		//for (int a=1; a<=5; a++) {
			
		//	for (int b=1; b<=(5-a); b++) {
		//		System.out.print(".");
				
		//	}
		//		System.out.println(a);
				
		//	}
	
		/* Task 4
		 * write a program that prints following pattern
		 * ....1
		 * ...2.
		 *..3..
		 * .4...
		 * 5....
		 */
		
		
		/* Task 5 - arrays
		 * Write a program to sum the values of an array
		 */
		
		//int[] numbers={1,2,3,4,5,6,7,8,9,10};
		//or
		//int[] numbers1=new int[10];
		
		//	int sum=0;
			
		//	for (int a=0; a<numbers.length; a++) {
		//		sum+=numbers[a];
				//or
				//sum=sum+numbers[a];
				
		//	}
		//System.out.println(sum);
		
		/* Task 6 - arrays
		 * Write a program to test if an array contains a specific value.
		 * Use boolean. Look for value 6.
		 */
		
		
		int[] numbers={1,2,3,4,5,6,7,8,9,10};
		
		boolean found=false;
		
		for (int i=0; i<10; i++) {
			
			if (numbers[i]==6) {
				found=true;    //flag
				break;	
			}
		}
		if (found==true) {
			System.out.println("The array contains the value 6");
		}else {
			System.out.println("The array does not contain the value 6");
		}
}
}



