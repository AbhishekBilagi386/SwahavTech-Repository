package com.monocept.model.test;

import com.monocept.model.Person;
import com.monocept.model.Professor;
import com.monocept.model.Student;

public class SPTest {

	public static void main(String[] args) {
		Student s1 = new Student("Abhi", "11/11/98", 101, "cse");
		Student s2 = new Student("Himanshu","16/1/97", 103, "cse");
		Professor p1 = new Professor("Ajju", "12/12/85", 106, 10000.0);
		Professor p2 = new Professor("Kannan", "1/11/89", 107, 11000.0);
		printDetails(s1);
		System.out.println();
		printDetails(s2);
		System.out.println();
		printDetails(p1);
		System.out.println();
		printDetails(p2);
	}

	private static void printDetails(Person P) {
		System.out.println("Name: " + P.getName() + "\tDOB: " + P.getDob() + "\tID: " + P.getId());
		P.details();
	}

}
