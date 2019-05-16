package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCreditCard {

	public static void main(String[] args) {
		
		CreditCard visa=new Visa("Visa Platinum");
		CreditCard ax=new AX("AX Rewards");
		CreditCard mc=new MasterCard("MC basic");
		
		ArrayList<CreditCard> alist=new ArrayList<>();
		alist.add(visa);
		alist.add(mc);
		alist.add(ax);
		
		// How do we get a name of each card
		
		for(CreditCard card:alist) {
			System.out.println(card.ccName);
			card.intRate();
			
			//how can we print an interset rate of each card
			Iterator<CreditCard> myIterator=alist.iterator();
			while(myIterator.hasNext()) {
				CreditCard obj=myIterator.next();
				obj.intRate();
			}
			System.out.println("--------");
			//how to print an annual fee of each card
			for (int i=0; i<alist.size(); i++) {
				CreditCard obj=alist.get(i);
				obj.annualFee();	
		}

	}

	}
}
