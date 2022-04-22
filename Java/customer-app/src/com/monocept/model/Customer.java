package com.monocept.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Customer {
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1001);

	private String Name, address;

	private int amount;
	private int customerID;

	public Customer(String name, String address, int amount) {
		customerID = ID_GENERATOR.getAndIncrement();
		this.Name = name;
		this.address = address;
		this.amount = amount;
	}

	public int getCustomerID() {
		return customerID;
	}

	public String getName() {
		return Name;
	}

	public String getAddress() {
		return address;
	}

	public int getAmount() {
		return amount;
	}

}
