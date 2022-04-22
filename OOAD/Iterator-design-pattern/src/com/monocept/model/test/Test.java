package com.monocept.model.test;

import com.monocept.model.Iterator;
import com.monocept.model.NameRepository;

public class Test {

	public static void main(String[] args) {
		NameRepository repo = new NameRepository("Abhishek,Himanshu,Rohan,Vineet,Shikhar");

		Iterator iterator = repo.createIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
