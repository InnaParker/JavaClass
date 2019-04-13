package com.class22;

public class Child1 extends Parent{

	
	
	public static void main(String[] args) {
		
		Child1 childObj=new Child1();
		
		System.out.println("Child 1 eye color "+childObj.eyeColor);
		System.out.println("Child 1 hair color "+childObj.hairColor);
		System.out.println("Child 1 has "+childObj.nose+ " nose");
		
		childObj.sing();
		
		Parent parentObj=new Parent();
		//parentObj.hairColor;    //cannot access thru the parent property or behavior of the child
		
	}
		public void playTennis()
		{
			System.out.println("Child 1 can play tennis");
		}
}
