package com.quiz2;

public class Q2 {

	public static void main(String[] args) {

		int a[][] = { { 1, 3, 4 }, {2,3}, { 7, 6, 5, 4, 3, 2, 1 }, { 9 }, { 8 } };

		int sum = 0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[0].length; j++) 
			{
				sum += a[i][j];
			}
		}
		System.out.println("sum=" + sum);

	}

}
