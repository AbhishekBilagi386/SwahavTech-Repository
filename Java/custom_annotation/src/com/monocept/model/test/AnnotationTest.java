package com.monocept.model.test;

import java.lang.reflect.Field;
import java.util.Date;
import com.monocept.model.DBField;
import com.monocept.model.User;

public class AnnotationTest {

	public static void main(String[] args) throws Exception {
		System.out.println("Java Custom Annotation Example");
		System.out.println();

		User usr = new User();
		usr.setEmail("abhishekbilagi@gmail.com");
		usr.setName("Abhishek Bilagi");
		usr.setId(101);
		usr.setCreated(new Date());

		for (Field field : usr.getClass().getDeclaredFields()) {
			DBField dbField = field.getAnnotation(DBField.class);
			System.out.println("field name: " + dbField.name());

			field.setAccessible(true);
			Object value = field.get(usr);
			System.out.println("field value: " + value);

			System.out.println("field type: " + dbField.type());
			System.out.println("is primary: " + dbField.isPrimaryKey());
			System.out.println();
		}
	}
}
