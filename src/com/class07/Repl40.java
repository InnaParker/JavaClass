package com.class07;

public class Repl40 {

	public static void main(String[] args) {
		
		/* Print 1 to 10 Numbers except 7 ,8,9,5  using the While loop.
		 * Step 1: Initialize the i value as int i=1
		 * Step 2: Create the while loop to check the condition 
		 * Step 3: Write the if condition for validation part
		 * Step 4 : It should print */
		
		int i=1;
		
		while (i<=10) {
			
			if (i!=5 && i!=7 && i!=8 && i!=9) {
				System.out.println(i);
			}
			i++;
		}
		

	}

}
