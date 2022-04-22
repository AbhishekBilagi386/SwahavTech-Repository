package com.monocept.test;

import com.monocept.model.Rectangle;

public class RectangleArray {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setHeight(20);
		Rectangle r2 = new Rectangle();
		r2.setWidth(100);
		r2.setHeight(200);

		Rectangle[] manyRectangle = new Rectangle[3];
		manyRectangle[0] = r1;
		manyRectangle[1] = r2;

		manyRectangle[2] = new Rectangle();

		manyRectangle[2].setHeight(60);
		manyRectangle[2].setWidth(40);

		for (Rectangle r : manyRectangle) {
			System.out.println("width:  " + r.getWidth());
			System.out.println("height: " + r.getHeight());
			System.out.println("Area: " + r.calculateArea());
			System.out.println(" ");
		}
	}

}
