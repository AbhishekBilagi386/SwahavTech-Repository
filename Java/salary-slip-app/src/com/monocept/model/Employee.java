package com.monocept.model;

public abstract class Employee {
	private int eno;
	private String ename;
	protected double basic;
	
	public Employee(int eno, String ename, double basic) {
		this.eno = eno;
		this.ename = ename;
		this.basic = basic;
	}
	public int getempnum() {
		return eno;
	}
	public String getempname() {
		return ename;
	}
	public double getempbasic() {
		return basic;
	}
	public abstract double calcAnnualCTC();
	
	public double getcalcAnnualCTC() {
		return calcAnnualCTC();
	}
	
}
