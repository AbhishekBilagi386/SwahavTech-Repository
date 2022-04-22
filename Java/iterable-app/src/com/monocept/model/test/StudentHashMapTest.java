package com.monocept.model.test;

import java.util.HashMap;

import com.monocept.model.Student;

public class StudentHashMapTest {

	public static void main(String[] args) {
		HashMap<Student, Student> map = new HashMap<Student, Student>();
		Student s1 = new Student(101, "RAMYA", "AKKULA", 10, 8.5);
		Student s2 = new Student(101, "ramya", "akkula", 10, 8.5);
		Student s3 = new Student(102, "ROHAN", "a", 10, 8.5);
		Student s4 = new Student(102, "ROHAN", "a", 10, 7.5);
		map.put(s1, s4);
		map.put(s2, s4);
		map.put(s3, s4);
		for (Student s : map.keySet()) {
			printDetails(s);
		}
	}

	public static void printDetails(Student student) {

		System.out.println("Roll number: " + student.getRollno());
		System.out.println("First name: " + student.getFirstname());
		System.out.println("Last Name: " + student.getLastname());
		System.out.println("Standard: " + student.getStandard());
		System.out.println("Cgpa: : " + student.getCgpa());
	}

}
