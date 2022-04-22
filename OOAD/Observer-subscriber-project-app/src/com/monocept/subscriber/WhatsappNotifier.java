package com.monocept.subscriber;

import com.monocept.publisher.*;
public class WhatsappNotifier implements INotifier {

	@Override
	public void notify(Account acc) {
		System.out.println("Message is Sent to: "+
				"Account Number: " +acc.getAccnum()+
				"Name: "+acc.getName()+
				"Account balance: "+acc.getBalance());	
	}

}
