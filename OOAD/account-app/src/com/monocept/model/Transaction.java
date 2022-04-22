package com.monocept.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicInteger;

public class Transaction {
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1001);
	private int Tid;
	private double Tamount;
	private String datetime;
	private TransactionType transactionType;
	
	public Transaction(double amount) {
		Tid = ID_GENERATOR.getAndIncrement();
		this.Tamount = amount;
	}

	public Transaction(double amount, TransactionType deposit) {
		Tid = ID_GENERATOR.getAndIncrement();
		this.Tamount = amount;
		this.transactionType = deposit;
	}

	public String getDatetime() {
		DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss. zzz");
		LocalDateTime now = LocalDateTime.now();
		this.datetime = dateTime.format(now);
		return getDatetime();
	}

	public int getTid() {
		return Tid;
	}
	
	@Override
	public String toString() {
		return "Transaction id: " + Tid + " Transaction amount: " + Tamount + " TransactionType: " +getTransactionType();
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}


}
