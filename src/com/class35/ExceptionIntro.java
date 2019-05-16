package com.class35;

import java.util.ArrayList;
import java.util.List;

public class ExceptionIntro {

	public static void main(String[] args) {
	
		int a=10;
		int b=0;
		
		System.out.println(a/b);
		
		//What happens behind scenes - object gets created and is thrown to the program
		
		ArithmeticException exception=new ArithmeticException();
		throw exception;
		
		//List<Object>fixedData = new ArrayList<>();
		
		
		
	}

}
