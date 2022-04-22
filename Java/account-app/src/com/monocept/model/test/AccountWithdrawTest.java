package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountWithdrawTest {

	public static void main(String[] args) {
		Account acc1 = new Account(10, "Asha");
		Account acc2 = new Account(102, "Ramya", 1500);
		printDetails(acc1);
		printDetails(acc2);
		acc1.withdraw(500);
		printDetails(acc1);
		acc1.withdraw(200);
		printDetails(acc2);
	}

	public static void printDetails(Account acc) {
		System.out.println(
				"Account no.: " + acc.getAccountNum() + ", Name: " + acc.getName() + ", Balance: " + acc.getBalance());
	}

}
