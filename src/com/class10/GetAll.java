package com.class10;

public class GetAll {

	public static void main(String[] args) {
		
		
		String[] names= {"John", "Mike", "Jane", "Mary", "Tom", "Olga"};
		
	//	int a=3;
		
	//	System.out.println(names[a]);
		
	//	a+=2;
		
	//	System.out.println(names[a]);
		
	//	a-=4;
		
	//	System.out.println(names[a]);
		
		int size=names.length;
	//	System.out.println(size);
		
		//System.out.println(names[0]);
		//System.out.println(names[1]);
		//System.out.println(names[2]);
		
		for (int i=0; i<size; i++) {
			System.out.println(names[i]);
		}
	}

}