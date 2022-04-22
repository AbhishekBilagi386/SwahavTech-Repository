package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account acc1 = new Account(101, "Abhi", 1000);
		System.out.println(acc1.getCounter());
		System.out.println(Account.headCount());
		System.out.println();

		Account acc2 = new Account(102, "Himanshu");
		System.out.println(acc2.getCounter());
		System.out.println(Account.headCount());
		System.out.println();

		Account acc3 = new Account(103, "Zawed");
		System.out.println(acc3.getCounter());
		System.out.println(Account.headCount());
	}

}
