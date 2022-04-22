package com.monocept.product.factory;

public class Audi implements IAuto{

	@Override
	public void start() {
		System.out.println("Audi Starts");
	}

	@Override
	public void stop() {
		System.out.println("Audi Stops");
		
	}

}
