package com.monocept.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import com.monocept.model.DiceGame;

class JDiceGameTest {

	@Test
	void checkDiceFrequncytest() {
		DiceGame dice = new DiceGame();

		Map<Integer, Integer> score = dice.roll(10);
		int sum = 0;
		for (Integer key : score.keySet()) 
			sum = sum + score.get(key);
		
			assertEquals(sum, 10);
		
	}

}
