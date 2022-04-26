package com.monocept.controller;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.monocept.service.MovieManager;

public class MovieControllerUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton AddMovie;
	private JButton DisplayMovie;
	private JButton ClearMovies;
	private JFrame frame;
	private JPanel panel;
	private JFrame displayFrame;

	public void start() throws IOException {
		System.out.println("Welcome to the movie app developed by @Abhishek Bilagi.");
		displayMenu();
	}

	private void displayMenu() throws IOException {
		MovieManager mov = new MovieManager();
		mov.clearMovies();
		frame = new JFrame("Movie Store");
		AddMovie = new JButton("Add Movie");
		DisplayMovie = new JButton("Display");
		ClearMovies = new JButton("Clear movies");
		panel = new JPanel();
		displayFrame = new JFrame("Movies Saved");
		
		ActionListener add = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame addFrame = new JFrame("Movies");

				JLabel name = new JLabel("Enter movie Name: ");
				JTextField nameInput = new JTextField(30);

				addFrame.add(name);
				addFrame.add(nameInput);

				JLabel genre = new JLabel("Enter genre: ");
				JTextField genreInput = new JTextField(30);

				addFrame.add(genre);
				addFrame.add(genreInput);

				JLabel year = new JLabel("Enter Year: ");
				JTextField yearInput = new JTextField(30);

				addFrame.add(year);
				addFrame.add(yearInput);

				addFrame.setLayout(new FlowLayout());
				addFrame.setSize(500, 500);
				addFrame.setDefaultCloseOperation(HIDE_ON_CLOSE);
				addFrame.setVisible(true);
			}

		};
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

}
