package com.monocept.model;

public class DepartmentDb implements IDataAccessible {

	@Override
	public void read() {
		System.out.println("Dept read the object");
	}

	@Override
	public void create() {
		System.out.println("Dept created the object");
	}

	@Override
	public void update() {
		System.out.println("Dept updated the object");
	}

	@Override
	public void delete() {
		System.out.println("Dept deleted the object");
	}

}
