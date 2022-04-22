package com.monocept.product.factory;

public class AudiFactory implements IAutoFactory {
	private static AudiFactory instance;
	@Override
	public IAuto make() {
		IAuto auto = new Audi();
		return auto;
	}

	public static AudiFactory getInstance() {
		if (instance == null) {
			instance = new AudiFactory();
		}
		return instance;
	}

}
