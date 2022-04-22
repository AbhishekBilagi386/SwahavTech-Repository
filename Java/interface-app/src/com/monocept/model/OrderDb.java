package com.monocept.model;

public class OrderDb implements IDataAccessible {

	@Override
	public void read() {
		System.out.println("order read the object");
	}

	@Override
	public void create() {
		System.out.println("order created the object");		
	}

	@Override
	public void update() {
		System.out.println("order updated the object");
	}

	@Override
	public void delete() {
		System.out.println("Order deleted the object");
	}

}
