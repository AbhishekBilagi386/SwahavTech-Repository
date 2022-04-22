package com.monocept.model;

public class Student implements Comparable<Student> {
	private int rollno;
	private String firstname;
	private String lastname;
	private int standard;
	private double cgpa;

	public Student(int rollnum, String fname, String lname, int std, double cgpa) {
		this.rollno = rollnum;
		this.firstname = fname;
		this.lastname = lname;
		this.standard = std;
		this.cgpa = cgpa;
	}

	public int getRollno() {
		return rollno;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public int getStandard() {
		return standard;
	}

	public double getCgpa() {
		return cgpa;
	}

	@Override
	public int compareTo(Student s) {
		if (this.rollno - s.rollno > 0)
			return 1;
		if (this.rollno - s.rollno < 0)
			return -1;
		return 0;

	}

}
