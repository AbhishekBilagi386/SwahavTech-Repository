package com.monocept.strategy.design;

public class StrategyDesign {
	private IStrategy strategy;

	public StrategyDesign(IStrategy strategy) {
		this.strategy = strategy;
	}

	public IStrategy getStrategy() {
		return strategy;
	}

	public int executeStrategy(int num1, int num2) {
		return strategy.doOperation(num1, num2);
	}

}
