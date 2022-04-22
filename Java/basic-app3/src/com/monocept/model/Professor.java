package com.monocept.model;

public class Professor extends Person {

	double Salary;

	public Professor(String name, String dob, int id, double salary) {
		super(name, dob, id);
		this.Salary = salary;
	}

	public double getSalary() {
		return Salary = (Salary + (20.0 / 100.0) * Salary) * 12;
	}

	@Override
	public void details() {
		System.out.println("Professor salary: " + getSalary());
	}

}
