package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountTransactionTest {

	public static void main(String[] args) {
		Account p1 = new Account("Abhishek", 5000);
		p1.withdraw(500);
		p1.deposit(1000);
		Account p2 = new Account("Rohan", 5000);
		p2.deposit(600);
		p2.withdraw(200);
		System.out.println(p1.getTransactions());
		System.out.println(p2.getTransactions());

	}

}
