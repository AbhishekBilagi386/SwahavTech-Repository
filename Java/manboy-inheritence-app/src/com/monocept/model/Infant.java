package com.monocept.model;

public class Infant extends Man {
	static {
		System.out.println("Infant Class Static block executed");
	}
	public void play() {
		System.out.println("Infant plays");
	}

}
