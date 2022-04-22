package com.monocept.model;

public abstract class Person {
	private int id;
	private String name;
	private String dob;
	protected String branch;
	protected double salary;

	Person(String name, String dob, int id) {
		this.name = name;
		this.dob = dob;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getDob() {
		return dob;
	}

	public abstract void details();
}
