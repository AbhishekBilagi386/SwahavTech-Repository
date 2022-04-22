package com.monocept.model;

public class Student extends Person {

	public Student(String name, String dob, int id, String branch) {
		super(name, dob, id);
		this.branch = branch;
	}

	@Override
	public void details() {
		System.out.println(this.branch);
	}
}
