package com.class14;

public class StringManipulations1 {

	public static void main(String[] args) {
		
		// 3. toCharArray() function converts string to array of characters
		
		String str="saturday";
		char[] array=str.toCharArray();

		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
			
		}
		
		for (char c:array) {
			System.out.println(c);
		}
		
		for (int j=array.length-1; j>=0; j--) {
			System.out.print(array[j]);
		}
	}

}
