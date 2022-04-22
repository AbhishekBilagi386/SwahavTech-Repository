package com.monocept.basics;

public class ClassLoaderTest {

	public static void main(String[] args) {
		System.out.println("Displaying class Loader info.");
		System.out.println(ClassLoaderTest.class.getClassLoader());
		System.out.println(args.getClass().getClassLoader());
		System.out.println(System.class.getClassLoader());
		System.out.println(String.class.getClassLoader());
	}

}
