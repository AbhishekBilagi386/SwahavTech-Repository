package com.monocept.model.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.monocept.model.Account;

public class AccountDeserializationTest {

	public static void main(String[] args) {
		Account account[];
		String filename = "file.bin";
		// Deserializable
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			account = (Account[]) in.readObject();

			in.close();
			file.close();

			System.out.println("Object Deserialized");
			for (Account obj : account) {
				printDetails(obj);
			}
			// printDetails(acc2);
		} catch (Exception e) {
			System.out.println("Exception caught");
		}
	}

	private static void printDetails(Account account) {
		System.out.println("Account no.: " + account.getAccNum() + ", Name: " + account.getName() + ", Balance: "
				+ account.getBalance());
	}
}
