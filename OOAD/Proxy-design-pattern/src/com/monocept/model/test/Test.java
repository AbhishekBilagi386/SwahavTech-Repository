package com.monocept.model.test;

import com.monocept.model.Image;
import com.monocept.model.ProxyImage;
import com.monocept.model.RealImage;

public class Test {

	public static void main(String[] args) {
		Image img1 = new RealImage("one.jgp");
		Image img2 = new RealImage("two.jgp");
		Image img3 = new RealImage("three.jgp");
		img3.display();
		System.out.println();
		System.out.println("After Proxy Image");
		Image img4 = new ProxyImage("four.jgp");
		Image img5 = new ProxyImage("five.jgp");
		Image img6 = new ProxyImage("six.jgp");
		img6.display();
	}

}
