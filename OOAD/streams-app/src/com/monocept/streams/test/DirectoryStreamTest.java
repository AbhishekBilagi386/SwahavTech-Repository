package com.monocept.streams.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class DirectoryStreamTest {

	public static void main(String[] args) {
		final Path root = Paths.get("C:\\\\Program Files");
		// QUery1
		try {
			List<File> file = (List<File>) Files.list(root).map(x -> new File(x.toString()))
					.sorted((f1, f2) -> (int) (f2.length() - f1.length())).limit(5).collect(Collectors.toList());

			for (File p : file) {
				System.out.println(p + "\tFile Sie: " + p.length());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
