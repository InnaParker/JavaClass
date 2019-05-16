package com.class26;

public class Car {
	
	public void drive()
	{
		System.out.println("Car can drive");
	}
	
	public void drive(int speed)
	{
		System.out.println("Car drives with speed of "+speed+" miles per hour");
	}

}

class BMW extends Car {
	
	public void drive()
	{
		System.out.println("BMW car drives fast");
	}
}

class Toyota extends Car {
	
	public void drive()
	{
		System.out.println("BMW car drives safe");
	}
}
