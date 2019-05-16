package com.class32;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestInsurance {

	public static void main(String[] args) {
		
		Insurance obj1=new Car("Geico", "Honda");
		Insurance obj2=new Pet("State Farm", "Cat");
		Insurance obj3=new Health("Aetna");

		List<Insurance>insList=new ArrayList<>();
		insList.add(obj1);
		insList.add(obj2);
		insList.add(obj3);
		
		//for loop
		for(int i=0; i<insList.size(); i++) {
			System.out.println(insList.get(i).insuranceName);
		}
		//advance for loop
				for(Insurance ins:insList) {
					ins.getQuote();
				}
				//iterator
				Iterator<Insurance> it=insList.iterator();
				while(it.hasNext()) {
					it.next().cancelInsurance();
				}
}
}