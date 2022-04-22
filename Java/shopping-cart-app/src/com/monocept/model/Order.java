package com.monocept.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Order {
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(100);
	private int Orderid;
	private String date;
	private List<LineItem> items = new ArrayList<LineItem>();
	private List<LineItem> LineItems = new ArrayList<LineItem>();
	private static int ItemCount;
	
	public Order(String date) {
		Orderid = ID_GENERATOR.getAndIncrement();
		this.date = date;
	}
	public int getId() {
		return Orderid;
	}
	public String getDate() {
		return date;
	}
	public int ItemCount() {
		ItemCount++;
		return ItemCount;
	}
	public List<LineItem> getItems() {
		return items;
	}
	public void addItem(LineItem item) {
		LineItems.add(item);
	}
}
