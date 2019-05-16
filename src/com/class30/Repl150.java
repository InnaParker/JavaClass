package com.class30;

import java.util.ArrayList;

public class Repl150 {

	public static void main(String[] args) {
		/* Create an ArrayList and modify it by removing every other 
		* element in the list, starting with removing the 0th element.
		* Add these values below to your arraylist: "hi" "yo" "sup" "yolo" 
		* "boop". Use an advanced for loop to print the new values to the 
		* array list. Output:  yo yolo  */

		ArrayList<String> words = new ArrayList<String>();
		words.add("hi");
		words.add("yo");
		words.add("sup");
		words.add("yolo");
		words.add("boop");
		
		words.remove(0);
		words.remove(1);
		words.remove(2);

		for (String str : words) {
			
			System.out.println(str);
		}
		
	}

}
