package com.monocept.model;

public class OddEvenGeneretor {

	public int[] getEvenNosTill(int limit) {

		if (limit < 0)
			throw new NegativeValueNotAllowed("Negative values are not allowed");
		int size = limit / 2;
		int[] evenNum = new int[size];

		for (int num = 2, index = 0; num <= limit; num += 2, index++) {
			evenNum[index] = num;
		}

		return evenNum;
	}

	public int[] getOddNosTill(int limit) {
		if (limit < 0)
			throw new NegativeValueNotAllowed("Negative values are not allowed");
		int size = limit / 2;
		int oddNum[] = new int[size];
		
		for (int num = 1, index = 0; num <= limit; num += 2, index++) {
			oddNum[index] = num;
		}

		return oddNum;
	}

}
