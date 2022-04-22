package com.monocept.model.test;

import com.monocept.model.CustomLinkedList;
import com.monocept.model.Node;

public class Test {

	public static void main(String[] args) {
		CustomLinkedList list = new CustomLinkedList();
		System.out.println("Custom Linked List");
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.display();
		System.out.println("After deleting");
		list.deleteNodeAt(2);
		list.display();

		System.out.println("After Iterating");
		for (Node node : list) {
			System.out.println(node.getData());
		}
	}
}
