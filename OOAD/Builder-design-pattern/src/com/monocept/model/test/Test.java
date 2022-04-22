package com.monocept.model.test;

import com.monocept.model.Laptop;
import com.monocept.model.LaptopBuilder;

public class Test {

	public static void main(String[] args) {
		Laptop lap = new LaptopBuilder()
				.addKeyBoard("Logitech")
				.addHDD("1TB")
				.addRam("16GB")
				.addMouse("HP")
				.addTouchScreen("Yes")
				.getSysytem();
		
		printDetails(lap);		
	}

	private static void printDetails(Laptop lap) {
		System.out.println("Laptop Details: ");
		System.out.println("Keyboard: "+lap.getKeyBoard());
		System.out.println("HDD: "+lap.getHDD());
		System.out.println("Ram: "+lap.getRAM());
		System.out.println("Mouse: "+lap.getMouse());
		System.out.println("TouchScreen: "+lap.getTouchScreen());
	}

}
