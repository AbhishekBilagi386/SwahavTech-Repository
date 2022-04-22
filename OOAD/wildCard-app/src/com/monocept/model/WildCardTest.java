package com.monocept.model;

import java.util.Arrays;
import java.util.List;

public class WildCardTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("hello", "World", "From India");
		printDetails(names);

		List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);
		printDetails(nums);
		
		List<?> someSpecificType = names;
		System.out.println(someSpecificType);
		
		List<?> someSpecificType1 = nums;
		System.out.println(someSpecificType1);

	}

	private static void printDetails(List<?> items) {
		items.forEach(System.out::println);
		System.out.println(items.get(1));
	}

}
