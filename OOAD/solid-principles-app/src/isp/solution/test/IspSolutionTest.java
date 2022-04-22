package isp.solution.test;

import isp.solution.IEat;
import isp.solution.IWork;
import isp.solution.Manager;
import isp.solution.Robot;

public class IspSolutionTest {

	public static void main(String[] args) {
		Manager m = new Manager();
		Robot r = new Robot();

		atTheWorkStation(m);
		System.out.println();
		atTheWorkStation(r);
		System.out.println();

		atTheCafetaria(m);
		System.out.println();
		//atTheCafetaria(r);
	}

	private static void atTheCafetaria(IEat obj) {
		System.out.println("At The Cafetaria");
		obj.startEat();
		obj.stopEat();
	}

	private static void atTheWorkStation(IWork obj) {
		System.out.println("At The WorkStation");
		obj.startWork();
		obj.stopWork();
	}
}
