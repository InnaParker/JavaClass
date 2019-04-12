package com.class21;

public class Car {
	
	public String color;   //null
	static int totalCars;  //0+1=1+1=2
	//boolean default value is - false
	

	public static void main(String[] args) {
		
		Car car1=new Car();
		car1.color="white";
		totalCars++;
		
		Car car2=new Car();
		car2.color="white";
		totalCars++;
		
		System.out.println("We made "+totalCars+ " cars");
	}

}
