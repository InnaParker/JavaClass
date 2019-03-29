package com.reviews;

public class Session6 {

	public static void main(String[] args) {

		// find the number of values above the value of 7.

		int[][] array = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };

		int count = 0;

		for (int[] inner : array) {
			for (int element : inner) {

				if (element > 7) {
					count++;
				}
			}
		}
		System.out.println("The number of all elements above 7 is " + count);

		// write a program to find average of row 2.

		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			sum += array[i][2];
		}
		System.out.println(sum / array.length);
		
		// Strings Review
		// Task:  
		/*Write a program that:
        * 1.Converts all the characters in the string to lower case and prints.
        * 2.Converts all the characters in the string to upper case and prints.
        * 3.Checks whether the string/paragraph starts and ends with the string or word "The" and prints.
        * 4.Counts the number of letter 'a' in the string/paragraph and prints.
        * 5.Prints the second half of the string/paragraph.
        * 6.Prints characters between the 10th and 20th indices(inclusive).
        * 7.Prints the string/Paragraph in reverse order.
        * 8.Clears/removes all white spaces or tabs on both ends and prints. */
		
		String para="The quick brown fox jumps over the lazy dog.";
		
		System.out.println(para.toLowerCase());			//1
		
		System.out.println(para.toUpperCase());			//2
		
		System.out.println(para.startsWith("The")); 	//3
		System.out.println(para.endsWith("The"));
		
		int count1=0;									//4
		for (int i=0; i<para.length(); i++) {
			if (para.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println(count1);
		
		System.out.println(para.substring(para.length()/2));//5
		System.out.println(para.substring(10,20)); 		//6
		
		for (int i=para.length(); i>=0; i--) {			//7
			
			System.out.println(para.charAt(i));
		}
		
		System.out.println(para.trim());		//8
	}

}
