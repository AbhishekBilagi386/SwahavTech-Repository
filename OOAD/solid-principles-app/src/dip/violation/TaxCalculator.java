package dip.violation;

public class TaxCalculator {
	private LogType loggerType;

	public TaxCalculator(LogType log) {
		this.loggerType = log;
	}

	public int CalculateTax(int amt, int rate) {
		int result = 0;
		try {
			result = amt / rate;
		} catch (Exception e) {
			if (loggerType == LogType.DB) {
				DBLogger dbLog = new DBLogger();
				dbLog.log(e.getMessage());
			}
			if (loggerType == LogType.FILE) {
				FileLogger fileLog = new FileLogger();
				fileLog.log(e.getMessage());
			}
		}
		return result;
	}
}
