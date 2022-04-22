package com.monocept.model.test;

import java.util.*;

import com.monocept.model.LineItem;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<LineItem> hs = new HashSet<LineItem>();

		hs.add(new LineItem(101, "Cinthol", 2, 45));
		hs.add(new LineItem(102, "Dettol", 6, 40));
		
		hs.add(new LineItem(101, "Cinthol", 3, 45));
		

		for (Object obj : hs) {
			System.out.println(obj);
		System.out.println("..........");
		}
	}

}
