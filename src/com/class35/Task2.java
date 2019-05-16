package com.class35;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/* Create a static method that will return a List of Exceptions. Inside your 
		 * method create objects of 4 exception classes and store them inside your list.
		 * Call your method inside main and print name and details of all Exception objects.
		 */
		List<Exception> exceptionList=getList();
		System.out.println(exceptionList.size());
		
		for(Exception singleException: exceptionList) {
			System.out.println(singleException);
		}
		
	}
	
	public static List<Exception> getList() {
		List<Exception> list=new ArrayList<>();
		
		// 1 try catch for Arithmetic Exception
		try {
			System.out.println(10/0);
			
		} catch (ArithmeticException ae) {
			list.add(ae);
			
		}
		// 2 try catch for ArrayOutOfbounds Exception
		int[] array = {12, 14};
		try {
			System.out.println(array[2]);
			
		} catch (ArrayIndexOutOfBoundsException aioe) {
			list.add(aioe);
		}
		// 3 try catch MismatchInputException
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		
		try {
			int num=scan.nextInt();
			
		} catch (InputMismatchException ime) {
			list.add(ime);
		}
		
		// 4 try catch for NullPointer Exception
		String str=null;
		try {
			System.out.println(str.length());
			
		} catch(NullPointerException npe) {
			list.add(npe);
		}
		
		return list;
	}
}
