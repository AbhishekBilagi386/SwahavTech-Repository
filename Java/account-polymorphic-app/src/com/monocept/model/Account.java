package com.monocept.model;

public abstract class Account {
	protected int accNo;
	protected String name;
	protected double bal;

	public Account(int accNo, String name, int bal) {
		this.accNo = accNo;
		this.bal = bal;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAccountNum() {
		return this.accNo;
	}

	public double getBalance() {
		return bal;
	}

	public void deposit(double amount) {
		bal = bal + amount;
	}

	public abstract void withdraw(double amount);
}
