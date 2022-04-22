package com.monocept.model;

public class Circle {
	private float radius;
	private BorderOptions border;

	public Circle(float pradius) {
		radius = pradius;
	}

	public Circle(float pradius, BorderOptions pborder) {
		radius = pradius;

		border = pborder;
	}

	public float calculateArea() {
		return (float) (Math.PI * radius * radius);
	}

	public float getradius() {
		return radius;
	}

	public BorderOptions getborder() {
		return border;
	}
}
