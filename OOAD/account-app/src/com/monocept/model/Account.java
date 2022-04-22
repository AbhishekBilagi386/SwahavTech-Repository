package com.monocept.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Account {
	private int accountNum;
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1);
	private String name;
	private double bal;
	private double minBalance = 500;
	private List<Transaction> transactions = new ArrayList<Transaction>();

	public Account(String name, int bal) {
		accountNum = ID_GENERATOR.getAndIncrement();
		this.bal = bal;
		this.name = name;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public String getName() {
		return name;
	}

	public int getAccountNum() {
		return this.accountNum;
	}

	public double getBalance() {
		return bal;
	}

	public void deposit(double amount) {
		bal = bal + amount;
		Transaction deposit = new Transaction(amount, TransactionType.deposit);
		transactions.add(deposit);
	}

	public void withdraw(int amount) {
		if (this.bal - amount > minBalance) {
			this.bal = bal - amount;
			Transaction withdraw = new Transaction(amount, TransactionType.withdraw);
			transactions.add(withdraw);
		}
	}
}
