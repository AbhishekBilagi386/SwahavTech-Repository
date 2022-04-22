package com.monocept.model;

public class Account {
	private final int accountNum;
	private final String name;
	protected double balance;
	public static final int minBalance = 500;

	public Account(int accNo, String name) {
		this(accNo, name, minBalance);
	}

	public Account(int accNum, String name, double balance) {
		this.accountNum = accNum;
		this.name = name;
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if ((balance - amount) >= minBalance)
			balance -= amount;
		else
			throw new InsufficientFundsException(this);
	}

	public String getName() {
		return name;
	}

	public int getAccountNum() {
		return this.accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

}
