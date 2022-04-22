package com.monocept.model.test;

import com.monocept.model.CustomerDb;
import com.monocept.model.DepartmentDb;
import com.monocept.model.FooChildDb;
import com.monocept.model.IDataAccessible;
import com.monocept.model.OrderDb;

public class PolymorphismTest {

	public static void main(String[] args) {
		doDbOperations(new CustomerDb());
		System.out.println();
		doDbOperations(new DepartmentDb());
		System.out.println();
		doDbOperations(new OrderDb());
		System.out.println();
		doDbOperations(new FooChildDb());
	}

	private static void doDbOperations(IDataAccessible obj) {
		System.out.println("Doing Database operations");
		obj.create();
		obj.read();
		obj.update();
		obj.delete();

	}

}
