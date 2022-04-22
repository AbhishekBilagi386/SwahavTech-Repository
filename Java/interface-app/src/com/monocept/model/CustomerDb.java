package com.monocept.model;

public class CustomerDb implements IDataAccessible {

	@Override
	public void read() {
		System.out.println("Customer read the object");
	}

	@Override
	public void create() {
		System.out.println("Customer created the object");
	}

	@Override
	public void update() {
		System.out.println("Customer updated the object");
	}

	@Override
	public void delete() {
		System.out.println("Customer Deleted the object");
	}

}
