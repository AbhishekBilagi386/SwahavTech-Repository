package com.monocept.model;

public class Man {
	static {
		System.out.println("Man Class Static block executed");
	}
	public void read() {
	System.out.println("Man reads");
		
	}
	public void play() {
		System.out.println("Man plays");
	}
	public Man() {
		System.out.println("Man's Class Constructor");
	}
	
}
