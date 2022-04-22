package com.monocept.game.number;

public class GenerateTheNumber {
	private int randnumber;
	public int generateRandomNumber() {
		randnumber = (int)(100 * Math.random()+1);
		return randnumber;
	}

}
