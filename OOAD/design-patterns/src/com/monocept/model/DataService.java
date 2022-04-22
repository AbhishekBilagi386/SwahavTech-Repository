package com.monocept.model;

public class DataService extends Thread {
	private static DataService instance;

	private DataService() {
		System.out.println("Inside DataService...");
	}

	public static DataService getInstance() {
		if (instance == null) {
			instance = new DataService();
		}
		return instance;
	}

	public void printMessage() {
		System.out.println(instance.hashCode());
	}

	public void doWork() {
		System.out.println("doWork Method: " + this.hashCode());
	}
}
