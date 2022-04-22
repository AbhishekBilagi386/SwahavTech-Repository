package com.monocept.factory;

public class AutoMobileFactory {
	private static AutoMobileFactory instance;
	private static Object mutex = new Object();

	public static AutoMobileFactory getInstance() {
		AutoMobileFactory result = instance;
		if (result == null) {
			synchronized (mutex) {
				result = instance;
				if (result == null)
					instance = result = new AutoMobileFactory();
			}
		}
		return result;
	}

	public IAutoMobile make(AutoType type) {
		if (AutoType.Audi == type)
			return new Audi();

		if (AutoType.BMW == type)
			return new BMW();

		return new Tesla();
	}

}
