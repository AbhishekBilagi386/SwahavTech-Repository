package com.monocept.model;

import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<Integer, String> tM = new TreeMap<Integer, String>();

		tM.put(1, "Abhishek");
		tM.put(2, "Himanshu");
		tM.put(3, "Rohan");
		tM.put(4, "Shikar");

		System.out.println(tM);
	}
}
