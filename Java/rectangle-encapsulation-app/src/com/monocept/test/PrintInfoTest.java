package com.monocept.test;

import com.monocept.model.Rectangle;

public class PrintInfoTest {
	private static void PrintDetails(Rectangle r) {
		System.out.println("width:" + r.getWidth());
		System.out.println("height:" + r.getHeight());
		System.out.println("Area:" + r.calculateArea());

	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setHeight(20);
		PrintDetails(r1);

		Rectangle r2 = new Rectangle();
		r2.setWidth(100);
		r2.setHeight(200);
		PrintDetails(r2);
	}

}
