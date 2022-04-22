package com.monocept.model;

public class PremiumHat implements IHat {

	@Override
	public String getName() {
		return "Premium Hat";
	}

	@Override
	public double getPrice() {
		return 1200;
	}

	@Override
	public String getDiscription() {
		return "Premium Hat";
	}

}
