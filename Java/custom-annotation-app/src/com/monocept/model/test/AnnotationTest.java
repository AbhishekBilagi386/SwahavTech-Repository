package com.monocept.model.test;

import com.monocept.model.Movie;


public class AnnotationTest {

	public static void main(String[] args) {
		Reflector.findAllMethodsNeedingRefactor(Movie.class);
	}

}
