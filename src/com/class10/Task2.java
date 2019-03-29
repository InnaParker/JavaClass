package com.class10;

public class Task2 {

	public static void main(String[] args) {
		
		/* Create an array of names and store all names of your group. 
		 * Then print your name from that array. (use 2 different ways 
		 * of creating an array).
		 */

		String[] names=new String[5];
		
		names[0]="Aliaksey";
		names[1]="Toly";
		names[2]="Inna";
		names[3]="Sheyh";
		names[4]="Muhammad";
		
		System.out.println(names[2]);
		
		String[] array1= {"Aliaksey", "Toly", "Inna", "Sheyh", "Muhammad"};
		
		System.out.println(array1[2]);
	}

}
