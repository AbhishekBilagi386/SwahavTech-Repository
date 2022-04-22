package dip.solution.test;

import dip.solution.DBLogger;
import dip.solution.FileLogger;
import dip.solution.ILogger;
import dip.solution.TaxCalculator;

public class DipSolutionTest {

	public static void main(String[] args) {
		TaxCalculator calc = new TaxCalculator(new DBLogger());
		System.out.println(calc.calculateTax(10, 2));
		System.out.println(calc.calculateTax(10, 0));
		System.out.println(calc.calculateTax(10, 5));
		System.out.println();
		
		//Using Lambda Expresion
		ILogger log = (String err) -> System.out.println("Error Logged" + err);
		calc = new TaxCalculator(log);
		System.out.println(calc.calculateTax(10, 0));
		
		TaxCalculator calc1 = new TaxCalculator(new FileLogger());
		System.out.println(calc1.calculateTax(10, 2));
		System.out.println(calc1.calculateTax(10, 0));
		System.out.println(calc1.calculateTax(10, 5));
		System.out.println();
		
		//Using Lambda Expression
		ILogger log1 = (String err) -> System.out.println("Error Logged" + err);
		calc = new TaxCalculator(log1);
		System.out.println(calc.calculateTax(10, 0));
	}

}
