package srp.solution;

public class Invoice {
	private int id;
	private String description;
	private double amount;
	private float tax;
	private double discPercent;

	public Invoice(int id, String description, double amount, float tax, double discPercent) {
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
		this.discPercent = discPercent;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public double getAmount() {
		return amount;
	}

	public float getTax() {
		return tax;
	}

	public double getDiscPercent() {
		return discPercent;
	}

	public float calculateTax() {
		return (float) (amount * getTax() / 100);
	}

	public float calculateDisc() {
		return (float) (amount * getDiscPercent() / 100);
	}

	public double calculateTotal() {
		return amount + calculateTax() + calculateDisc();
	}

}
