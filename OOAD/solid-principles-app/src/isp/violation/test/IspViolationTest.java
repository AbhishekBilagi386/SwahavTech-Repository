package isp.violation.test;

import isp.violation.IWorker;
import isp.violation.Manager;
import isp.violation.Robot;

public class IspViolationTest {

	public static void main(String[] args) {
		Manager m = new Manager();
		Robot r = new Robot();

		atTheWorkStation(m);
		System.out.println();
		atTheWorkStation(r);
		System.out.println();

		atTheCafetaria(m);
		System.out.println();
		atTheCafetaria(r);
	}

	private static void atTheCafetaria(IWorker obj) {
		System.out.println("At The Cafetaria");
		obj.startEat();
		obj.stopEat();
	}

	private static void atTheWorkStation(IWorker obj) {
		System.out.println("At The WorkStation");
		obj.startWork();
		obj.stopWork();
	}

}
