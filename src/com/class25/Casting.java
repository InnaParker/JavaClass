package com.class25;

public class Casting {

	public static void main(String[] args) {
		
	//Implicit or automatic/widening conversion casting(smaller to bigger)
	//compiler takes care of conversion
		double a=10;
		System.out.println(a);

	//Explicit/Manual/Narrowing conversion - programmer takes care of it.
		//int b=10.0;
		//int c=(int)b;
		
		int i=130;
		//byte by=130; - compiler will not allow.
		
		byte by=(byte)i;
		System.out.println(by);
		
		//UpCasting - done by compiler
		Payment pay=new MasterCard();
		
		//DownCasting - done manually
		//Visa visa=new Payment(); - not allowed!
		MasterCard mc=(MasterCard)new Payment();
		
		
	}

}
