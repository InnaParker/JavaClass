package com.class33;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class EntrySet {

	public static void main(String[] args) {
		
		Map<String, Integer> classMap=new LinkedHashMap<>();
		classMap.put("Table", 20);
		classMap.put("Chair", 60);
		classMap.put("Screen", 3);
		classMap.put("Student", 60);
		classMap.put("Instructor", 3);
		
		System.out.println(classMap);
		for (Map.Entry<String, Integer> entry:classMap.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		System.out.println("==========Using Iterator==========");
		Iterator<Map.Entry<String, Integer>> classRoomIt=classMap.entrySet().iterator();
		while(classRoomIt.hasNext()) {
			Map.Entry<String, Integer> me=classRoomIt.next();
			System.out.println(me.getKey()+"="+me.getValue());
		}
	}

}
