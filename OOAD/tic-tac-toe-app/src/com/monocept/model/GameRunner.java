package com.monocept.model;

import java.io.IOException;

public class GameRunner {
	Board board;
	Player player1;
	Player player2;
	ConsoleInputReader inputReader;

	public GameRunner() {
		inputReader = new ConsoleInputReader();
		player1 = new Player(inputReader.getUserInput(player1, "Enter The Player Name: "), 'O');
		player2 = new Player(inputReader.getUserInput(player2, "Enter The Player Name: "), 'X');
		board = new Board();
	}

	public void play() {

		String playerInput = null;
		int turnCount = 1;
		String winnerOrDraw = "Game Drawn..!!";
		boolean keepPlaying = true;
		Player currentPlayer;

		while (keepPlaying) {
			currentPlayer = turnCount % 2 == 1 ? player1 : player2;
			while (playerInput == null) {
				board.print();
				playerInput = readAndValidateUserInput(currentPlayer.getName(), currentPlayer.getMark());
			}
			if (board.isBoardFull()) {
				keepPlaying = false;
			} else if (board.hasWinner()) {
				winnerOrDraw = currentPlayer.getName() + " wins..!!";
				keepPlaying = false;
			}
			playerInput = null;
			turnCount++;
		}
		printResult(winnerOrDraw);

	}

	private String readAndValidateUserInput(String userName, char userMark) {
		String playerInput = null;
		try {
			playerInput = inputReader.getUserInput(player1,
					userName + " turn. Enter <row><col>. Example: 20 for top left cell.");
			board.checkForValidCell(playerInput);
			markBoardCell(userMark, playerInput);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			playerInput = null;
		}
		return playerInput;

	}

	private void markBoardCell(char mark, String playerInput) throws NumberFormatException, Exception {
		board.markCell(mark, Integer.parseInt(playerInput.substring(0, 1)), Integer.parseInt(playerInput.substring(1)));

	}

	private void printResult(String winnerOrDraw) {
		board.print();
		System.out.println("Result: " + winnerOrDraw);
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
