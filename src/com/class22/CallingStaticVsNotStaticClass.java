package com.class22;

public class CallingStaticVsNotStaticClass {

	public static void main(String[] args) {
		
		StaticVsNotStatic obj=new StaticVsNotStatic();
		
		//Access non-static members
		System.out.println(obj.name);
		
		
		//Access static members by using classNamethey belong to
		System.out.println(StaticVsNotStatic.lastName);
		
		StaticVsNotStatic.getInfo1();

	}

	
}
