package com.monocept.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DiceGame {
	public Map<Integer, Integer> roll(int times) {

		HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();

		Random rand = new Random();

		for (int roll = 0; roll < times; roll++) {
			int num = rand.nextInt(6) + 1;
			if (result.containsKey(num)) {
				result.put(num, result.get(num) + 1);
			}
			if (!result.containsKey(num)) {
				result.put(num, 1);
			}
		}
		return result;
	}
}
