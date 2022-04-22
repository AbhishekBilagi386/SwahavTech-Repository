package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class WildCardToUpperBound {

	public static void main(String[] args) {
		
//		List<Integer> nums = new ArrayList<Integer>();
//		nums.add(10);
//		nums.add(20);
//		nums.add(30);
//		System.out.println("Integer List: " + nums);
//		List<Double> nums1 = new ArrayList<Double>();
//		nums1.add(10.0);
//		nums1.add(20.0);
//		nums1.add(30.55);
//		System.out.println("Double Number:");
//		printDetails(nums1);

		List<Number> numsList = new ArrayList<Number>();
		addNumbersToList(numsList, 10);
		addNumbersToList(numsList, 20.55f);
		System.out.println("numbers List: " + numsList);

		List<Object> objectList = new ArrayList<Object>();
		addNumbersToList(objectList, 30);
		addNumbersToList(objectList, 40.55);
		System.out.println("super type: " + objectList);

	}
//
//	private static void printDetails(List<Double> nums1) {
//		nums1.forEach(System.out::println);
//		System.out.println(nums1.get(0));
//	}

	static void addNumbersToList(List< ? super Number> values, Number nums) {
		values.add(nums);
		System.out.println(values.get(0));
	}

}
