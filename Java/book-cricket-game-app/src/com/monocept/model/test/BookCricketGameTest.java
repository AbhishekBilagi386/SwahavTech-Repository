package com.monocept.model.test;

import com.monocept.model.BookCricketGame;

public class BookCricketGameTest {

	public static void main(String[] args) {
		BookCricketGame Player1;
	    BookCricketGame Player2;
	    System.out.println("Player 1 turn: ");
	    Player1 = new BookCricketGame(300);
	    Player1.play();
	    System.out.println();
	    System.out.println("Player 2 turn: ");
	    Player2 = new BookCricketGame(Player1.getScore());
	    Player2.play();
	    System.out.println();
	    System.out.println("Player 1 Score: " + Player1.getScore() + "\nPlayer 2 Score:" + Player2.getScore());
	    System.out.println(Player1.getWinner(Player2));
	}

}
