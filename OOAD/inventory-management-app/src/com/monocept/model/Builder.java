package com.monocept.model;

public enum Builder {
	ABHISHEK, HIMANSHU, ROHAN, ANY, ZAWED;

	public String toString() {
		switch (this) {
		case ABHISHEK:
			return "Abhishek";
		case HIMANSHU:
			return "Himanshu";
		case ROHAN:
			return "Rohan";

		default:
			return "Unspecified";
		}
	}
}