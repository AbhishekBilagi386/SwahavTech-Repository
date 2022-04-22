package com.monocept.model;

public class Movie {
	private String name, genre;
	private int id, year;
	private static int counter;

	public Movie(String name, String genre, int year, int counter) {
		this.name = name;
		this.genre = genre;
		this.id = ++this.counter;
		this.year = year;
	}

	@NeedToRefactor
	public String getName() {
		return name;
	}

	@NeedToRefactor
	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	@NeedToRefactor
	public void setYear(int year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public static int getCounter() {
		return counter;
	}

	public int getId() {
		return id;
	}
}
