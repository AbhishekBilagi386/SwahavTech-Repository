package com.monocept.model;

@SuppressWarnings("serial")
public class Account implements java.io.Serializable {
	private static final int minBal = 500;

	private final int accNo;
	private final String name;
	private double bal;

	public Account(int accNo, String name) {
		this(accNo, name, minBal);
	}

	public Account(int accNo, String name, int bal) {
		this.accNo = accNo;
		this.bal = bal;
		this.name = name;
	}

	public void deposit(double amount) {
		bal += amount;
	}

	public void withdraw(double amount) {
		if ((bal - amount) >= minBal)
			bal -= amount;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return bal;
	}

	public int getAccNum() {
		return accNo;
	}
}
