package com.class34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CarTest {

	public static void main(String[] args) {
		// Create a map in which we will store car # and Car.
		
		Car car1=new Car("Toyota", "Corolla");
		Car car2=new Car("Honda", "Accord");
		Car car3=new Car("Lada", "Priora");
		
		car1.printCarDetails();
		car2.printCarDetails();
		car3.printCarDetails();
		
		Map<Integer, Car> carMap=new HashMap<>();
		carMap.put(1, new Car("BMW", "X8"));	//1st way to put car in the map
		carMap.put(2, new Car("Audi", "R8"));
		carMap.put(3, car3);					//2nd way to put car in the map
		
		System.out.println();
		Collection<Car> carValues=carMap.values();
		for (Car car:carValues) {
			car.printCarDetails();
		}
		

	}

}
