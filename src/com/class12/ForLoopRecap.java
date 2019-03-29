package com.class12;

public class ForLoopRecap {

	public static void main(String[] args) {
		
		int[][] arr= {
				{1,2,3},
				{10,20,30},
				{100,200,300}
		};
		
		for (int[] singleArray:arr) {  //loop thru each element inside 2D array
			for (int numbers:singleArray) {  //loop thru each single array
				System.out.println(numbers);
			}
		}

	}

}
