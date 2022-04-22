package com.monocept.model;

public abstract class Vehicle implements IMovable {
	protected String description;

	public Vehicle(String description) {
		this.description = description;
	}

	@Override
	public void move() {
		System.out.println(description+ "  moves");
		System.out.println();
	}
}
