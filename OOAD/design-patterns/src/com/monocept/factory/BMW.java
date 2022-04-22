package com.monocept.factory;

class BMW implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("BMW Starts..");
	}

	@Override
	public void stop() {
		System.out.println("BMW Stops..");
	}

}
