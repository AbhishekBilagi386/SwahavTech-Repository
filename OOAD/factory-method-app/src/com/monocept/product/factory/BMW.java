package com.monocept.product.factory;

public class BMW implements IAuto {

	@Override
	public void start() {
		System.out.println("BMW Starts");
	}

	@Override
	public void stop() {
		System.out.println("BMW Stops");
	}

}
