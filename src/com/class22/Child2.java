package com.class22;

public class Child2 extends Parent{
	
public static void main(String[] args) {
		
		Child2 childObj2=new Child2();
		
		System.out.println("Child 2 eye color "+childObj2.eyeColor);
		System.out.println("Child 2 hair color "+childObj2.hairColor);
		System.out.println("Child 2 has "+childObj2.nose+ " nose");
		
		childObj2.canSwim();
}

	public void canSwim()
{
	System.out.println("Child 2 can swim");
}
}

