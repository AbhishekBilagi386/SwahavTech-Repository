package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Item> items = new ArrayList<Item>();
	private int count = 0;

	public ShoppingCart() {

	}

	public void add(Item item) {
		items.add(item);
		count = getCount() + 1;
	}

	public void remove(Item item) {
		items.remove(item);
	}

	public double totalPrice() {
		double total = 0;
		for (Item item : items) {
			total += item.itemPrice();
		}
		return total;
	}

	public List<Item> getItems() {
		return items;
	}

	public int getCount() {
		return count;
	}
}
