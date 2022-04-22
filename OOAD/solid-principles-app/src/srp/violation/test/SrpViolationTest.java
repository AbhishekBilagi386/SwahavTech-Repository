package srp.violation.test;

import srp.violation.Invoice;

public class SrpViolationTest {

	public static void main(String[] args) {
		Invoice in = new Invoice(1, "Abc", 50, 12, 20);
		in.printInvoice();
	}

}
