package dip.solution;

public class TaxCalculator {
	private ILogger logType;

	public TaxCalculator(ILogger log) {
		this.logType = log;
	}

	public int calculateTax(int amt, int rate) {
		int result = 0;
		try {
			result = amt / rate;
		} catch (Exception e) {
			
			logType.log(" Because we cant divide by Zero.");
		}
		return result;
	}
}
