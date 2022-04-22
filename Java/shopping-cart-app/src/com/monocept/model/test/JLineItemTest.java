package com.monocept.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.LineItem;
import com.monocept.model.Product;

class JLineItemTest {

	@Test
	void CheckWhetherProductIsAddedInLineItem() {
		Product p1 = new Product("Samsung", 15000.0, 2000.0);
		Product p2 = new Product("Apple", 50000.0, 1000.0);
		LineItem l1 = new LineItem(1,p1);
		LineItem l2 = new LineItem(2,p2);
		assertNotNull(l1);
		assertNotNull(l2);
	}

}
