package srp.solution.test;

import srp.solution.Invoice;
import srp.solution.InvoicePrinter;

public class SrpSolutionTest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice(1, "abc", 5000, 12, 20);
		InvoicePrinter ip = new InvoicePrinter();
		ip.printInvoice(invoice);
	}

}
