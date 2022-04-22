package com.monocept.model;

import java.util.Random;
import java.util.Scanner;

public class Pig_Game {
	int playerScores = 0;
	int playerTotal = 0;
	int dice;
	boolean gameOver = false;
	boolean turnOver = false;
	char repeat;
	String input;
	Scanner scan = new Scanner(System.in);

	Random rand = new Random();

	public boolean startGame() {

		System.out.println("Enter 'r' to roll again," + " 'h' to hold.");
		input = scan.nextLine();
		repeat = input.charAt(0);

		if (repeat == 'h') {

			return false;
		}
		while (gameOver == false) {
			do {
				System.out.println("Enter 'r' to roll " + "again, 'h' to hold.");
				dice = rand.nextInt(6) + 1;
				System.out.println("You rolled: " + dice);
				if (dice == 1) {
					playerScores = 0;
					System.out.print("You lose your turn! ");
					System.out.println("Your total is " + playerTotal);
					turnOver = true;
					while (playerTotal < 100)
						;
				} else {
					playerScores += dice;
					System.out.print("Your turn score is " + playerScores);
					System.out.println(" \nIf you hold you will have " + playerScores + " points.");
					System.out.println("Enter 'r' to roll " + "again, 'h' to hold.");
					input = scan.nextLine();
					repeat = input.charAt(0);
					if (repeat == 'h')
						break;
				}
			} while (turnOver == false || dice != 1);
			playerTotal += playerScores;
			System.out.println("Your score is " + playerTotal);
			playerScores = 0;
			if (playerTotal >= 100) {
				System.out.println("YOU WIN!");
				gameOver = true;
				while (playerTotal >= 100)
					;
			}
		}
		return gameOver;
	}
}
