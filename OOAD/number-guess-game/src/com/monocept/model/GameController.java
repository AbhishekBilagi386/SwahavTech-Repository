package com.monocept.model;

import java.util.Scanner;

public class GameController {
	private int number;
	Scanner scan = new Scanner(System.in);

	public boolean StartGame() {
		Game gen = new Game();
		number = gen.generateRandomNumber();
		int maxAttempts = 8;
		int i, correctGuess, counter = 0;

		System.out.println("A number to be choosen between 1 to 100: ");

		for (i = 1; i <= maxAttempts; i++) {
			System.out.println("Guess the number: ");
			correctGuess = scan.nextInt();

			if (number == correctGuess) {
				System.out.println("Woah!! You got the correct number.");
				break;
			} else if (number > correctGuess) {
				System.out.println("Oops! Sorry too low.");
			} else if (number < correctGuess) {
				System.out.println("Oops! Sorry too high.");
			}
		}

		if (i > maxAttempts) {
			System.out.println("You have exhausted x trials.");
			System.out.println("The number was: " + number);
		}
		counter = counter + 1;
		System.out.println("No of attempts: " + counter);
		System.out.println("If you want to play again press (yes/no).");
		String ch = scan.next();

		if (ch.equals("yes")) {
			return true;
		}

		return false;

	}

}
