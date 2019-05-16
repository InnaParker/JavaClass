package com.class09;

public class Clock {

	public static void main(String[] args) {
		
		//24 hours, 60 minutes
		
		for (int h=0; h<24; h++) {
			
			for (int m=0; m<60; m++) {
				
				if (m<10) {
					System.out.println("0"+h+":0"+m);
					
				}else {
					System.out.println("0"+h+":"+m);
				}
					
				System.out.println(h+":"+m);
			}
		}

	}

}
