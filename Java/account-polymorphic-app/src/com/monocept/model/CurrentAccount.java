package com.monocept.model;

public class CurrentAccount extends Account {
	private static final int minBal = 500;
	public CurrentAccount(int accNo, String name, int bal) {
		super(accNo, name, bal);
		}
	@Override
	public void withdraw(double amount) {
		if(this.bal-amount> minBal)
			this.bal = this.bal - amount;
	}
}
