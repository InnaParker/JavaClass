package com.class16;

public class Computer {
	
	boolean mouse, keyboard;
	int screen, ram;
	String os, brand;
	
	public static void main(String[] args) {
		
		Computer comp1=new Computer();
		
		comp1.keyboard=true;
		comp1.mouse=true;
		comp1.screen=2;
		comp1.ram=8;
		comp1.os="Windows";
		comp1.brand="HP";
		
		comp1.watchMovie();
		comp1.doJavaCoding();
		comp1.playMusic();
		
		Computer comp2=new Computer();
		System.out.println("---------------------------------------");
		
		comp2.keyboard=true;
		comp2.mouse=false;
		comp2.screen=4;
		comp2.ram=6;
		comp2.os="Mac OS";
		comp2.brand="Apple";
		
		comp2.watchMovie();
		comp2.doJavaCoding();
		comp2.playMusic();
		
	}
	void watchMovie() {
		System.out.println("I can watch a movie on my "+brand+" computer");
	}
	void doJavaCoding() {
		System.out.println("I can do Java coding on my "+brand+ " computer");
	}
	void playMusic() {
		System.out.println("I am going to play music on my "+brand+ " computer");
	}
	
	

}
