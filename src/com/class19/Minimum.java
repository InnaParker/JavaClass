package com.class19;

public class Minimum {
	
	/* Create a class Called Minimum, within it crate a method called minOfValues.
	* make it static. From your previous Applications class call the method and pass 
	* an array argument and print out the result*/

	
	static int minOfValues(int[] x) {
		
		int min=x[0];// or int min=Integer.MAX_VALUE;
		for (int y: x) {
			
			if (y<min) {
				min=y;
				
			}
		}
		return min;
	}
	static int maxOfValues(int[] x) {
		int max=Integer.MAX_VALUE;
		for (int y: x) {
			
			if (y>max) {
				max=y;
				
			}
		}
		return max;
		
	}

}
