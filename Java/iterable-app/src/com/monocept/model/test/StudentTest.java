package com.monocept.model.test;

import java.util.*;

import com.monocept.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> studentList;
		studentList = new ArrayList<Student>();
		//studentList = new LinkedList<Student>();
		studentList.add(new Student(101, "Rohan", "S", 10, 8.0));
		studentList.add(new Student(101, "Rohan", "S", 10, 8.0));
		printDetails(studentList);

		System.out.println();

		Set<Student> studentSet;
		//studentSet = new HashSet<Student>();
		studentSet = new TreeSet<Student>();
		studentSet.add(new Student(102, "Ramya", "B", 10, 8.5));
		studentSet.add(new Student(102, "Ramya", "B", 10, 8.5));
		studentSet.add(new Student(104, "Abhishek", "C", 10, 8.5));
		printDetails(studentSet);
	}

	private static void printDetails(Iterable<Student> students) {
		for (Student student : students) {
			System.out.println("Roll number: "+student.getRollno());
			System.out.println("First name: "+student.getFirstname());
			System.out.println("Last Name: "+student.getLastname());
			System.out.println("Standard: "+student.getStandard());
			System.out.println("Cgpa: : "+student.getCgpa());
		}
			
	}

}
