package com.monocept.game.test;

import com.monocept.game.play.GuessingNumberGame;

public class GameTest {
	public static void main(String args[]) {
		while (true) {
			GuessingNumberGame x = new GuessingNumberGame();
			boolean play = x.StartGame();
			if (play == true) {
				continue;
			} else {
				System.out.println("Thank you!");
				break;
			}
		}

	}

}
