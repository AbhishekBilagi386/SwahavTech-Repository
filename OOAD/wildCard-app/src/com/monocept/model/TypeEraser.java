package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class TypeEraser {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Abhishek");
		names.add("monocept");
		
		List nums = names;
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		System.out.println(names);
		System.out.println(nums);
	}

}
