package com.monocept.model;

import java.io.FileInputStream;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		FileInputStream inputStream = new FileInputStream("file1.txt");
		try {
			ReadFile.toString(inputStream);
		} finally {
			inputStream.close();
		}
		System.out.println("Reading Completed");
	}

	private static String toString(FileInputStream inputStream) {
	
		return null;
	}
	}

