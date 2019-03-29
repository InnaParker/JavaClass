package com.class11;

public class Repl64 {

	public static void main(String[] args) {
		
		/* Write a program that  takes a 2-D array and prints the sums of the 
		 * rows as an integer array.
		 * For example, the if we run rowSums for the following 2D array:
		 * {1,1,2}, //sum = 4
  		 * {3,1,2}, //sum = 6
  		 * {3,5,3}, //sum = 11
  		 * {0,1,2}  //sum = 3
		 */
		
		int[][] a= {
				{1,1,2},
				{3,1,2},
				{3,5,3},
				{0,1,2}
		};
		
		int sum=0;
		
		for (int i=0; i<a.length; i++) {
			
			for (int y=0; y<a[i].length; y++) {
				sum+=a[i][y];
			}
			System.out.println(sum);
			sum=0;
			
			}	
		
	}
	

}
