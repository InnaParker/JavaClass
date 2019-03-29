package com.class11;

public class Repl65 {

	public static void main(String[] args) {
		
		// Write a program that prints total number of elements that are negative and odd

		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		
		int negOdd=0;
		
		for (int i=0; i<a.length; i++) {
			
			for (int y=0; y<a[i].length; y++) {
				if ((a[i][y]<0) && (a[i][y]%2!=0)) {
					negOdd=negOdd+1;	
				}
			}
		}
		System.out.println(negOdd);
		
	}

}
