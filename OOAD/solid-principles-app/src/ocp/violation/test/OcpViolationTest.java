package ocp.violation.test;

import ocp.violation.FestivalType;
import ocp.violation.FixedDeposit;

public class OcpViolationTest {

	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit("Abhi",7000000,5,FestivalType.NORMAL);
		System.out.println("Simple Interest: "+fd.simpleInterest());
	}

}
