package com.monocept.model;

import java.util.HashSet;
import java.util.Set;

public class Employee {
	private String eId;
	private String eName;
	private String jobDept;
	private int managerId;
	private String dateOfJoining;
	private int salary;
	private int commission;
	private int deptnum;
	Set<Employee> emp = new HashSet<Employee>();

	public Employee(String id, String ename, String job, int mId, String doj, int sal, int commission, int deptnum) {
		this.eId = id;
		this.eName = ename;
		this.jobDept = job;
		this.managerId = mId;
		this.dateOfJoining = doj;
		this.salary = sal;
		this.commission = commission;
		this.deptnum = deptnum;
		emp.add(this);
	}

	public String getEid() {
		return eId;
	}

	public String getEname() {
		return eName;
	}

	public String getJob() {
		return jobDept;
	}

	public String getDoj() {
		return dateOfJoining;
	}

	public int getSal() {
		return salary;
	}

	public int getCommission() {
		return commission;
	}

	public int getDeptnum() {
		return deptnum;
	}

	public int getManagerId() {
		return managerId;
	}

	@Override
	public String toString() {
		return "Employee ID: " + getEid() + "Employee Name: " + getEname() + "Department: " + getJob() + "Manager Id: "
				+ getManagerId() + "Date Of Joining: " + getDoj() + "Salary: " + getSal() + "Commission: "
				+ getCommission() + "Department Number: " + getDeptnum();
	}

	@Override
	public int hashCode() {
		final int prime = 28;
		int result = 1;
		result = prime * result + ((eId == null) ? 0 : eId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (eId == null) {
			if (other.eId != null)
				return false;
		} else if (!eId.equals(other.eId))
			return false;
		return true;
	}
}
