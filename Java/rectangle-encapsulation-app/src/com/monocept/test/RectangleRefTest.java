package com.monocept.test;

import com.monocept.model.Rectangle;

public class RectangleRefTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setHeight(20);
		System.out.println("r1 height is: " + r1.getWidth());
		System.out.println("r1 width is: " + r1.getHeight());

		Rectangle r2;

		r2 = r1;

		System.out.println("r2 height is: " + r2.getWidth());
		System.out.println("r2 Width is: " + r2.getHeight());

		r2.setWidth(100);
		System.out.println("r2 width is: " + r2.getWidth());
		System.out.println("r1 Width is: " + r1.getHeight());
	}

}
