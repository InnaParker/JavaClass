package com.class16;

public class Car { //template for class - car
	
	String make, model, color;
	int door, wheels;
	
	public static void main(String[] args) {
		
		//ClassName variableName=new ClassName();
		
		
		Car car1=new Car();	//new Car is creating object and assigns it to variable car1
		
		// Object 1
		
		car1.make="Honda";
		car1.model="Civic";
		car1.color="Black";
		car1.door=4;
		car1.wheels=4;
		
		System.out.println("Car "+car1.make+" has "+car1.wheels+" wheels");
		
		car1.drive();
		car1.reverse();
		car1.stop();
		
		// Object 2
		
		Car car2=new Car();
		car2.make="Tesla";
		car2.model="X";
		car2.color="Blue";
		car2.door=4;
		car2.wheels=4;
		
		System.out.println("My car is "+car2.color+" "+car2.make);
		
		car2.drive();
		car2.reverse();
		car2.stop();
		
	}
	
	//Write your own methods for objects outside of Main Method!
	
	void drive() {
		System.out.println("Car can drive");
		
	}

	void reverse() {
		System.out.println("Car can reverse");
		
	}
	void stop() {
		System.out.println("Car can stop");
	}

}
