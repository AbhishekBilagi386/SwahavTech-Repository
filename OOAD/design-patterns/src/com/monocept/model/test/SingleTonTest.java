package com.monocept.model.test;

import com.monocept.model.DataService;

public class SingleTonTest {

	public static void main(String[] args) {
		// DataService obj = DataService.getInstance();
		Thread t1 = new Thread(() -> {
			DataService obj = DataService.getInstance();
			obj.printMessage();
			obj.doWork();
		});

		Thread t2 = new Thread(() -> {
			DataService obj1 = DataService.getInstance();
			obj1.printMessage();
			obj1.doWork();
		});
		t1.start();
		t2.start();
	}

}
