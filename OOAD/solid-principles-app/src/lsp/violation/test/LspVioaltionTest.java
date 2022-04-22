package lsp.violation.test;

import lsp.violation.Rectangle;
import lsp.violation.Square;

public class LspVioaltionTest {

	public static void main(String[] args) {
		shouldNotChangeWIdthIfHeightChanges(new Rectangle(10, 20));
		shouldNotChangeWIdthIfHeightChanges(new Square(30));
	}

	private static void shouldNotChangeWIdthIfHeightChanges(Rectangle rectangle) {
		int before = rectangle.getWidth();
		rectangle.setHeight(rectangle.getHeight() + 10);
		int after = rectangle.getWidth();
		System.out.println(before == after);
		System.out.println("Before: " + before + "After: " + after);

	}

}
