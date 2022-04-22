package com.monocept.model.test;

import com.monocept.model.ErrorDisplay;

public class ErrorDisplayTest {

	public static void main(String[] args) {
		ErrorDisplay err1 = new ErrorDisplay(error1, warning1, info1);
		printDetails(err1);
	}

	private static void printDetails(ErrorDisplay err1) {
		System.out.println("Error Displaying:"+err1.getError()+"warning Displaying:"+err1.getWarning()+"Info diplaying:"+err1.getInfo());
	}

}
