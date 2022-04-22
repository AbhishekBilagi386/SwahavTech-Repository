package com.monocept.streams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DirectoryStreamTest {

	public static void main(String[] args) {
		String rootDir = "C:\\Program Files";
		 
        try {
            try (Stream<Path> paths = Files.find(Paths.get(rootDir),
                                                Integer.MAX_VALUE,
                                        (path, file) -> file.isRegularFile())) {
                paths.forEach(System.out::println);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
