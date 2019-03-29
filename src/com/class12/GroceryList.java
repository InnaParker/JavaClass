package com.class12;

public class GroceryList {

	public static void main(String[] args) {
		// 2nd way
		
		String[][] food= {
				{"Fruits:","banana", "watermelon","mango"},
				{"Veggies:","cucumber","avocado","mushrooms"},
				{"Dairy:","milk","kefir","buttermilk"}
		};
		
			for (int i=0; i<food.length; i++) {
			
				for (int y=0; y<food[i].length; y++) {
				System.out.print(food[i][y]+" ");
			}
			System.out.println();
		}

	}

}
