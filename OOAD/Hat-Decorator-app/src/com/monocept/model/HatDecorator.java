package com.monocept.model;

public abstract class HatDecorator implements IHat {
	protected IHat hat;
	protected String name;

	public HatDecorator(IHat hat) {
		this.hat = hat;
	}

	@Override
	public String getName() {
		return hat.getName();
	}
}
