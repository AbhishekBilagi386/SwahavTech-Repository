package com.monocept.model.test;

import com.monocept.model.HatAdapter;
import com.monocept.model.Item;
import com.monocept.model.ShoppingCart;
import com.monocpt.model.Hat;

public class Test {

	public static void main(String[] args) {

		ShoppingCart c = new ShoppingCart();

		c.add(new HatAdapter(new Hat("golden", "golden Premium", 999)));
		c.add(new HatAdapter(new Hat("Adidas", "Sports Cap", 1000)));
		printDetails(c);
	}

	private static void printDetails(ShoppingCart c) {
		System.out.println("Number of items:  " + c.getCount());
		for (Item item : c.getItems()) {
			System.out.println("Product Name: " + item.itemName());
			System.out.println("Item Price: " + item.itemPrice());
		}
		System.out.println("Total Amount: " + c.totalPrice());
	}

}
