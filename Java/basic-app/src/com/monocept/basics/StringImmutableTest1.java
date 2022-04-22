package com.monocept.basics;

public class StringImmutableTest1 {
	public static void caseStudy() {
	String username = "Rohan";
	System.out.println(username.hashCode());
	username += "Monocept";
	System.out.println(username.hashCode());
	username += "hyderabad";
	System.out.println(username);
	}

	public static void main(String[] args) {
		caseStudy();
	}

}
