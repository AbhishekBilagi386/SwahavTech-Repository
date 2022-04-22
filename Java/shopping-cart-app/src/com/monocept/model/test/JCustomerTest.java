package com.monocept.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.Customer;

class JCustomerTest {

	@Test
	void CheckWhetherTheCustomerIsCreated() {
		Customer c1 = new Customer("Abhishek");
		Customer c2 = new Customer("Rohan");
		assertNotNull(c1);
		assertNotNull(c2);
	}

}
