package com.monocept.model;

public class FooChildDb extends FooDb {

	@Override
	public void read() {
		System.out.println("FooChild Read The Object");		
	}

	@Override
	public void update() {
		System.out.println("FooChild updated The Object");		
	}

	@Override
	public void delete() {
		System.out.println("FooChild deleted The Object");		
	}

}
