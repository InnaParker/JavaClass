package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class WordsArrayList {

	public static void main(String[] args) {
		// Create array list of words. Remove every word that ends with "e"
		// Use iterator.

		ArrayList<String> words = new ArrayList<String>();
		words.add("Java");
		words.add("Replace");
		words.add("Learning");
		words.add("Retrieve");
				
		Iterator<String> iterator=words.iterator();
		while(iterator.hasNext()) {
			String word=iterator.next();
			
			if(word.endsWith("e")) {
				iterator.remove();
			}
		}
		System.out.println(words);
	}

}
