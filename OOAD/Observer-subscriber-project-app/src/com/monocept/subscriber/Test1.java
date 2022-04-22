package com.monocept.subscriber;

import com.monocept.publisher.*;

public class Test1 {

	public static void main(String[] args) {
		Account acc1 = new Account(101, "Abhishek", 5000.0);
		acc1.deposit(1000.0);
		acc1.registerNotifier(new SmsNotifier());
		acc1.registerNotifier(new EmailNotifier());
		acc1.registerNotifier(new WhatsappNotifier());
		acc1.deposit(500.0);
	}

}
