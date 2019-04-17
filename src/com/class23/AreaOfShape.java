package com.class23;

public class AreaOfShape {
	
	public void area(int a, int b)
	{
		System.out.println("Area of a rectangle");
		System.out.println(a*b); //multiply width by length
	}
	
	public void area(double a)
	{
		System.out.println("Area of a square");
		System.out.println(a*a); //width*width
	}
	
	public void area(int a)
	{
		System.out.println("Area of a cube");
		System.out.println((a*a)*6);  //width*length*height
	}
	
	

}
