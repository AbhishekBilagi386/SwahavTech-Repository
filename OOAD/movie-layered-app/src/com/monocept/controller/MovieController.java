package com.monocept.controller;

import java.io.IOException;
import java.util.Scanner;

import com.monocept.model.Movie;
import com.monocept.service.MovieManager;

public class MovieController {
	public void start() throws IOException {
		System.out.println("Welcome to the movie app developed by @Abhishek Bilagi.");
		displayMenu();
	}

	private void displayMenu() throws IOException {
		Scanner sc = new Scanner(System.in);
		int choice;

		while (true) {
			System.out.println("\n1.Add Movie\n" + "2.Display Movie\n" + "3.Clear All Movies\n" + "4.Exit Store");

			System.out.println("Enter your Choice: ");
			choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("Enter the movie name");
				String name = sc.next();
				System.out.println("Enter movie Genre");
				String genre = sc.next();
				System.out.println("Enter movie year");
				int year = sc.nextInt();

				Movie movie = new Movie(name, genre, year);

				MovieManager mov = new MovieManager();
				mov.addMovie(movie);
			}
			if (choice == 2) {
				MovieManager mov = new MovieManager();

				if (mov.getMovies() != null)
					for (Movie movie : mov.getMovies()) {
						if (movie != null) {
							System.out.println("Name:" + movie.getName() + "\nGenre: " + movie.getGenre() + "\nYear: "
									+ movie.getYear() + "\n");
						}
					}
			}
			if (choice == 3) {
				MovieManager mov = new MovieManager();
				mov.clearMovies();
			}
			if (choice == 4) {
				break;
			}

		}
	}
}
