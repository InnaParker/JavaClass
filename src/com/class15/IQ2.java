package com.class15;

public class IQ2 {

	public static void main(String[] args) {
		
		/* 
		 * 
		 */

		int arr[] = {144,46,0,86,292,-1};
				
		int min=arr [0];				//144
		int secondLargest=0;	//144
		int largest=0;			//144
		
		for (int a:arr) {
			if (a>largest) {
				largest=a;
			}
			if (a<min) {
				min=a;
			}
		}
		
		for (int a: arr) {
			if (a>secondLargest && a<largest) {
				secondLargest=a;
			}
		}
		System.out.println("min= "+min);
		System.out.println("Second largest= "+secondLargest);
		System.out.println("Largest= "+largest);
	}

}
