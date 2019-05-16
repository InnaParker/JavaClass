package com.class31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfNumbers {

	public static void main(String[] args) {
		// Create array list of even numbers from 1-50.
		//Using Integer remove any number that is divisible by 5.
		
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=1; i<=50; i++) { //(int i=2;i<=50;i+=2) no if () 
			if(i%2==0) {
				list.add(i);
			}	
		}
		Iterator<Integer> it=list.iterator();
		
		while(it.hasNext()) {
			
			if(it.next()%5==0) {
				it.remove();
			}
		}
		System.out.println(list);
	}

}
