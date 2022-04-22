package com.monocept.streams.test;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileStreamsTest {

	public static void main(String[] args) throws Exception {
		// caseStudy1
		Path filePath = FileSystems.getDefault().getPath("name.txt");

		Files.lines(filePath)
		.forEach(FileStreamsTest::printDetails);
		
		//caseStudy2
		
		
	}

	public static void printDetails(String line) {
		System.out.println(line.toUpperCase());
	}
}
