package com.monocept.model;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> hM = new HashMap<Integer, String>();

		hM.put(1, "Abhishek");
		hM.put(2, "Himanshu");
		hM.put(3, "Rohan");
		hM.put(4, "Shikar");

		System.out.println(hM);
	}
}
