package com.monocept.model;

public class Kid extends Man {
	static {
		System.out.println("Kid Class Static block executed");
	}
	public void play() {
		System.out.println("kid plays");
	}

}
