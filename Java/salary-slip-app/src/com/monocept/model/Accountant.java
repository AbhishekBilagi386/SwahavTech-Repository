package com.monocept.model;

public class Accountant extends Employee {
	private double perks = basic * .3;

	public Accountant(int eno, String ename, double basic) {
		super(eno, ename, basic);
	}

	public double getPerks() {
		return perks * 12;
	}

	@Override
	public double calcAnnualCTC() {
		return 12 * (basic + perks);
	}

	public double getcalcAnnualCTC() {
		return calcAnnualCTC();
	}

}
