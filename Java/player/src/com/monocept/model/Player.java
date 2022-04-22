package com.monocept.model;

public class Player {
	private int id, age;
	private String name;

	public Player(int id, String name) {
		this(id, name, 18);
	}

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public Player whoIsElder(Player player) {
		if (this.age < player.age) {
			return player;
		}
		return this;
	}

}
