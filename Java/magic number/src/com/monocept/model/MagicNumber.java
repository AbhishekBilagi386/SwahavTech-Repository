package com.monocept.model;

public class MagicNumber {
	static final double GRAVITATIONAL_CONSTANT = 9.81;
	static double potentialEnergy(double mass, double height) {
		  return mass * height * GRAVITATIONAL_CONSTANT;
		}

	public static void main(String[] args) {
		System.out.println(potentialEnergy(4, 5));
	}
}
