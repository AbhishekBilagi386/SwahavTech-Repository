package com.monocept.model.test;

import com.monocept.model.GenderOptions;
import com.monocept.model.Person;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("Shikhar", 20);
		Person p2 = new Person("Asha", 25, 5, 45, GenderOptions.FEMALE);
		Person p3 = new Person("Abhishek", 24, 5.11f, 75, GenderOptions.MALE);
		printDetails(p1);
		printDetails(p2);
		printDetails(p3);
		
		p2.eat();
		p3.eat();
		System.out.println();
		printDetails(p1);
		printDetails(p2);
		printDetails(p3);

	}

	public static void printDetails(Person p) {
		System.out.println("Name: " + p.getName() + "\tAge: " + p.getAge() + "\tHeight: " + p.getHeight() + "\tWeight: "
				+ p.getWeight() + "\tGender: " + p.getGender());
	}
}
