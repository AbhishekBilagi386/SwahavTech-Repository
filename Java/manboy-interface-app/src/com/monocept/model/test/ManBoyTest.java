package com.monocept.model.test;

import com.monocept.model.Boy;
import com.monocept.model.IEmotionable;
import com.monocept.model.IMannerable;
import com.monocept.model.Man;

public class ManBoyTest {

	public static void main(String[] args) {
		Man x = new Man();
		Boy y = new Boy();
		// atTheMovieHall(x);
		atThePartyHall(x);
		System.out.println();
		atTheMovieHall(y);
		System.out.println();
		atThePartyHall(y);
	}

	private static void atTheMovieHall(IEmotionable obj) {
		System.out.println("At The movies..");
		obj.cry();
		obj.laugh();
	}

	private static void atThePartyHall(IMannerable obj) {
		System.out.println("At The Party...");
		obj.wish();
		obj.depart();
	}

}
