package com.monocept.model;

public class File implements IStorageItem {
	private String name;
	private String size;

	public File(String name, String size) {
		super();
		this.setName(name);
		this.setSize(size);
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {

		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public void showHierarchy() {
		System.out.println("  " + " name: " + getName() + " size: " + getSize());
	}
}
