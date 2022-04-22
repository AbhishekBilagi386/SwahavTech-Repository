package com.monocept.model;

import java.util.Scanner;

public class BookCricketGame {
	private int score;
	private int turns;
	private int lastPlayerScore;

	public static int GenerateRandom() {
		int num = (int) (Math.random() * 300) + 1;
		return num;
	}

	public BookCricketGame(int lastScore) {
		this.score = 0;
		this.turns = 0;
		lastPlayerScore = lastScore;
	}

	public void play() {
		while (true) {
			Scanner obj = new Scanner(System.in);
			System.out.println("To open the book press Y or press N to stop:(Y/N)");
			String choice = obj.nextLine();

			if (choice.equalsIgnoreCase("n")) {
				break;
			}
			System.out.println("Number of the Turn: " + (turns + 1));
			int num = GenerateRandom();
			System.out.println("random Page number: " + num);
			if (num % 7 == 0) {
				turns++;
				break;
			}
			this.score += num % 7;
			turns++;
			System.out.println("total score is: " + this.score);
			if (this.score > lastPlayerScore)
				break;
		}
	}

	public int getScore() {
		return this.score;
	}

	public String getWinner(BookCricketGame player) {
		if (this.getScore() > player.getScore())
			return "Player 1 is the  Winner";
		if (this.getScore() < player.getScore())
			return "Player 2 is the Winner";
		if (this.getScore() == player.getScore()) {
			if (this.turns == player.turns)
				return "Game Draw";
		}
		return null;
	}

}
