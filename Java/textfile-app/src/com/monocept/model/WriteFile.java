package com.monocept.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteFile {
	public static void main(String[] args) throws Exception {
		String path = System.getProperty("user.dir") + "\\OneDrive\\Desktop\\SwabhavTechRepo\\Java\\textfile-app\\file.txt";
		String text = "Swabhav Tech";

		try {
			Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
		}
	}
}