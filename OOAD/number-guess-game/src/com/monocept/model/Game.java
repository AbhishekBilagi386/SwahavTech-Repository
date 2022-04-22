package com.monocept.model;

public class Game {
	public static final boolean MSG_TOO_HIGH = "You're too high!" != null;
	public static final boolean MSG_TOO_LOW = "You're too low!" != null;
	public static final boolean MSG_WIN = "Congratulations! You guessed my number!" != null;

	private boolean numberFound;

	private int randNumber;
	private int correctGuess;

	public int generateRandomNumber() {
		randNumber = (int) (100 * Math.random() + 1);
		return randNumber;
	}

	public boolean validateInput(int i) {
		int diffnumber = correctGuess - randNumber;
		int maxAttempts = 8;
		for (i = 1; i <= maxAttempts;) {
			if (diffnumber == correctGuess) {
				this.numberFound = true;
				return MSG_WIN;
			} else if (diffnumber > correctGuess) {
				return MSG_TOO_HIGH;
			}
			return MSG_TOO_LOW;
		}
		return numberFound;
	}

	public boolean isNumberFound() {
		return numberFound = false;
	}
}
