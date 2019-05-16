package com.class30;

public class CollectionConcept {

	public static void main(String[] args) {
		
		int[] array= {};
		
		int[] intArray=new int[3];
		intArray[0]=10;
		intArray[1]=20;
		intArray[2]=30;
		
		System.out.println(intArray[2]);
		//or int num=intArray[2];
		//sop(num)
		
		for (int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
			
		}
		
		for(int number: intArray) {
			System.out.println(number);
		}
	}

}
