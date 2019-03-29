package com.class7;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		//3 ways to add/subtract
		
		int x=1;
		x=x+1;
		System.out.println(x);

		int y=1;
		y+=1;
		System.out.println(y);
		
		int z=1;
		z++;
		System.out.println(z);
		
		int w=2;
		w++;
		System.out.println(w);
		
		int v=10;
		v--;
		System.out.println(v);
		
		int a=10;
		int b=++a; //pre-increment = 1st increment then assign
		
		int c=10;
		int d=c++; //post-increment = 1st assign then increment
		
		System.out.println(c);
		System.out.println(d);
		
		int q=100;
		int e=q--;
		System.out.println(e);
		
		int h=50;
		int g=--h;
		System.out.println(h);
		System.out.println(g);
		
		
	}

}
