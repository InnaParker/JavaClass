package com.class11;

public class Repl61 {

	public static void main(String[] args) {

		// Write a program to sum the elements in the third row.
			

		{
			int[][] a = { { 5, 2, 3, 7 }, 
					{ 1, 5, 2, 2 }, 
					{ 1, 2, 3, 4 } };

			// should print 10
			int sum=0, row=2;
			
			for (int i=0; i<a[row].length; i++) {
				sum=sum+a[row][i];		
					
				}
			System.out.println(sum);
			}
		}

	}

