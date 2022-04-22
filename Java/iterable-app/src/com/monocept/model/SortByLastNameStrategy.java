package com.monocept.model;

import java.util.Comparator;

public class SortByLastNameStrategy implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return (o1.getLastname().compareToIgnoreCase(o2.getLastname()));
	}

}
