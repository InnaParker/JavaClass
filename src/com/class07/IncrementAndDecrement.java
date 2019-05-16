package com.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		// most used post increment and decrement - a++ and b--
		
		int a=299;
		int b=a++; //1st assign then increment (int b=1; a=a+1)
		System.out.println(a); //300
		System.out.println(b); //299
		
		int x=10;
		int y=x;
		System.out.println(x+" "+y);

		int z=10;
		int c=z--;
		
		System.out.println(z);
		System.out.println(c);
	}

}
