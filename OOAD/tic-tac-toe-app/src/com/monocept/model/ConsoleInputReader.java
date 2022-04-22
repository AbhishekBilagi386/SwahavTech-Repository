package com.monocept.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputReader implements InputReader, AutoCloseable {
	private BufferedReader inputReader;

	public ConsoleInputReader() {
		inputReader = new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
	public String getUserInput(Player playerToGetInputFrom, String messagePrompt) {
		String userInput = null;
		System.out.println(messagePrompt);
		try {
			userInput = inputReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return userInput;
	}

	@Override
	public void close() {
		try {
			inputReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
