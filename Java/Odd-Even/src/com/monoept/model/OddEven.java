package com.monoept.model;

public class OddEven {
	public void oddEvenNumber() {
		int number = 100;
		System.out.println("\nList of odd numbers\n");
		for (int i = 1; i <= number; i++) {
			
			if (i % 2 != 0) {
				System.out.print(" "+ i);
			}
		}
		System.out.println("\nList of even numbers\n");
		for (int j = 1; j <= number; j++) {
			
			if (j % 2 == 0) {
				System.out.print(" " + j);
			}
		}
	}
}
