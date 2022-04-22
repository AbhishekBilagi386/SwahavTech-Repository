package com.monocept.model.test;

import com.monocept.model.Boy;
import com.monocept.model.Infant;
import com.monocept.model.Kid;
import com.monocept.model.Man;

public class ManBoyTest {

	public static void main(String[] args) {
		System.out.println("Abhishek's code");
		new Boy().play();
		
	//	caseStudy4();
//		caseStudy1();
//		System.out.println("caseStudy1 over");
//		System.out.println();
//		caseStudy2();
//		System.out.println("caseStudy2 over");
//		System.out.println();
//		caseStudy3();
//		System.out.println("caseStudy3 over");
//		System.out.println();
//		caseStudy4();
//		System.out.println("caseStudy4 over");
//		System.out.println();
//		caseStudy5();
//		System.out.println("caseStudy5 over");
	}
	
	private static void caseStudy5() {
		Object x;
		x = 10;
		System.out.println(x.getClass());
		x = 10.55f;
		System.out.println(x.getClass());
		x = (10>5);
		System.out.println(x.getClass());
		x = "Hello Abhi";
		System.out.println(x.getClass());
		x = new Man();
		System.out.println(x.getClass());
	}

	private static void caseStudy4() {
		//atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		//atThePark(new Infant());
	}

	private static void atThePark(Man m) {
		System.out.println("At The Park");
		//System.out.println(m.getClass());
		m.play();
	}

	private static void caseStudy3() {
		Man x;
		x = new Boy();
		x.read();
		x.play();
	}

	private static void caseStudy2() {
		Boy y;
		y = new Boy();
		y.play();
		y.eats();
		y.read();
	}
	private static void caseStudy1() {
		Man x;
		x = new Man();
		x.read();
		x.play();
	}
	

}
