package com.monocept.model;

public class RibbonedHat extends HatDecorator implements IHat {

	public RibbonedHat(IHat hat) {
		super(hat);
	}

	@Override
	public double getPrice() {
		return 100 + hat.getPrice();
	}

	@Override
	public String getDiscription() {
		return "Ribboned Hat " + hat.getDiscription();
	}

}
