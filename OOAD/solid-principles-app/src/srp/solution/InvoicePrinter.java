package srp.solution;

public class InvoicePrinter {

	public void printInvoice(Invoice invoice) {
		System.out.println("Invoice Id: " + invoice.getId());
		System.out.println("Description: " + invoice.getDescription());
		System.out.println("Amount: " + invoice.getAmount());
		System.out.println("Tax: " + invoice.calculateTax());
		System.out.println("Discount : " + invoice.calculateDisc());
		System.out.println("Total: " + invoice.calculateTotal());
	}

}
