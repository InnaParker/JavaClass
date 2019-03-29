package com.class11;

public class Recap {

	public static void main(String[] args) {
		
		// 1. Create an array of names that will hold 5 elements using new keyword
		
		String[] names=new String[7];
		
		names[0]="Asel";
		names[1]="Awet";
		names[2]="Arif";
		names[3]="Weqas";
		names[4]="Dzmitri";
		names[5]="Shiva";
		names[6]="Sandesh";
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}

		// 2. Create an array using array literal
		
		String[] studentNames= {"Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank"};
		
		//for (int y=0; y<=studentNames.length-1; y++) {
		//	System.out.println(studentNames[y]);
			
		//}
		
		// Retrieve values using: enhanced, advanced, for each loop
		// this loop only used with arrays or collections
		
		for (String student:studentNames) {
			System.out.println(student);
		}
		
	}

}
