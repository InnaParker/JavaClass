package com.class11;

public class Repl60 {

	public static void main(String[] args) {
		
		/*Write a program to double the values of every element in the array 
		 * and print it out.
		 */
		
		double[][]a= {
				{1.4, 2.0, 3.3, 2},
				{4, 1.5, 6.1, 1},
				{1.2, 3.1, 4, 1.6}
		};
		
		for (int i=0; i<a.length; i++) {
			
			for (int y=0; y<a[i].length; y++) {
				
				System.out.print(a[i][y]*2+" ");
			}
			System.out.println();
		}

	}

}
