package com.monocept.model.test;

import java.util.Map;

import com.monocept.model.DiceGame;

public class DiceGameTest {

	public static void main(String[] args) {
		DiceGame dice = new DiceGame();
		Map<Integer, Integer> result = dice.roll(10);
		for (Integer key : result.keySet()) {
			System.out.println(key + "-->" + result.get(key));
		}

	}

}
