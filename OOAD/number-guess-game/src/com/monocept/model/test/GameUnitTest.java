package com.monocept.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.Game;

class GameUnitTest {
	
	private static final int NUMBER = 0 ;
	private final Game game = new Game();

	@Test
	public void testTooHigh() {
		assertEquals(Game.MSG_TOO_HIGH, game.validateInput(NUMBER + 1));
	}

	@Test
	public void testTooLow() {
		assertEquals(Game.MSG_TOO_LOW, game.validateInput(NUMBER - 1));
	}

	@Test
	public void testWin() {
		assertEquals(Game.MSG_WIN, game.validateInput(NUMBER));
	}

}
