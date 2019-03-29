package com.class11;

public class FoodTask {

	public static void main(String[] args) {
		
		// 1st way
		
		String[][] food= {  //3 rows, 4 columns
				{"burger", "fries", "hot dog", "meatloaf"},
				{"lo mein", "fried rice","white rice"},
				{"biriyani", "korma", "naan","chick peas"} };
		
		
		for (int i=0; i<food.length; i++) {
			
			for (int j=0; j<food[i].length; j++) {//access 1st row and give me the length
				
				System.out.print(food[i][j]+" ");
				}
			System.out.println();
			}
		

	}

}
