package ocp.solution;

public class FixedDeposit {
	private String name;
	private double principal;
	private int duration;
	private IFestivalRate festival;

	public FixedDeposit(String name, double principle, int duration, IFestivalRate festival) {
		this.name = name;
		this.principal = principle;
		this.duration = duration;
		this.festival = festival;
	}

	public String getName() {
		return name;
	}

	public double getPrincipal() {
		return principal;
	}

	public int getDuration() {
		return duration;
	}

	public IFestivalRate getFestival() {
		return festival;
	}

	public double simpleInterest() {
		return (principal * festival.calculateRate() / 100) * duration;
	}
}
