package com.monocept.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.Product;

class JProduct {

	@Test
	void CheckWhetherTheProdcutIsCreated() {
		Product p1 = new Product("Samsung Mobile",10000,50.0);
		Product p2 = new Product("Samsung AC",4000,2.0);
		assertNotNull(p1);
		assertNotNull(p2);
	}

}
