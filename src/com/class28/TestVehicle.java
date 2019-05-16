package com.class28;

public class TestVehicle {

	public static void main(String[] args) {
		
		Car car=new BMW("BMW");
		car.drive();
		car.start();
		car.stop();
		
		Vehicle.displayTotal();
		
		System.out.println(Vehicle.vehicleCount);

		Car car1=new BMW("BMW");
		Car car2=new Toyota("Camry");
		
		System.out.println(car2.vehicleCount);
	}

}
