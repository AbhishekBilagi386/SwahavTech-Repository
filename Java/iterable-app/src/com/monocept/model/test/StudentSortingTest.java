package com.monocept.model.test;

import java.util.Set;
import java.util.TreeSet;

import com.monocept.model.SortByCgpaStrartegy;
import com.monocept.model.SortByFirstNameStrategy;
import com.monocept.model.SortByLastNameStrategy;
import com.monocept.model.Student;

public class StudentSortingTest {

	public static void main(String[] args) {
		Set<Student> students = new TreeSet<Student>(new SortByFirstNameStrategy());
		students.add(new Student(102, "Ramya", "Akkula", 10, 8.5));
		students.add(new Student(102, "Ramya", "B", 10, 8.5));
		students.add(new Student(104, "Abhishek", "C", 10, 9.0));
		students.add(new Student(105, "Himanshu", "S", 10, 7.0));
		
		System.out.println("Displaying in sorted order of First Name: ");
		printDetails(students);
		System.out.println("----------------");
		
		Set<Student> students1 = new TreeSet<Student>(new SortByLastNameStrategy());
		students1.add(new Student(102, "Ramya", "Akkula", 10, 8.5));
		students1.add(new Student(102, "Ramya", "Akkula", 10, 8.5));
		students1.add(new Student(104, "Abhishek", "C", 10, 9.0));
		students1.add(new Student(105, "Himanshu", "S", 10, 7.0));
		
		System.out.println("Displaying in sorted order of Last Name:");
		printDetails(students1);
		System.out.println("----------------");
		
		Set<Student> students2 = new TreeSet<Student>(new SortByCgpaStrartegy());
		students2.add(new Student(102, "Ramya", "Akkula", 10, 8.5));
		students2.add(new Student(102, "Ramya", "Akkula", 10, 8.5));
		students2.add(new Student(104, "Abhishek", "C", 10, 9.0));
		students2.add(new Student(105, "Himanshu", "S", 10, 7.0));
		
		System.out.println("Displaying in sorted order of cgpa:");
		printDetails(students2);
		
	
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
