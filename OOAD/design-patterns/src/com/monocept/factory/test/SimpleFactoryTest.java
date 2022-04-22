package com.monocept.factory.test;

import com.monocept.factory.AutoMobileFactory;
import com.monocept.factory.AutoType;
import com.monocept.factory.IAutoMobile;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		AutoMobileFactory factory = AutoMobileFactory.getInstance();

		IAutoMobile product = factory.make(AutoType.Tesla);
		product.start();
		product.stop();
		System.out.println(product.getClass());
		System.out.println();

		IAutoMobile product1 = factory.make(AutoType.Audi);
		product1.start();
		product1.stop();
		System.out.println(product1.getClass());
		System.out.println();

		IAutoMobile product2 = factory.make(AutoType.BMW);
		product2.start();
		product2.stop();
		System.out.println(product2.getClass());
	}

}
