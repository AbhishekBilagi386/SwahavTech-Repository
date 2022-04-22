package com.monocept.strategy.design;

public class StrategyAdd implements IStrategy {

	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}

}
