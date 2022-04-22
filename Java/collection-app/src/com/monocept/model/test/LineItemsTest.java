package com.monocept.model.test;

import java.util.ArrayList;

import com.monocept.model.LineItem;

public class LineItemsTest {

	public static void main(String[] args) {
		ArrayList<LineItem> list = new ArrayList<LineItem>();
		list.add(new LineItem(101,"Cinthol",2,45));
		list.add(new LineItem(102,"Dettol",6,40));
		list.add(new LineItem(103,"Colgate",3,52));
		
		//list.add("Monocept");
		
		for(Object obj : list) {
			System.out.println(obj.toString());
			System.out.println("..........");
		}
		
	}



}
