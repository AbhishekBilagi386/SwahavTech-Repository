package com.monocept.model;

public abstract class FooDb implements IDataAccessible {
	@Override
	public void create() {
		System.out.println("Foo created the object");
	}
}
