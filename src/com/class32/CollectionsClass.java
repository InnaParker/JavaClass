package com.class32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsClass {

	public static void main(String[] args) {
		
		ArrayList<Integer>integerList=new ArrayList<>();
		integerList.add(90);
		integerList.add(33);
		integerList.add(57);
		integerList.add(120);
		
		System.out.println("Collection before sorting "+integerList);
		
		// Class that works with collections (LIST SET QUEUE)
		Collections.sort(integerList); 
		System.out.println("Collection after sorting "+integerList);

		int[] integerArray= {12,57,979,1};
		
		//This class contains various methods for manipulating arrays
		Arrays.sort(integerArray);
		System.out.println("Array after sorting");
		
		for(int num:integerArray) {
			System.out.print(num+" ");
		}
		
	}

}
