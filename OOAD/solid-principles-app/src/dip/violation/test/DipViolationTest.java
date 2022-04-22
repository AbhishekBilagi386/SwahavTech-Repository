package dip.violation.test;

import dip.violation.LogType;
import dip.violation.TaxCalculator;

public class DipViolationTest {

	public static void main(String[] args) {
		TaxCalculator calc = new TaxCalculator(LogType.FILE);
		System.out.println(calc.CalculateTax(10, 2));
		System.out.println(calc.CalculateTax(10, 0));
		System.out.println(calc.CalculateTax(10, 5));
		System.out.println();
		TaxCalculator calc1 = new TaxCalculator(LogType.DB);
		System.out.println(calc1.CalculateTax(10, 2));
		System.out.println(calc1.CalculateTax(10, 0));
		System.out.println(calc1.CalculateTax(10, 5));
	}

}
