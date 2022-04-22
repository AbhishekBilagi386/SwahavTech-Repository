package com.monocept.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.NegativeValueNotAllowed;
import com.monocept.model.OddEvenGeneretor;

class OddEvenGeneratorTest {

	@Test
	void getEvenNosTillMethodShouldNotREturnNull() {
		OddEvenGeneretor generator = new OddEvenGeneretor();
		int[] result = generator.getEvenNosTill(10);
		assertNotNull(result);
		
	}

	@Test
	void getEvenNosTillShouldGeneratesEvenNoForInput10() {
		int expectedEvenNoSize = 5;
		int[] expectedEvenNos = { 2, 4, 6, 8, 10 };
		OddEvenGeneretor generator = new OddEvenGeneretor();
		int[] evenNos = generator.getEvenNosTill(10);
		assertTrue(evenNos.length == expectedEvenNoSize);

	}

	@Test
	void getEvenNosTillShouldGeneratesEvenNoForInput20() {
		int expectedEvenNoSize1 = 10;
		int[] expectedEvenNos1 = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		OddEvenGeneretor generator = new OddEvenGeneretor();
		int[] evenNos = generator.getEvenNosTill(20);
		assertArrayEquals(evenNos, expectedEvenNos1);

	}

	@Test
	void getOddNosTillMethodShouldNotREturnNull() {
		OddEvenGeneretor generator = new OddEvenGeneretor();
		int[] result = generator.getOddNosTill(10);
		assertNotNull(result);
	}

	@Test
	void getOddNosTillShouldGeneratesEvenNoForInput10() {
		int expectedOddNoSize = 5;
		int[] expectedOddNos = { 1, 3, 5, 7, 9};
		OddEvenGeneretor generator = new OddEvenGeneretor();
		int[] oddNos = generator.getOddNosTill(10);
		assertTrue(oddNos.length == expectedOddNoSize);

	}

	@Test
	void getOddNosTillShouldGeneratesEvenNoForInput20() {
		int expectedOddNoSize1 = 10;
		int[] expectedOddNos1 = { 1, 3, 5, 7, 9,11,13,15,17,19 };
		OddEvenGeneretor generator = new OddEvenGeneretor();
		int[] oddNos = generator.getOddNosTill(20);
		assertArrayEquals(oddNos, expectedOddNos1);

	}
	@Test
	void shouldThrowNotNegativeExceptionFromGetEvenNo() {
		OddEvenGeneretor generator = new OddEvenGeneretor();
		assertThrows(NegativeValueNotAllowed.class,()->generator.getOddNosTill(-10));
	}
}
