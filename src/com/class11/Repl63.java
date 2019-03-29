package com.class11;

public class Repl63 {

	public static void main(String[] args) {

		/*
		 * Write a program that checks if a 2-D integer array is a square array,
		 * meaning, if its rows and columns are equal. Hint:
		 * 
		 * int[][] a = { {1,1,1}, 
		 * 				{1,1,1}, 
		 * 				{1,1,1} };
		 * 
		 * //should be true
		 * 
		 * int[][] b = { {1,1,1,1}, 
		 * 				{1,1,1,1}, 
		 * 				{1,1,1,1} };
		 * 
		 * //should be false
		 */

		int[][] a = { { 1, 1, 1 }, 
					{ 1, 1, 1 }, 
					{ 1, 1, 1 } };

		int row = 0, column = 0;

		for (int i = 0; i < a.length; i++) {
			row++;

			if (a.length == a[i].length) {
				column++;
			}
		}
		if (row==column) {
			System.out.println("true");
		}

	}
}
