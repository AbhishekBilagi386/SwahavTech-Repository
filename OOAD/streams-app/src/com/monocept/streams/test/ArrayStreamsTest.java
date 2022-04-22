package com.monocept.streams.test;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStreamsTest {

	public static void main(String[] args) {
		String[] names = { "Aditi", "Vishak", "Mary", "Vineet" };

		// CasteStudy1
//		Arrays.stream(names).forEach(ArrayStreamsTest::printDetails);
//		Arrays.stream(names).forEach(n -> System.out.println(n));
//		Arrays.stream(names).forEach(System.out::println);

//		// caseStudy2
//		Arrays.stream(names)
//		.filter(ArrayStreamsTest::namesWithA)
//		.sorted(ArrayStreamsTest::sortTheNames)
//		.map(ArrayStreamsTest::mappingFirstFourLetters)
//		.forEach(n -> System.out.println(n.toUpperCase()));
//		
		//caseStudy3
		
		Stream<String>	query = Arrays.stream(names)
		.filter(ArrayStreamsTest::namesWithA)
		.sorted(ArrayStreamsTest::sortTheNames)
		.map(ArrayStreamsTest::mappingFirstFourLetters);
		query.forEach(n -> System.out.println(n.toUpperCase()));
		query.forEach(n -> System.out.println(n.toUpperCase()));
		

	}
	public static String mappingFirstFourLetters(String name) {
		return name.substring(0, 4);
	}
	public static int sortTheNames(String n1, String n2) {
		return n2.compareTo(n1);
	}

	public static boolean namesWithA(String name) {
		return name.toLowerCase().contains("a");
	}

	public static void printDetails(String name) {

		System.out.println(name);
	}
}
