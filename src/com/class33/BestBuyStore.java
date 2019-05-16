package com.class33;

import java.util.LinkedHashMap;
import java.util.Map;

public class BestBuyStore {

	public static void main(String[] args) {
		/* Create a map of Best Buy store. Place item id and item name into it.
		 * Example (7664847 = Printer, 7879885= TV etc. Print all keys and values 
		 * from a Best Buy map using EntrySet.
		 */

		Map<Integer, String> bestBuy=new LinkedHashMap<>();
		bestBuy.put(7664847, "Printer");
		bestBuy.put(7879885, "TV");
		bestBuy.put(7660095, "Phone");
		bestBuy.put(7939885, "Computer");
		
		for (Map.Entry<Integer, String> get:bestBuy.entrySet()) {
			System.out.println(get.getKey()+"="+get.getValue());
		}
	}

}
