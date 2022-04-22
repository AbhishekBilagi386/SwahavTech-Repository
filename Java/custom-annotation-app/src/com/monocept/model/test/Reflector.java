package com.monocept.model.test;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import com.monocept.model.NeedToRefactor;

public class Reflector {

	public static void findAllMethodsNeedingRefactor(Class classname) {
		Method[] methods = classname.getMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(NeedToRefactor.class)) {
				System.out.println("Method: " + method.getName() + "\tMethod Type: " + method.getReturnType().getName()
						+ "\tMethod parameters: " + method.getClass().getTypeParameters());
				Parameter[] parameters = method.getParameters();
				for (Parameter parameter : parameters) {
					System.out.println(parameter.getType());
				}
				System.out.println();
			}
		}
	}

}
