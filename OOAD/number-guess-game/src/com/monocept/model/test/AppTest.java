package com.monocept.model.test;

import com.monocept.model.GameController;

public class AppTest {

	public static void main(String[] args) {
		while (true) {
			GameController x = new GameController();
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
