package com.monocept.model;

import java.util.Iterator;

public class ListIterator implements Iterator<Node> {
	private Node head;

	public ListIterator(Node first) {
		head = first;
	}

	@Override
	public boolean hasNext() {
		return head != null;
	}

	@Override
	public Node next() {
		Node currentNode = head;
		head = head.getNextNode();
		return currentNode;
	}

}
