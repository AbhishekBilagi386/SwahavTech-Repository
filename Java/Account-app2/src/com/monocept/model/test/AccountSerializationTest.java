package com.monocept.model.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.monocept.model.Account;

public class AccountSerializationTest {

	public static void main(String[] args) {

		Account account[] = new Account[] { 
				new Account(101, "Abhi", 5000), 
				new Account(102, "sagar", 3000),
				new Account(103, "Himanshu", 4000)

		};

		for (Account obj : account) {
			printDetails(obj);
		}
		String filename = "file.bin";
		// serializable
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(account);

			out.close();
			file.close();
			System.out.println("Objects serialized");
		} catch (Exception e) {
			System.out.println("Exception error");
		}

	}

	private static void printDetails(Account account) {
		System.out.println("Account no.: " + account.getAccNum() + ", Name: " + account.getName() + ", Balance: "
				+ account.getBalance());
	}

}
