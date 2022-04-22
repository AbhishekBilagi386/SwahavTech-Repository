package com.monocept.model;

public class NameRepository {
	private String[] names;

	public NameRepository(String names) {
		this.setNames(names.split(","));
	}

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	public Iterator createIterator() {
		return new NamesArrayIterator(this);
	}
}
