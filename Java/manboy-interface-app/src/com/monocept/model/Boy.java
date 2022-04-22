package com.monocept.model;

public class Boy implements IMannerable, IEmotionable {

	@Override
	public void cry() {
		System.out.println("Baby Cries");
	}

	@Override
	public void laugh() {
		System.out.println("Baby Laughs");
	}

	@Override
	public void wish() {
		System.out.println("Baby Wishes");
	}

	@Override
	public void depart() {
		System.out.println("Baby Departs");
	}

}
