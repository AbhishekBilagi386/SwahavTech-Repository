package com.monocept.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.Order;

class JOrderTest {

	@Test
	void CheckWhetherTheOrderDateIsInitiated() {
		Order o1 = new Order("12/12/2022");
		Order o2 = new Order("11/11/2021");
		assertNotNull(o1);
		assertNotNull(o2);
	}

}
