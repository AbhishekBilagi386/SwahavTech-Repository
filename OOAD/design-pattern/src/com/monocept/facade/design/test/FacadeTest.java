package com.monocept.facade.design.test;

import com.monocept.facade.design.Foo;

public class FacadeTest {

	public static void main(String[] args) {
		Foo foo = new Foo();

		foo.createCustomer();
		foo.readCustomer();
		foo.updateCustomer();
		foo.deleteCustomer();
	}

}
