package dip.solution;

public class DBLogger implements ILogger {

	@Override
	public void log(String err) {
		System.out.println("Error Logged in database."+err);
	}
}
