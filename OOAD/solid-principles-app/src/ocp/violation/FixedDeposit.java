package ocp.violation;

public class FixedDeposit {
	private String name;
	private double principal;
	private int duration;
	private FestivalType festival;

	public FixedDeposit(String name, double principle, int duration, FestivalType festival) {
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

	public FestivalType getFestival() {
		return festival;
	}

	public float calculateRate() {
		if (festival == FestivalType.NORMAL)
			return 7f;
		if (festival == FestivalType.EID)
			return 8f;
		return 9f;

	}

	public double simpleInterest() {
		return (principal * calculateRate() / 100) * duration;
	}
}
