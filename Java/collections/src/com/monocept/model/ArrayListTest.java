package com.monocept.model;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("Abhishek");
		list.add("Himanshu");
		list.add("Rohan");
		list.add("Shikar");
		list.remove("Himanshu");
		System.out.println(list);
		System.out.println();
		System.out.println("--After using iterator--");
		
		Iterator<String> itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  } 
	}
}
