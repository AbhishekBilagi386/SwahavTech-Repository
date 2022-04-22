package com.monocept.product.factory;

public class BmwFactory implements IAutoFactory  {
	private static BmwFactory instance;
	@Override
	public IAuto make() {
		IAuto auto = new BMW();
		return auto;
	}

	public static BmwFactory getInstance() {
		if (instance == null) {
			instance = new BmwFactory();
		}
		return instance;
	}

}
