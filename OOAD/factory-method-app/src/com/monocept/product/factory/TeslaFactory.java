package com.monocept.product.factory;

public class TeslaFactory implements IAutoFactory {
	private static TeslaFactory instance;
	@Override
	public IAuto make() {
		IAuto auto = new Tesla();
		return auto;
	}
	public static TeslaFactory getInstance() {
		if (instance == null) {
			instance = new TeslaFactory();
		}
		return instance;
	}

}
