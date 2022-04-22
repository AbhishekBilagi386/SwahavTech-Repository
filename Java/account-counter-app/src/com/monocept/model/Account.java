package com.monocept.model;

public class Account {
	private final int accountNum;
	private final String name;
	private double balance;
	private static int minBalance = 500;
	private static int counter;
	private static int headCount;

	public Account(int accNo, String name) {
		this(accNo, name, minBalance);
	}

	public Account(int accNum, String name, double balance) {
		System.out.println("Inside the Constructor");
		this.accountNum = accNum;
		this.name = name;
		this.balance = balance;
		counter++;
		headCount++;
	}

	static {
		System.out.println("Inside static block");
		counter = 100;

	}

	private double validateTransaction(double amount) {
		double transaction = balance - amount;
		if (transaction < minBalance) {
			return balance;
		}
		return transaction;
	}

	public void withdraw(int amount) {
		this.balance = validateTransaction(amount);
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

	public int getCounter() {
		return counter;

	}

	public static int headCount() {
		return headCount;

	}

}
