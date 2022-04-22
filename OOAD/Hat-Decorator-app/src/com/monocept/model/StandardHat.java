package com.monocept.model;

public class StandardHat implements IHat {

	@Override
	public String getName() {
		return "Standard Hat";
	}

	@Override
	public double getPrice() {
		return 700;
	}

	@Override
	public String getDiscription() {
		return "Standard Hat";
	}

}
