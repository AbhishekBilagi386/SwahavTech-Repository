package com.monocept.model;

public class RealImage implements Image {
	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		System.out.println("Loading: " + fileName);
	}

	@Override
	public void display() {
		System.out.println("Display: " + fileName);
	}

	public String getFileName() {
		return fileName;
	}

}
