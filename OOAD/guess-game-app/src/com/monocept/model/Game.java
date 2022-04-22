package com.monocept.model;

public class Game {
	
	private int randomNumber;
	
	public int getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(int randomNumber) {
		this.randomNumber = (int)(100 * Math.random()+1);
	}
	
}
