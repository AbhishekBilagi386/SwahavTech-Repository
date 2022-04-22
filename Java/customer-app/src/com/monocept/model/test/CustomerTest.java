package com.monocept.model.test;

import com.monocept.model.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		System.out.println("Developed by Abhishek @ Aju Palleri @ swabhav tech");
		Customer c1 = new Customer("Rohan", "Hyderabad", 5000);
		Customer c2 = new Customer("Ramya", "Banglore", 2000);
		Customer c3 = new Customer("Vineet", "mumbai", 1000);
		printDetails(c1);
		System.out.println();
		printDetails(c2);
		System.out.println();
		printDetails(c3);
		System.out.println();
	}

	private static void printDetails(Customer c) {
		System.out.println("customerID: " + c.getCustomerID() + "\tName: " + c.getName() + "\tAddress: "
				+ c.getAddress() + " \t Amount: " + c.getAmount());
	}

}
