package com.monocept.model;

import java.util.Comparator;

public class SortByFirstNameStrategy implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return (o1.getFirstname().compareToIgnoreCase(o2.getFirstname()));
	}

}
