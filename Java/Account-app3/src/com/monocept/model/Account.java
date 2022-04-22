package com.monocept.model;

public class Account {
	private final int accountNum;
	private final String name;
	private double balance;
	private static int minBalance = 500;

	public Account(int accNo, String name) {
		this(accNo, name, minBalance);
	}

	public Account(int accNum, String name, double balance) {
		this.accountNum = accNum;
		this.name = name;
		this.balance = balance;
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
	@Override
	public String toString() {
		return "Name: "+name+ "\nAccount num: " +accountNum+ "\nBalance: " +balance+ "\n"+super.toString();
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
            return true;
		if (obj == null|| this.getClass() != obj.getClass())
	            return false;
	 
	        Account acc = (Account)obj;
	        return this.name.equals(acc.name) 
	        		&& this.accountNum == acc.accountNum 
	        		&& this.balance == acc.balance;
	}
}
