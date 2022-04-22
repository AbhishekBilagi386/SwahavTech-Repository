package com.monocept.subscriber;

import com.monocept.publisher.Account;
import com.monocept.publisher.INotifier;

public class EmailNotifier implements INotifier{

	@Override
	public void notify(Account acc) {
		System.out.println("Mail is Sent to: "+
				"Account Number: " +acc.getAccnum()+
				"Name: "+acc.getName()+
				"Account balance: "+acc.getBalance());
	}

}
