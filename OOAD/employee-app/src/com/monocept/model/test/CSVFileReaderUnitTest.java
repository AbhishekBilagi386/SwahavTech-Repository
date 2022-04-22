package com.monocept.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.CSVFileReader;

class CSVFileReaderUnitTest {
	@Test
	void getValueShouldReturnValueInputTest() {
		CSVFileReader read = new CSVFileReader("data.csv");
		String expect = "BLAKE";
		String check = read.check("BLAKE");
		assertTrue(check.equals(expect));
	}

	@Test
	void getValueShouldReturn0ForInputNulltest() {
		CSVFileReader read = new CSVFileReader(null);
		String expect = "0";
		String check = read.check("NULL");
		assertTrue(check.equals(expect));
	}

}
