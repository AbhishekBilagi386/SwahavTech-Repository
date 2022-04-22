package com.monocept.model;

public class Manager extends Employee {
	private double hra = basic * .5;
	private double da = basic * .2;
	private double ta = basic * .1;

	public Manager(int eno, String ename, double basic) {
		super(eno, ename, basic);
	}

	public double getHra() {
		return hra * 12;
	}

	public double getDa() {
		return da * 12;
	}

	public double getTa() {
		return ta * 12;
	}

	@Override
	public double calcAnnualCTC() {
		return 12 * (basic + hra + da + ta);
	}
	public double getcalcAnnualCTC() {
		return calcAnnualCTC();	
	}

}
