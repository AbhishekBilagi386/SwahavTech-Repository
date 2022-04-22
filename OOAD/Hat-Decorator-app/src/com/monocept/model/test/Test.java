package com.monocept.model.test;

import com.monocept.model.GoldenHat;
import com.monocept.model.IHat;
import com.monocept.model.PremiumHat;
import com.monocept.model.RibbonedHat;

public class Test {

	public static void main(String[] args) {
		IHat hat;
		hat = new RibbonedHat(new GoldenHat(new PremiumHat()));
		printDetails(hat);
	}

	public static void printDetails(IHat hat) {
		System.out.println(
				"Name: " + hat.getName() + "\nDescription: " 
		+ hat.getDiscription() + 
		"\nPrice: " + hat.getPrice());
	}

}
