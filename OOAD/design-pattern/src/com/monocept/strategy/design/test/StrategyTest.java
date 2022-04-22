package com.monocept.strategy.design.test;

import com.monocept.strategy.design.StrategyAdd;
import com.monocept.strategy.design.StrategyDesign;
import com.monocept.strategy.design.StrategySub;

public class StrategyTest {

	public static void main(String[] args) {
		StrategyDesign SD = new StrategyDesign(new StrategyAdd());
		System.out.println("ADD 100 and 10: "+SD.executeStrategy(100, 10));
		
		StrategyDesign SD1 = new StrategyDesign(new StrategySub());
		System.out.println("ADD 100 and 10: "+SD1.executeStrategy(100, 10));
	}

}
