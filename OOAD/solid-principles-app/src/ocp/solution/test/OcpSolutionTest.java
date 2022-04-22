package ocp.solution.test;

import ocp.solution.FixedDeposit;
import ocp.solution.HoliRate;
import ocp.solution.IFestivalRate;
import ocp.solution.NormalRate;

public class OcpSolutionTest {

	public static void main(String[] args) {
		FixedDeposit fd1 = new FixedDeposit("ABC", 5000, 3, new HoliRate());
		System.out.println("Fd1 implementation: " + fd1.simpleInterest());

		FixedDeposit fd2 = new FixedDeposit("ABC", 5000, 3, () -> {
			System.out.println("Diwali Season");
			return 15f;
		});
		System.out.println("Fd2 implementaion: " + fd2.simpleInterest());

		FixedDeposit fd3 = new FixedDeposit("ABC", 5000, 3, OcpSolutionTest::ramzanFestival);
		System.out.println("Fd3 implementation: " + fd3.simpleInterest());
	}

	static float ramzanFestival() {
		System.out.println("Ramzan Season");
		return 12f;
	}
}
