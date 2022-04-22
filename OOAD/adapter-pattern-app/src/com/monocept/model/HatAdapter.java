package com.monocept.model;

import com.monocpt.model.Hat;

public class HatAdapter implements Item {
	private Hat hat;

	public HatAdapter(Hat hat) {
		this.hat = hat;
	}

	public Hat getHat() {
		return hat;
	}

	@Override
	public String itemName() {
		return hat.getShortName();
	}

	@Override
	public double itemPrice() {
		return hat.getBasePrice();
	}
}
