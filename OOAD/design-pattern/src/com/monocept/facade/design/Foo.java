package com.monocept.facade.design;

public class Foo {
	private IDataAccessible read;
	private IDataAccessible create;
	private IDataAccessible update;
	private IDataAccessible delete;

	public Foo() {
		create = new DepartmentDb();
		read = new CustomerDb();
		update = new DepartmentDb();
		delete = new DepartmentDb();
	}

	public void createCustomer() {
		create.create();
	}

	public void readCustomer() {
		read.read();
	}

	public void updateCustomer() {
		update.update();
	}

	public void deleteCustomer() {
		delete.delete();
	}
}
