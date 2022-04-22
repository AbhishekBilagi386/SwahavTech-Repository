package com.monocept.model;

public class LaptopBuilder {
	private Laptop laptop;

	public LaptopBuilder() {
		laptop = new Laptop();
	}

	public LaptopBuilder addKeyBoard(String type) {
		laptop.setKeyBoard(type);
		;
		return this;
	}

	public LaptopBuilder addRam(String type) {
		laptop.setRAM(type);
		;
		return this;
	}

	public LaptopBuilder addHDD(String type) {
		laptop.setHDD(type);
		;
		return this;
	}

	public LaptopBuilder addMouse(String type) {
		laptop.setMouse(type);
		;
		return this;
	}

	public LaptopBuilder addTouchScreen(String type) {
		laptop.setTouchScreen(type);
		;
		return this;
	}

	public Laptop getSysytem() {
		return laptop;
	}
}
