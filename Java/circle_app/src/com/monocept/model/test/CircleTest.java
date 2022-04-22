package com.monocept.model.test;

import com.monocept.model.BorderOptions;
import com.monocept.model.Circle;

public class CircleTest {

	public static void main(String[] args) {
		Circle c1 = new Circle(5.5f);
		Circle c2 = new Circle(7.5f, BorderOptions.DOTTED);
		printDetails(c1);
		printDetails(c2);

		Circle[] Circle1 = new Circle[3];
		Circle1[0] = c1;
		Circle1[1] = c2;
		Circle1[2] = new Circle(10.5f, BorderOptions.DOTTED);
	}

	public static void printDetails(Circle c) {
		System.out.println("Radius:" + c.getradius());
		System.out.println("Border:" + c.getborder());
		System.out.println("Area:" + c.calculateArea());
	}
}
