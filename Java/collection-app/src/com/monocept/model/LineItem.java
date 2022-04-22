package com.monocept.model;

public class LineItem {
	public int id;
	public String name;
	private int quantity;
	private double unitPrice;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public LineItem(int id, String name, int quantiy, double unitPrice) {
		this.id = id;
		this.name = name;
		this.quantity = quantiy;
		this.unitPrice = unitPrice;
	}

	public double calculateCost() {
		return quantity * unitPrice;
	}

	@Override
	public String toString() {
		return "Id: " + id + "\nName: " + name + "\nQuantity: " + quantity + "\nUnit price: " + unitPrice
				+ "\nTotal Cost: " + calculateCost();

	}

	@Override
	public int hashCode() {
		return this.getId();
	}

	@Override
	public boolean equals(Object obj) {
		LineItem e = null;
		if (obj instanceof LineItem) {
			e = (LineItem) obj;
		}
		if (this.getId() == e.getId()) {
			return true;
		}
		return false;
	}
}