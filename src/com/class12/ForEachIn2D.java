package com.class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		
		// create a grocery list {{ fruits, veggies, dairy.
		// retrieve all values using 2 different loops.
		
		String[][] food= {
				{"Fruits:","banana", "watermelon","mango"},
				{"Veggies:","cucumber","avocado","mushrooms"},
				{"Dairy:","milk","kefir","buttermilk"}
		};
		
		for (String[] list:food) { 
			
			for (String all:list) {  
				
			System.out.print(all+" ");
			}
			System.out.println();
		}
		
		//2nd way
		
		for (int i=0; i<food.length; i++) {
			
			for (int y=0; y<food[i].length; y++) {
				System.out.print(food[i][y]+" ");
			}
			System.out.println();
		}

	}

}
