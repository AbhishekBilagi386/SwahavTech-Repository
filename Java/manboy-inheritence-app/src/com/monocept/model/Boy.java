package com.monocept.model;

public class Boy extends Man {
	static {
		System.out.println("Boy Class Static block executed");
	}

	@Override
	public void play() {
		super.play();
		System.out.println("boy plays");
	}
	public void eats() {
		System.out.println("boy eats");
	}
	public Boy() {
		System.out.println("Boy's Class Constructor");
		//super();
	}

}
