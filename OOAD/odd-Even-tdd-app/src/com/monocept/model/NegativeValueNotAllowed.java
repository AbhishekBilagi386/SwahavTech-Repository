package com.monocept.model;

public class NegativeValueNotAllowed extends RuntimeException {

	String message;

	public NegativeValueNotAllowed(String string) {
		message = string;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
