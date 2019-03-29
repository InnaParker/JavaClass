package com.class11;

public class Task6 {

	public static void main(String[] args) {
		
		/*Create a 2D array that first row will contain 4 names and 
		 * second row will contain grades. Then you program should 
		 * print name of the students that has as an A and B grade
		 */


		String[][] names= {
				{"Mary","Jordan","John","Natali"},
				{"A","B","C","D","E"}
				};

		System.out.println(names[0][1]+"'s grade is "+names[1][0]);
		System.out.println(names[0][3]+"'s grade is "+names[1][1]);
}
	}


