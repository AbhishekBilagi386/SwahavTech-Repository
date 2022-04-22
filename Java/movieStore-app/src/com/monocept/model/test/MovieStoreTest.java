package com.monocept.model.test;

import java.util.Scanner;

import com.monocept.model.MovieStore;

public class MovieStoreTest {

	public static void main(String[] args) throws Exception {
		MovieStore ms = new MovieStore();
		System.out.println("Welcome to Movie Store App" + "@Developed by: Abhishek Bilagi.");
		
		while (true) {
			System.out.println(ms.movieListLength());
			System.out.println("1. Add Movie");
			System.out.println("2. Display Movies");
			System.out.println("3. Clear all Movies");
			System.out.println("4. exit");
			
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
			
			if (choice == 1) {
				System.out.println("Enter the movie name: ");
				String movieName = scan.next();

				System.out.println("Enter the type/Genre: ");
				String genre = scan.next();

				System.out.println("Enter released year:");
				int year = scan.nextInt();

				ms.addMovies(movieName, genre, year);
			}
			if (choice == 2) {
				ms.displayMovies();
				System.out.println("  ");
				System.out.println("  ");
				System.out.println("  ");
				System.out.println("  ");
				System.out.println("  ");
			}
			if (choice == 3) {
				ms.clearAll();
				System.out.println("All Clear");
				System.out.println("0 movies left.");
			}
			if (choice == 4) {
				System.out.println("Exit");
				break;
			}

		}
	}
}
