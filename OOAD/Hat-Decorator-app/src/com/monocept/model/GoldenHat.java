package com.monocept.model;

public class GoldenHat extends HatDecorator implements IHat {

	public GoldenHat(IHat hat) {
		super(hat);
	}

	@Override
	public double getPrice() {
		return 300 + hat.getPrice();
	}

	@Override
	public String getDiscription() {
		return "Golden coloured " + hat.getDiscription();
	}

}
