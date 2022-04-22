package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle small = new Rectangle(10,5,"blue");

		System.out.println("Width: " + small.getwidth());
		System.out.println("Height: " + small.getheight());
		System.out.println("Area: " + small.calculateArea());
		System.out.println("color: "+small.getColor());
	}

}
