package com.monocept.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MovieStore {
	String path = "Movie-Info.log";
	
	public void addMovies(String movieName, String genres, int year) throws IOException {
		int movieId = movieListLength();

		if (movieId < 5) {
			System.out.println();
			String movieInfo = "movieId: " + movieId + "\nmovieName: " + movieName + "\nGenre: " + genres
					+ "\nYear: " + year;
			BufferedWriter file = new BufferedWriter(new FileWriter(path, true));
			file.write(movieInfo + "\n");
			file.close();
		}
		if (movieId >= 5) {
			System.out.println("Sorry!! You Cant Add More");
		}
	}    

	public int movieListLength() throws FileNotFoundException {
		int movieCount = 0;
		File file = new File(path);
		Scanner Read = new Scanner(file);
		while (Read.hasNext()) {
			Read.nextLine();
			movieCount++;
		}

		return movieCount;
	}

	public void displayMovies() throws FileNotFoundException {
		File file = new File(path);
		Scanner myRead = new Scanner(file);
		while (myRead.hasNext())
			System.out.println(myRead.nextLine());
	}

	public void clearAll() throws IOException {
		FileWriter fw = new FileWriter(path);
		fw.write("");
		fw.close();
	}
}
