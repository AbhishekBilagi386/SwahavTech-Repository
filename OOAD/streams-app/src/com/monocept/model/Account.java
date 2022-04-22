package com.monocept.model;

public class Account {
	private final int accnum;
	private final String name;
	private double balance;
	public static int minbalance = 500;

	public Account(int accnum, String name, double balance) {
		this.accnum = accnum;
		this.name = name;
		this.balance = balance;
	}

	public int getAccnum() {
		return this.accnum;
	}

	public String getName() {
		return this.name;
	}

	public double getBalance() {
		return this.balance;
	}

	public void withdraw(double amount) {
		if (this.balance - amount > minbalance) {
			this.balance = balance - amount;
		}
	}

	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	@Override
	public String toString() {
		return "Id: " + getAccnum() + " name: " + getName() + " balance: " + getBalance();
	}

}
