package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int num;
		num=10;
		
		int[] array1; //3 ways of declaring array, 1st is preferred way.
		int [] array2;
		int array3[];
		
		array1=new int[4]; //creating (initializing) array with 4 values
		
		array1[0]=10;		//assigning values
		array1[1]=20;
		array1[2]=30;
		array1[3]=40;
		
		//access values
		
		System.out.println(array1[2]);
		
		//2nd way to create an array
		
		int[] numbers=new int[3]; //declare an initialize on the same line
		
		numbers[0]=5;
		numbers[1]=10;
		numbers[2]=15;
		
		System.out.println(numbers[0]+numbers[2]); //can use arithmetic operators
		
		
		//array of strings
		
		String[] a=new String[3];
		a[0]="Hello";
		a[1]="Hi";
		a[2]="Bye";
		
		System.out.println(a[1]+ " friends");

	}

}
