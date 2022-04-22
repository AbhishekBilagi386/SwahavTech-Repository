package com.monocept.model.test;

import java.util.function.IntFunction;
import java.util.function.Predicate;

import com.monocept.model.AddOperation;
import com.monocept.model.IMathOperation;

public class MathOperationTest {

	public static void main(String[] args) {
		IntFunction<Long> x2;
		Predicate<Integer> x3;
		
		x3 = MathOperationTest::EvenNum;
		System.out.println("Even: "+x3.test(4));
		// class
		AddOperation x = new AddOperation();
		System.out.println("Addition: " + x.doOperation(10, 2));

		System.out.println("-----------");
		// Anonymous Class

		IMathOperation x1 = new IMathOperation() {
			@Override
			public long doOperation(int a, int b) {
				return a - b;
			}
		};
		System.out.println("Subtraction: " + x1.doOperation(10, 5));
		System.out.println("------------");

		// lambda
		x1 = (n1, n2) -> n1 * n2;
		System.out.println("Multiplication: " + x1.doOperation(10, 5));
		System.out.println("-----------");

		// Method Reference
		x1 = MathOperationTest::divOperation;
		System.out.println("Division: " + x1.doOperation(10, 5));
		
		x2 = MathOperationTest::cubeAnEvenNo;
		System.out.println("Cube: " + x2.apply(10));
		System.out.println("----------");
		
		
	}
		
	public static int divOperation(int a, int b) {
		return a / b;
	}
	
	public static long cubeAnEvenNo(int a) {
		if (a % 2 == 0)
			return a * a * a;
		return a;
	}

	public static boolean EvenNum(int a) {
		return (a % 2 == 0) ? true : false;
	}
}
