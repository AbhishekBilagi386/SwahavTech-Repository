package com.monocept.model;

public class NamesArrayIterator implements Iterator {
	private int index = 0;
	private NameRepository repo;

	public NamesArrayIterator(NameRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean hasNext() {

		return index < repo.getNames().length;
	}

	@Override
	public Object next() {
		Object val = repo.getNames()[index];
		index += 1;
		return val;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public NameRepository getRepo() {
		return repo;
	}

	public void setRepo(NameRepository repo) {
		this.repo = repo;
	}
	
}
