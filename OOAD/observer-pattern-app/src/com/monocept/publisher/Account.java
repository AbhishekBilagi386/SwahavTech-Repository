package com.monocept.publisher;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private final int accnum;
	private final String name;
	private double balance;
	private List<INotifier> notifiers = new ArrayList<INotifier>();
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

	public List<INotifier> getNotifier() {
		return notifiers;
	}

	public void withdraw(double amount) {
		if (this.balance - amount > minbalance) {
			this.balance = balance - amount;
			notifySubscriber();
		}
	}

	public double deposit(double amount) {
		balance = balance + amount;
		notifySubscriber();
		return balance;
	}

	public void registerNotifier(INotifier newNotifier) {
		this.notifiers.add(newNotifier);
	}

	private void notifySubscriber() {
		for (INotifier notify : notifiers) {
			notify.notify(this);
		}
	}
}
