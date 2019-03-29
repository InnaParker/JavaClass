package com.class11;

public class Task7 {

	public static void main(String[] args) {
		
		/* create an array of cars: american, german, korean, italian.
		 * Then retrieve all values from that array.
		 */

		String[][] cars= { 
				{"Ford", "Chevy", "Cadillac"},
				{"Audi", "BMW","Mercedes"},
				{"Hyundai", "Kia"}, 
				{"Maserati","Lamborghini", "Alfa Romeo"}
				};
		
		for (int i=0; i<cars.length; i++) {
			
				for (int j=0; j<cars[i].length; j++) {
				
				System.out.print(cars[i][j]+" ");
	}
				System.out.println();
}
}}
