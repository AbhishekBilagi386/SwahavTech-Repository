package com.monocept.streams.test;

import java.util.Arrays;
import java.util.Comparator;

import com.monocept.model.Account;

public class CasetStudy4Test {

	public static void main(String[] args) {
		Account[] accounts = { new Account(101, "Abhishek", 5000), new Account(102, "Vineet", 3000),
				new Account(103, "Rohan", 10000), new Account(104, "Himanshu", 15000) };
		
		Account acc = Arrays.stream(accounts)
							.max(Comparator.comparing(Account :: getBalance)).get();
		System.out.println(acc);
		
		Arrays.stream(accounts)
				.filter(n->n.getName().length()>6)
				.forEach(n-> {
					System.out.println(n.getName());
				});
		
		Double sum1 = Arrays.stream(accounts)
							.mapToDouble(n1-> n1.getBalance())
							.sum();
		System.out.println(sum1);
	}

	public static int sortByHighBalance(String b1, String b2) {
		return b1.compareTo(b2);

	}

}
