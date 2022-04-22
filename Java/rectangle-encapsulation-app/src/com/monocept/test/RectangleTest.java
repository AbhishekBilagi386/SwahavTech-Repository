package com.monocept.test;

import com.monocept.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle one = new Rectangle();
		one.setWidth(-30);
		one.setHeight(1000);
		System.out.println("Area one: " +one.calculateArea());

		Rectangle two = new Rectangle();
		two.setWidth(50);
		two.setHeight(20);
		System.out.println("Area two: " +two.calculateArea());
	}

}
