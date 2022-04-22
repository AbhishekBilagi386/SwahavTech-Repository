package com.monocept.product.factory;

public class Tesla implements IAuto {

	@Override
	public void start() {
		System.out.println("Tesla Starts");
	}

	@Override
	public void stop() {
		System.out.println("Tesla Stops");
	}

}
