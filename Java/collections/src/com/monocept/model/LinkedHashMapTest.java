package com.monocept.model;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lHM = new LinkedHashMap<Integer, String>();

		lHM.put(1, "Abhishek");
		lHM.put(2, "Himanshu");
		lHM.put(3, "Rohan");
		lHM.put(4, "Shikar");

		System.out.println(lHM);
	}
}
