package com.class15;

public class IQ5 {

	public static void main(String[] args) {
		
		//Write a Java program to reverse string. Reverse string word by word.
		
		String sentence="The master is speaking";
		String reverse="";
		
		for (int i=sentence.length()-1; i>=0; i--) {
			reverse=reverse+sentence.charAt(i);
		}
		System.out.println(reverse);
		
		String[]words=reverse.split(" ");
		
		for (int i=words.length-1; i>=0; i--) {
			System.out.println(words[i]+" ");
		}
	}

}
