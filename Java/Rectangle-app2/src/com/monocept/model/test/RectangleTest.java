package com.monocept.model.test;

import java.lang.reflect.Method;

import com.monocept.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		try {
			Class<Rectangle> classobj = Rectangle.class;
			Method[] methods = classobj.getMethods();
			int count = 0;
			for (Method c : methods) {
				String sc = c.getName();
				for (Method cc : methods) {
					if (sc.equals(cc.getName())) {
						count++;
					}
				}
				System.out.println("Name of the getter: ");
				for (Method name : methods) {
					if (name.getName().startsWith("get"))
						System.out.println(name.getName() + " ");
				}
				System.out.println("Name of the setter: ");
				for (Method name : methods) {
					if (name.getName().startsWith("set"))
						System.out.println(name.getName() + " ");
				}
				System.out.println("method name: " + sc);
				System.out.println("Total number of methods: " + count);
				count = 0;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
