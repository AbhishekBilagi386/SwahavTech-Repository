package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// caseStudy1();
		// System.out.println();
		try {
			caseStudy2();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static void caseStudy2() {
		Account acc = new Account(102, "sourabh", 5000);
		acc.deposit(5000);//deposit
		acc.withdraw(4501.0);
		printDetails(acc);
	}

	public static void caseStudy1() {
		Account acc = new Account(101, "Abhishek", 5000);
		acc.withdraw(450.0);
		printDetails(acc);
	}

	private static void printDetails(Account account) {
		System.out.println("Account number: " + account.getAccountNum() + " Name: " + account.getName() + " balance:"
				+ account.getBalance());
	}

}
