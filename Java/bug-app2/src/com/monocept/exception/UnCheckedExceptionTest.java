package com.monocept.exception;

public class UnCheckedExceptionTest {

	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("End of main.");
	}

	private static void m1() {
		System.out.println("Inside m1.");
		m2();
	}

	private static void m2() {
		System.out.println("Inside m2");
		m3();
	}

	private static void m3() {
		System.out.println("Inside m3");
		throw new RuntimeException("Something went wrong in m3.");
	}

}
