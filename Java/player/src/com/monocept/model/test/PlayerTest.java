package com.monocept.model.test;

import com.monocept.model.Player;

public class PlayerTest {

	public static void main(String[] args) {
		Player sachin = new Player(1, "Sachin", 45);
		Player virat = new Player(2, "virat", 50);
		Player elder = sachin.whoIsElder(virat);
		PrintDetails(sachin);
		System.out.println("-------");
		PrintDetails(virat);
		System.out.println("-------");
		PrintDetails(elder);
	}

	private static void PrintDetails(Player player) {
		System.out.println("id:" + player.getId());
		System.out.println("name:" + player.getName());
		System.out.println("age:" + player.getAge());
	}

}
