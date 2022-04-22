package com.monocept.model;

public class SavingsAccount extends Account{
	private static final int minBal = 500;
	public SavingsAccount(int accNo, String name, int bal) {
		super(accNo, name, bal);
		
	}
	@Override
	public void withdraw(double amount) {
		if(this.bal-amount>minBal)
			this.bal = this.bal - amount;
	}
}
