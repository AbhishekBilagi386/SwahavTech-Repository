package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IStorageItem {
	private String name;
	private List<IStorageItem> children = new ArrayList<IStorageItem>();

	public Folder(String name) {
		this.name = name;
	}

	@Override
	public void showHierarchy() {
		System.out.println("Folder_name: " + name);
		for (IStorageItem item : children) {
			item.showHierarchy();
		}
	}

	public void addChild(IStorageItem item) {
		children.add(item);
	}
	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<IStorageItem> getChildren() {
		return children;
	}

	public void setChildren(List<IStorageItem> children) {
		this.children = children;
	}

}
