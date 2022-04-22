package com.monocept.basics;

public class overloadingTest {

	public static void printInfo(String value) {
		System.out.println("String:" + value);
	}

	public static void printInfo(int value) {
		System.out.println("integer:" + value);
	}

	public static void printInfo(char value) {
		System.out.println("character:" + value);
	}

	public static void printInfo(boolean value) {
		System.out.println("boolean:" + value);
	}

	public static void printInfo(float value) {
		System.out.println("float:" + value);
	}

	public static void printInfo(double value) {
		System.out.println("double:" + value);
	}

	public static void main(String[] args) {
		printInfo(10);
		String a = null;
		printInfo(a);
		printInfo("hello");
		printInfo(.5);
		printInfo(100.55);
		printInfo(false);
	}

}
