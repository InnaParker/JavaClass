package com.class30;

import java.util.ArrayList;

public class IntegerArrayLIst {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(90);
		
		numbers.set(2, 33);
		
		for (Integer num: numbers) {
			System.out.println(num);
		}

	}

}
