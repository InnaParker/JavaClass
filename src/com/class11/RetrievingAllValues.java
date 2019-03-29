package com.class11;

public class RetrievingAllValues {

	public static void main(String[] args) {
		
		int[][]num= {
				{11,12,13,14},
				{21,22,23,24},
				{31,32,33,34}
		};
		
		int rows=num.length;
		System.out.println(rows);  //gives number of rows
		
		int cols=num[1].length;
		System.out.println(cols);  //gives number of columns. 
		
		//to find number of columns go to each row
		
		for (int row=0; row<num.length; row++) {
			
			for (int col=0; col<num[row].length; col++) {
				System.out.print(num[row][col]+" ");
				
			}
			
		}
		
		
			}
		
		
	}


