package com.monocept.model;

public class Developer extends Employee {
	private double pib = basic * .4;
	private double otb = basic * .3;

	public Developer(int eno, String ename, double basic) {
		super(eno, ename, basic);
	}

	public double getPib() {
		return pib * 12;
	}

	public double getOtb() {
		return otb * 12;
	}

	@Override
	public double calcAnnualCTC() {
		return 12 * (basic + pib + otb);
	}

	public double getcalcAnnualCTC() {
		return calcAnnualCTC();
	}
}
